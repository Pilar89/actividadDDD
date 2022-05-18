package co.com.sofkau.logisticaYDistribucion.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.logisticaYDistribucion.pedido.Pedido;

public class PedidoCreado extends DomainEvent {


    private final Pedido pedido;

    public PedidoCreado(Pedido pedido) {
        super("co.com.sofkau.factura.events.PedidoAgregado");
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }
}
