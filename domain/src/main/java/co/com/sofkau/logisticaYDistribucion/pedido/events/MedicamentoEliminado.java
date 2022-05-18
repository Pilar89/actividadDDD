package co.com.sofkau.logisticaYDistribucion.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.logisticaYDistribucion.pedido.values.MedicamentoId;

public class MedicamentoEliminado extends DomainEvent {

    private final MedicamentoId medicamentoId;

    public MedicamentoEliminado(MedicamentoId medicamentoId) {
        super("co.com.sofkau.pedido.events.MedicamentoEliminado");
        this.medicamentoId = medicamentoId;
    }

    public MedicamentoId getMedicamentoId() {
        return medicamentoId;
    }
}
