package co.com.sofkau.generic;


import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.logisticaYDistribucion.pedido.values.VendedorId;

public class Vendedor extends Entity<VendedorId> {
    public Vendedor(VendedorId entityId) {
        super(entityId);
    }
}
