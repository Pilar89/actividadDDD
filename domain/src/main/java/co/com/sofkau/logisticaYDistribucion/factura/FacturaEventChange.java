package co.com.sofkau.logisticaYDistribucion.factura;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.logisticaYDistribucion.factura.events.FacturaAgregada;
import co.com.sofkau.logisticaYDistribucion.factura.events.PedidoCreado;
import co.com.sofkau.logisticaYDistribucion.factura.events.PedidoEliminado;
import co.com.sofkau.logisticaYDistribucion.pedido.events.EstadoActualizado;

import java.util.HashMap;

public class FacturaEventChange extends EventChange {

    public FacturaEventChange(Factura factura){

        apply((FacturaAgregada event)-> {
            factura.fecha = event.getFecha();
            factura.cliente = event.getCliente();
            factura.estado = event.getEstado();
            factura.costoTotalPedidos = event.getCostoTotal();
            factura.pedidos = new HashMap<>();
        });


        apply((PedidoCreado event) -> {
            var pedidoId = event.getPedido();
            var pedido = new PedidoCreado(pedidoId);
        });

        apply((PedidoEliminado event) -> {
            var pedidoId = event.getPedidoId();
            var pedidoEliminado = factura.pedidos.remove(pedidoId);
        });

        apply((EstadoActualizado event) -> {
            var facturaId = event.getEntityId();
            var estadoActualizado = event.getEstado().value();
            var estado = new Estado(estadoActualizado);
            factura.estado = estado;
        });

    }
}
