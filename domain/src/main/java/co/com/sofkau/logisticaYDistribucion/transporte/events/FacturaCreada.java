package co.com.sofkau.logisticaYDistribucion.transporte.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.logisticaYDistribucion.factura.Factura;

public class FacturaCreada extends DomainEvent {


    private final Factura factura;

    public FacturaCreada(Factura factura) {
        super("co.com.sofkau.factura.events.PedidoAgregado");
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }
}
