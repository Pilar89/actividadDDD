package co.com.sofkau.logisticaYDistribucion.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CostoTotalPedidos implements ValueObject<Double> {
    private final Double value;

    public CostoTotalPedidos(Double value){
        this.value = Objects.requireNonNull(value);
        if (value < 0) {
            throw new IllegalArgumentException("El valor del capital no puede ser negativo");
        }
    }

    public CostoTotalPedidos aumentar(Double value) {
        return new CostoTotalPedidos(this.value + value);
    }

    public CostoTotalPedidos disminuir(Double value) {
        return new CostoTotalPedidos(this.value - value);
    }

    @Override
    public Double value() {
        return value;
    }
}
