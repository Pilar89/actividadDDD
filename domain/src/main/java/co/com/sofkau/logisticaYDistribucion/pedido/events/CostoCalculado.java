package co.com.sofkau.logisticaYDistribucion.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.logisticaYDistribucion.pedido.values.CostoPedido;
import co.com.sofkau.logisticaYDistribucion.pedido.values.PrecioUnitario;

public class CostoCalculado extends DomainEvent {

    private final PrecioUnitario precioUnitario;
    private final CostoPedido costoPedido;

    public CostoCalculado(PrecioUnitario precioUnitario, CostoPedido costoPedido) {
        super("co.com.sofkau.logisticaYDistribucion.pedido.events.CostoCalculado");
        this.precioUnitario = precioUnitario;
        this.costoPedido = costoPedido;
    }

    public PrecioUnitario getPrecioUnitario() {
        return precioUnitario;
    }

    public CostoPedido getCostoPedido() {
        return costoPedido;
    }
}
