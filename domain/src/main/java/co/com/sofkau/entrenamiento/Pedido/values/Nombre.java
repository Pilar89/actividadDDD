package co.com.sofkau.entrenamiento.Pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {

  private final String value;

  public  Nombre(String value){
    this.value = Objects.requireNonNull(value);
    if (this.value.isBlank()){
      throw new IllegalArgumentException("No puede estar en blanco");
    }
  }
  @Override
  public String value() {
    return value;
  }
}
