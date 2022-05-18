package co.com.sofkau.logisticaYDistribucion.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.generic.Cliente;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.generic.values.Fecha;
import co.com.sofkau.logisticaYDistribucion.factura.values.CostoTotalPedidos;
import co.com.sofkau.logisticaYDistribucion.pedido.Pedido;

import java.util.List;

public class FacturaAgregada extends DomainEvent {


    private final Fecha fecha;
    private final Estado estado;
    private final CostoTotalPedidos costoTotal;
    private final Cliente cliente;

    public FacturaAgregada(Fecha fecha, Estado estado, Cliente cliente) {
        super("co.com.sofkau.logisticaYDistribucion.factura");
        this.fecha = fecha;
        this.estado = estado;
        this.costoTotal = new CostoTotalPedidos(0D);
        this.cliente = cliente;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public CostoTotalPedidos getCostoTotal() {
        return costoTotal;
    }


    public Cliente getCliente() {
        return cliente;
    }

}
