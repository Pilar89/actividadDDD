package co.com.sofkau.entrenamiento.Pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PrecioUnitario implements ValueObject<Integer> {

  private final Integer value;

  public  PrecioUnitario(Integer value){
    this.value = Objects.requireNonNull(value);

  }
  @Override
  public Integer value() {
    return value;
  }
}
