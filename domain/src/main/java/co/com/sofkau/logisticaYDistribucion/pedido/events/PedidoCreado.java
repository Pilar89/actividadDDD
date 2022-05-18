package co.com.sofkau.logisticaYDistribucion.pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.generic.Cliente;
import co.com.sofkau.generic.Vendedor;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.generic.values.Fecha;
import co.com.sofkau.logisticaYDistribucion.pedido.values.CostoTotalPedido;

public class PedidoCreado extends DomainEvent {
  private final Cliente cliente;
  private final Vendedor vendedor;
  private final Fecha fecha;
  private final Estado estado;
  private final CostoTotalPedido costoPedido;

  public PedidoCreado(Cliente cliente, Vendedor vendedor, Fecha fecha, Estado estado){
    super("co.com.sofka.ddd.PedidoCreado");
    this.cliente = cliente;
    this.vendedor = vendedor;
    this.fecha = fecha;
    this.estado = estado;
    this.costoPedido = new CostoTotalPedido(0D);
  }

  public Cliente getCliente() {
    return cliente;
  }

  public Vendedor getVendedor() {
    return vendedor;
  }

  public Fecha getFecha() {
    return fecha;
  }

  public Estado getEstado() {
    return estado;
  }
  public CostoTotalPedido getCostoPedido() {
    return costoPedido;
  }
}
