package co.com.sofkau.generic.values;

import co.com.sofka.domain.generic.Identity;

public class ConductorId  extends Identity {
    public ConductorId(String id) {
        super(id);
    }
    public ConductorId() {}
    public static ConductorId of(String id) {
        return new ConductorId(id);
    }
}
