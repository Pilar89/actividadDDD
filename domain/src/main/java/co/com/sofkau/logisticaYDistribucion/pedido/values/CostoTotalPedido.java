package co.com.sofkau.logisticaYDistribucion.pedido.values;

import co.com.sofka.domain.generic.ValueObject;

public class CostoTotalPedido implements ValueObject<Double> {
    private final Double value;

    public CostoTotalPedido(Double value) {
        this.value = value;
    }

    @Override
    public Double value() {
        return null;
    }
}
