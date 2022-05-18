package co.com.sofkau.logisticaYDistribucion.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.generic.values.Fecha;
import co.com.sofkau.logisticaYDistribucion.factura.values.CostoTotalPedidos;
import co.com.sofkau.logisticaYDistribucion.pedido.Cliente;
import co.com.sofkau.logisticaYDistribucion.pedido.Pedido;
import co.com.sofkau.logisticaYDistribucion.pedido.Vendedor;

import java.util.List;

public class FacturaAgregada extends DomainEvent {


    private final Fecha fecha;
    private final Estado estado;
    private final CostoTotalPedidos costoTotal;
    private final List<Pedido> pedidos;
    private final Cliente cliente;
    private final Vendedor vendedor;

    public FacturaAgregada(Fecha fecha, Estado estado, CostoTotalPedidos costoTotal, List<Pedido> pedidos, Cliente cliente, Vendedor vendedor) {
        super("co.com.sofkau.logisticaYDistribucion.factura");
        this.fecha = fecha;
        this.estado = estado;
        this.costoTotal = costoTotal;
        this.pedidos = pedidos;
        this.cliente = cliente;
        this.vendedor = vendedor;
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

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }


}
