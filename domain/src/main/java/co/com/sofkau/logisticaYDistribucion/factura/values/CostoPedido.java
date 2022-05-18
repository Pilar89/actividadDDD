package co.com.sofkau.logisticaYDistribucion.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CostoPedido implements ValueObject<Double> {
    private final Double value;

    public CostoPedido(Double value){
        this.value = Objects.requireNonNull(value);
        if (value < 0) {
            throw new IllegalArgumentException("El valor del capital no puede ser negativo");
        }
    }

    public CostoPedido aumentar(Double value) {
        return new CostoPedido(this.value + value);
    }

    public CostoPedido disminuir(Double value) {
        return new CostoPedido(this.value - value);
    }

    @Override
    public Double value() {
        return value;
    }
}
