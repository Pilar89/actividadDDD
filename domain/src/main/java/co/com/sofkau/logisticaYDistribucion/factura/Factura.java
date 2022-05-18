package co.com.sofkau.logisticaYDistribucion.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.generic.values.Fecha;
import co.com.sofkau.logisticaYDistribucion.factura.values.CostoTotal;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.logisticaYDistribucion.factura.values.FacturaId;
import co.com.sofkau.logisticaYDistribucion.pedido.Cliente;
import co.com.sofkau.logisticaYDistribucion.pedido.Pedido;

import java.util.List;

public class Factura extends AggregateEvent<FacturaId>{
    protected Fecha fecha;
    protected Estado estado;
    protected CostoTotal costoTotal;
    protected List<Pedido> pedidos;
    protected Cliente cliente;

    public Factura(FacturaId entityId) {
        super(entityId);
    }

    public Factura(FacturaId entityId, Fecha fecha, Estado estado, CostoTotal costoTotal, List<Pedido> pedidos, Cliente cliente) {
        super(entityId);
        this.fecha = fecha;
        this.estado = estado;
        this.costoTotal = costoTotal;
        this.pedidos = pedidos;
        this.cliente = cliente;
    }



}
