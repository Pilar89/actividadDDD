package co.com.sofkau.logisticaYDistribucion.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.logisticaYDistribucion.factura.values.FacturaId;


public class EstadoActualizado extends DomainEvent {

    private final FacturaId entityId;
    private final Estado estado;

    public EstadoActualizado(FacturaId facturaId, Estado estado) {
        super("co.com.sofkau.generic.values.Estado");
        this.entityId = facturaId;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
    public FacturaId getEntityId() {
        return entityId;
    }
}
