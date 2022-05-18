package co.com.sofkau.logisticaYDistribucion.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.generic.Cliente;
import co.com.sofkau.generic.Vendedor;
import co.com.sofkau.generic.values.Fecha;
import co.com.sofkau.logisticaYDistribucion.factura.events.EstadoActualizado;
import co.com.sofkau.logisticaYDistribucion.factura.events.FacturaAgregada;
import co.com.sofkau.logisticaYDistribucion.factura.events.PedidoEliminado;
import co.com.sofkau.logisticaYDistribucion.factura.values.CostoTotalPedidos;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.logisticaYDistribucion.factura.values.FacturaId;
import co.com.sofkau.logisticaYDistribucion.pedido.Pedido;
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

    public Factura(FacturaId entityId, Fecha fecha, Estado estado, Cliente cliente) {
        super(entityId);
        appendChange(new FacturaAgregada(fecha, estado, cliente)).apply();
        subscribe(new FacturaEventChange(this));
    }

    //comportamientos

    public void cambiarEstado(FacturaId facturaId, Estado estado){
        appendChange(new EstadoActualizado(facturaId, estado)).apply();
    }

    public void agregarPedido (Pedido pedidoId, Cliente cliente, Vendedor vendedor, Fecha fecha, Estado estado) {
        appendChange(new PedidoCreado(cliente, vendedor, fecha, estado));
    }

    public void eliminarPedido(PedidoId pedidoId){
        appendChange(new PedidoEliminado(pedidoId)).apply();
    }


}
