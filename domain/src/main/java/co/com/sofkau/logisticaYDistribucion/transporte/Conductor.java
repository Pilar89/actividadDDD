package co.com.sofkau.logisticaYDistribucion.transporte;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.generic.values.ConductorId;
import co.com.sofkau.generic.values.Direccion;
import co.com.sofkau.generic.values.Email;
import co.com.sofkau.generic.values.Nombre;

public class Conductor extends Entity<ConductorId> {
    protected Nombre nombre;
    protected Direccion direccion;
    protected Email email;

    public Conductor(ConductorId entityId, Nombre nombre, Direccion direccion, Email email) {
        super(entityId);
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    public Conductor(ConductorId entityId) {
        super(entityId);
    }
}
