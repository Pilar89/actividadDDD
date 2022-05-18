package co.com.sofkau.logisticaYDistribucion.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.logisticaYDistribucion.pedido.values.PedidoId;

public class EstadoActualizado extends DomainEvent {
    private final PedidoId pedidoId;
    private final Estado estado;

    public EstadoActualizado(PedidoId pedidoId, Estado estado) {
        super("co.com.sofkau.generic.values.Estado");
        this.pedidoId = pedidoId;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
    public PedidoId getEntityId() {
        return pedidoId;
    }
}
