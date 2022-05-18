package co.com.sofkau.logisticaYDistribucion.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.logisticaYDistribucion.factura.values.CostoTotalPedidos;

public class CostoCalculado extends DomainEvent {


    private final CostoTotalPedidos costoTotalPedidos;

    public CostoCalculado(CostoTotalPedidos costoTotalPedidos) {
        super("co.com.sofkau.logisticaYDistribucion.events.CostoCalculado");
        this.costoTotalPedidos = costoTotalPedidos;
    }

    public CostoTotalPedidos getCostoTotalPedidos() {
        return costoTotalPedidos;
    }
}
