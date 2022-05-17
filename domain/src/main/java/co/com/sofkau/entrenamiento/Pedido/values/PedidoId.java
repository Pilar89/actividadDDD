package co.com.sofkau.entrenamiento.Pedido.values;

import co.com.sofka.domain.generic.Identity;

public class PedidoId extends Identity {

  public PedidoId(String id){
    super(id);
  }

  public PedidoId() {}
 public static PedidoId of(String id){
    return new PedidoId(id);
 }





}
