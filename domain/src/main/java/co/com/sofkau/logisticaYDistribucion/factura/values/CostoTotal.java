package co.com.sofkau.logisticaYDistribucion.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CostoTotal implements ValueObject<Double> {
    private final Double value;

    public  CostoTotal(Double value){
        this.value = Objects.requireNonNull(value);

    }
    @Override
    public Double value() {
        return value;
    }
}
