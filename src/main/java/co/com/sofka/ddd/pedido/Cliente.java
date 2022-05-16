package co.com.sofka.ddd.pedido;

import co.com.sofka.ddd.pedido.values.ClienteId;
import co.com.sofka.ddd.pedido.values.Direccion;
import co.com.sofka.ddd.pedido.values.Email;
import co.com.sofka.ddd.pedido.values.NombreCliente;
import co.com.sofka.domain.generic.Entity;

public class Cliente extends Entity<ClienteId> {


  public Cliente(ClienteId entityId) {
    super(entityId);
  }
}
