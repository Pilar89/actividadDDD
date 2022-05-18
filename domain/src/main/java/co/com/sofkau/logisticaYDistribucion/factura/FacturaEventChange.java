package co.com.sofkau.logisticaYDistribucion.factura;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.logisticaYDistribucion.factura.events.FacturaAgregada;
import co.com.sofkau.logisticaYDistribucion.factura.events.PedidoAgregado;
import co.com.sofkau.logisticaYDistribucion.factura.events.PedidoEliminado;
import co.com.sofkau.logisticaYDistribucion.pedido.events.EstadoActualizado;

import java.util.HashMap;

public class FacturaEventChange extends EventChange {

    public FacturaEventChange(Factura factura){

        apply((FacturaAgregada event)-> {
            factura.fecha = event.getFecha();
            factura.cliente = event.getCliente();
            factura.estado = event.getEstado();
            factura.pedidos = new HashMap<>();
        });


        apply((PedidoAgregado event) -> {
            var pedidoId = event.getPedidoId();
            var pedido = event.getPedido();
            factura.pedidos.put(pedidoId, pedido);
            factura.costoTotalPedidos.aumentar(pedido.getCostoTotal().value());
        });

        apply((PedidoEliminado event) -> {
            var pedidoId = event.getPedidoId();
            var pedidoEliminado = factura.pedidos.remove(pedidoId);
            factura.costoTotalPedidos.disminuir(pedidoEliminado.getCostoTotal().value());
        });

        apply((EstadoActualizado event) -> {
            var facturaId = event.getEntityId();
            var estadoActualizado = event.getEstado().value();
            factura.estado = new Estado(estadoActualizado);
        });

    }
}
