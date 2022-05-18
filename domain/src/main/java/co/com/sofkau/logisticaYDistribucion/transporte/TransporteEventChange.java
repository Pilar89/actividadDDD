package co.com.sofkau.logisticaYDistribucion.transporte;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.logisticaYDistribucion.pedido.events.EstadoActualizado;
import co.com.sofkau.logisticaYDistribucion.transporte.events.FacturaAgregada;
import co.com.sofkau.logisticaYDistribucion.transporte.events.FacturaEliminada;

import java.util.HashMap;

public class TransporteEventChange extends EventChange {

    public TransporteEventChange(Transporte transporte){

        apply((FacturaAgregada event)-> {
            transporte.facturas = new HashMap<>();
        });


        apply((FacturaEliminada event) -> {
            var facturaId = event.getFacturaId();
            var facturaEliminada = transporte.facturas.remove(facturaId);
        });

        apply((EstadoActualizado event) -> {
            var facturaId = event.getEntityId();
            var estadoActualizado = event.getEstado().value();
            transporte.estado = new Estado(estadoActualizado);
        });

    }
}
