package co.com.sofkau.logisticaYDistribucion.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.generic.values.Fecha;
import co.com.sofkau.logisticaYDistribucion.factura.events.CostoCalculado;
import co.com.sofkau.logisticaYDistribucion.factura.events.EstadoActualizado;
import co.com.sofkau.logisticaYDistribucion.factura.values.CostoTotalPedidos;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.logisticaYDistribucion.factura.values.FacturaId;
import co.com.sofkau.logisticaYDistribucion.pedido.Cliente;
import co.com.sofkau.logisticaYDistribucion.pedido.Pedido;
import co.com.sofkau.logisticaYDistribucion.pedido.Vendedor;
import co.com.sofkau.logisticaYDistribucion.pedido.events.PedidoCreado;
import co.com.sofkau.logisticaYDistribucion.pedido.values.PedidoId;

import java.util.List;
import java.util.Map;

public class Factura extends AggregateEvent<FacturaId>{
    protected Fecha fecha;
    protected Estado estado;
    protected Cliente cliente;
    protected CostoTotalPedidos costoTotalPedidos;
    protected Map<PedidoId,Pedido> pedidos;


    public Factura(FacturaId entityId) {
        super(entityId);
    }

    public Factura(FacturaId facturaId, Fecha fecha, Estado estado,
                   CostoTotalPedidos costoTotalPedidos, Map<PedidoId,Pedido> pedidos, Cliente cliente) {
        super(facturaId);
        this.fecha = fecha;
        this.estado = estado;
        this.costoTotalPedidos = costoTotalPedidos;
        this.pedidos = pedidos;
        this.cliente = cliente;
    }

    //comportamientos

    public void cambiarEstado(FacturaId facturaId, Estado estado){
        appendChange(new EstadoActualizado(facturaId, estado)).apply();
    }

    public void agregarPedido (PedidoId pedidoId, Cliente cliente, Vendedor vendedor, Fecha fecha, Estado estado) {
        appendChange(new PedidoCreado(cliente, vendedor, fecha, estado));
    }

    public void calcularCostoTotal(CostoTotalPedidos costoTotalPedidos){
        appendChange(new CostoCalculado(costoTotalPedidos)).apply();
    }

}
