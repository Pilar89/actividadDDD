package co.com.sofkau.logisticaYDistribucion.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.logisticaYDistribucion.pedido.values.PedidoId;

public class PedidoEliminado extends DomainEvent {

    private final PedidoId pedidoId;


    public PedidoEliminado(PedidoId pedidoId) {
        super("co.com.sofkau.factura.events.PedidoEliminado");
        this.pedidoId = pedidoId;
    }

    public PedidoId getPedidoId() {
        return pedidoId;
    }
}
