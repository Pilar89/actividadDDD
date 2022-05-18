package co.com.sofkau.generic;


import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.generic.values.Direccion;
import co.com.sofkau.generic.values.Email;
import co.com.sofkau.generic.values.Nombre;
import co.com.sofkau.generic.values.VendedorId;

public class Vendedor extends Entity<VendedorId> {

    protected Nombre nombre;
    protected Direccion direccion;
    protected Email email;

    public Vendedor(VendedorId entityId, Nombre nombre, Direccion direccion, Email email) {
        super(entityId);
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    public Vendedor(VendedorId entityId) {
        super(entityId);
    }
}
