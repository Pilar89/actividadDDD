package co.com.sofkau.logisticaYDistribucion.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Presentacion implements ValueObject<String> {
  private final String value;

  public  Presentacion(String value){
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
