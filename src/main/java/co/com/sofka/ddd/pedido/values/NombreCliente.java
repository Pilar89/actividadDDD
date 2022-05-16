package co.com.sofka.ddd.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreCliente implements ValueObject<String> {
  private final String value;

  public  NombreCliente(String value){
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
