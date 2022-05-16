package co.com.sofka.ddd.pedido.events;

import co.com.sofka.ddd.pedido.Cliente;
import co.com.sofka.ddd.pedido.values.Estado;
import co.com.sofka.ddd.pedido.values.Fecha;
import co.com.sofka.ddd.pedido.values.Vendedor;
import co.com.sofka.domain.generic.DomainEvent;

public class PedidoCreado extends DomainEvent {
  private final Cliente cliente;
  private final Vendedor vendedor;
  private final Fecha fecha;
  private final Estado estado;
  public PedidoCreado(Cliente cliente, Vendedor vendedor, Fecha fecha, Estado estado){
    super("co.com.sofka.ddd.PedidoCreado");
    this.cliente = cliente;
    this.vendedor = vendedor;
    this.fecha = fecha;
    this.estado = estado;
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
}
