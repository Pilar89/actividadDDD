package co.com.sofkau.generic;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.generic.values.ClienteId;
import co.com.sofkau.generic.values.Direccion;
import co.com.sofkau.generic.values.Email;
import co.com.sofkau.generic.values.Nombre;

public class Cliente extends Entity<ClienteId> {

    protected Nombre nombre;
    protected Direccion direccion;
    protected Email email;

    public Cliente(ClienteId entityId, Nombre nombre, Direccion direccion, Email email) {
        super(entityId);
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    public Cliente(ClienteId entityId) {
        super(entityId);
    }

}
