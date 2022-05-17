package co.com.sofkau.entrenamiento.pedido;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.pedido.values.ClienteId;

public class Cliente extends Entity<ClienteId> {


  public Cliente(ClienteId entityId) {
    super(entityId);
  }
}
