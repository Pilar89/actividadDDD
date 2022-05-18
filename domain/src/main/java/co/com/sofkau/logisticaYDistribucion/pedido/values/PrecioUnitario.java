package co.com.sofkau.logisticaYDistribucion.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PrecioUnitario implements ValueObject<Double> {

  private final Double value;

  public  PrecioUnitario(Double value){
    this.value = Objects.requireNonNull(value);

  }

  @Override
  public Double value() {
    return value;
  }
}
