package co.com.sofkau.logisticaYDistribucion.transporte;

import co.com.sofkau.generic.values.ConductorId;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.generic.values.Fecha;
import co.com.sofkau.logisticaYDistribucion.factura.Factura;
import co.com.sofkau.logisticaYDistribucion.transporte.events.EstadoActualizado;
import co.com.sofkau.logisticaYDistribucion.factura.events.PedidoEliminado;
import co.com.sofkau.logisticaYDistribucion.factura.values.FacturaId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.logisticaYDistribucion.transporte.events.FacturaCreada;
import co.com.sofkau.logisticaYDistribucion.transporte.events.FacturaEliminada;
import co.com.sofkau.logisticaYDistribucion.transporte.values.Ruta;

import java.util.Map;

public class Transporte extends AggregateEvent<FacturaId>{

    protected Fecha fecha;
    protected Ruta ruta;
    protected Estado estado;
    protected Conductor conductor;
    protected Map<FacturaId, Factura> facturas;

    public Transporte(FacturaId entityId) {
        super(entityId);
    }

    public Transporte(FacturaId entityId, Fecha fecha, Ruta ruta, Estado estado, Conductor conductor, Map<FacturaId, Factura> factura) {
        super(entityId);
        this.fecha = fecha;
        this.ruta = ruta;
        this.estado = estado;
        this.facturas = factura;
        this.conductor = conductor;
    }


    //comportamientos

    public void cambiarEstado(FacturaId facturaId, Estado estado){
        appendChange(new EstadoActualizado(facturaId, estado)).apply();
    }

    public void agregarFactura (Factura factura) {
        appendChange(new FacturaCreada(factura));
    }


    public void eliminarFactura(FacturaId facturaId){
        appendChange(new FacturaEliminada(facturaId)).apply();
    }

}
