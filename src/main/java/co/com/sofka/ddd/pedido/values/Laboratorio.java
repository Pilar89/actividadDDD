package co.com.sofka.ddd.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Laboratorio implements ValueObject<String> {

  private final String value;

  public  Laboratorio(String value){
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
