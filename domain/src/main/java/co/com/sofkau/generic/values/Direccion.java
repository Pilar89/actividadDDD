package co.com.sofkau.generic.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {

  private final String value;

  public  Direccion(String value){
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
