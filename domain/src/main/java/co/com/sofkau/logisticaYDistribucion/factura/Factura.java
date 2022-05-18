package co.com.sofkau.logisticaYDistribucion.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.generic.values.Fecha;
import co.com.sofkau.logisticaYDistribucion.factura.events.EstadoActualizado;
import co.com.sofkau.logisticaYDistribucion.factura.values.CostoPedido;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.logisticaYDistribucion.factura.values.FacturaId;
import co.com.sofkau.logisticaYDistribucion.pedido.Cliente;
import co.com.sofkau.logisticaYDistribucion.pedido.Pedido;
import co.com.sofkau.logisticaYDistribucion.pedido.Vendedor;
import co.com.sofkau.logisticaYDistribucion.pedido.events.PedidoCreado;
import co.com.sofkau.logisticaYDistribucion.pedido.values.PedidoId;

import java.util.List;

public class Factura extends AggregateEvent<FacturaId>{
    protected Fecha fecha;
    protected Estado estado;
    protected CostoPedido costoTotal;
    protected List<Pedido> pedidos;
    protected Cliente cliente;
    protected Vendedor vendedor;

    public Factura(FacturaId entityId) {
        super(entityId);
    }

    public Factura(FacturaId facturaId, Fecha fecha, Estado estado, CostoPedido costoTotal, List<Pedido> pedidos, Cliente cliente, Vendedor vendedor) {
        super(facturaId);
        this.fecha = fecha;
        this.estado = estado;
        this.costoTotal = costoTotal;
        this.pedidos = pedidos;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public void agregarPedido (PedidoId pedidoId, Cliente cliente, Vendedor vendedor, Fecha fecha, Estado estado) {
        appendChange(new PedidoCreado(cliente, vendedor, fecha, estado));
    }

    public void cambiarEstado(FacturaId facturaId, Estado estado){
        appendChange(new EstadoActualizado(facturaId, estado)).apply();
    }

    public void calcularCostoTotal(FacturaId facturaId , CostoPedido costoTotal){
        appendChange(new EstadoActualizado(facturaId, estado)).apply();
    }

}
