package co.com.sofkau.logisticaYDistribucion.pedido;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.generic.values.ClienteId;

public class Cliente extends Entity<ClienteId> {


  public Cliente(ClienteId entityId) {
    super(entityId);
  }
}
