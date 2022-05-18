package co.com.sofkau.logisticaYDistribucion.transporte.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.logisticaYDistribucion.factura.values.FacturaId;

public class FacturaEliminada extends DomainEvent {

    private final FacturaId facturaId;

    public FacturaEliminada(FacturaId facturaId) {
        super("co.com.sofkau.factura.events.PedidoEliminado");
        this.facturaId = facturaId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }
}
