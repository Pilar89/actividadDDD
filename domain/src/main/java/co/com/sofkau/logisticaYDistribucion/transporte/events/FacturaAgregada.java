package co.com.sofkau.logisticaYDistribucion.transporte.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.logisticaYDistribucion.factura.Factura;
import co.com.sofkau.logisticaYDistribucion.factura.values.FacturaId;

public class FacturaAgregada extends DomainEvent {


    private final FacturaId facturaId;
    private final Factura factura;

    public FacturaAgregada(FacturaId facturaId, Factura factura) {
        super("co.com.sofkau.factura.events.PedidoAgregado");
        this.facturaId = facturaId;
        this.factura = factura;
    }

    public FacturaId getFacturaId() { return facturaId; }

    public Factura getFactura() {
        return factura;
    }
}
