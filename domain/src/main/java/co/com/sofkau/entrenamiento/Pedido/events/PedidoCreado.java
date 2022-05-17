package co.com.sofkau.entrenamiento.Pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.Pedido.Cliente;
import co.com.sofkau.entrenamiento.Pedido.values.Estado;
import co.com.sofkau.entrenamiento.Pedido.values.Fecha;
import co.com.sofkau.entrenamiento.Pedido.values.Vendedor;

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
