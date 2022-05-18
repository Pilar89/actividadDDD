package co.com.sofkau.logisticaYDistribucion.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.logisticaYDistribucion.pedido.values.CostoTotalPedido;
import co.com.sofkau.logisticaYDistribucion.pedido.values.PrecioUnitario;

public class CostoCalculado extends DomainEvent {

    private final PrecioUnitario precioUnitario;
    private final CostoTotalPedido costoPedido;

    public CostoCalculado(PrecioUnitario precioUnitario, CostoTotalPedido costoPedido) {
        super("co.com.sofkau.logisticaYDistribucion.pedido.events.CostoCalculado");
        this.precioUnitario = precioUnitario;
        this.costoPedido = costoPedido;
    }

    public PrecioUnitario getPrecioUnitario() {
        return precioUnitario;
    }

    public CostoTotalPedido getCostoPedido() {
        return costoPedido;
    }
}
