package co.com.sofkau.logisticaYDistribucion.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.logisticaYDistribucion.pedido.Pedido;
import co.com.sofkau.logisticaYDistribucion.pedido.values.PedidoId;

public class PedidoAgregado extends DomainEvent {


    private final PedidoId pedidoId;
    private final Pedido pedido;

    public PedidoAgregado(PedidoId pedidoId, Pedido pedido) {
        super("co.com.sofkau.factura.events.PedidoAgregado");
        this.pedidoId = pedidoId;
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public PedidoId getPedidoId() { return pedidoId; }
}
