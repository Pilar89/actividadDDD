package co.com.sofkau.logisticaYDistribucion.transporte;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.logisticaYDistribucion.factura.Factura;
import co.com.sofkau.logisticaYDistribucion.factura.events.FacturaAgregada;
import co.com.sofkau.logisticaYDistribucion.factura.events.PedidoCreado;
import co.com.sofkau.logisticaYDistribucion.factura.events.PedidoEliminado;
import co.com.sofkau.logisticaYDistribucion.pedido.events.EstadoActualizado;
import co.com.sofkau.logisticaYDistribucion.transporte.events.FacturaCreada;
import co.com.sofkau.logisticaYDistribucion.transporte.events.FacturaEliminada;

import java.util.HashMap;

public class TransporteEventChange extends EventChange {

    public TransporteEventChange(Transporte transporte){

        apply((FacturaCreada event)-> {
            transporte.facturas = new HashMap<>();
        });


        apply((FacturaEliminada event) -> {
            var facturaId = event.getFacturaId();
            var facturaEliminada = transporte.facturas.remove(facturaId);
        });

        apply((EstadoActualizado event) -> {
            var facturaId = event.getEntityId();
            var estadoActualizado = event.getEstado().value();
            var estado = new Estado(estadoActualizado);
            transporte.estado = estado;
        });

    }
}
