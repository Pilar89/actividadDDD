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

    public CostoTotalPedido aumentar(Double value) {
        return new CostoTotalPedido(this.value + value);
    }

    public CostoTotalPedido disminuir(Double value) {
        return new CostoTotalPedido(this.value - value);
    }
}
