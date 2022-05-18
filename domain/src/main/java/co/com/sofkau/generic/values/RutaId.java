package co.com.sofkau.generic.values;

import co.com.sofka.domain.generic.Identity;

public class RutaId extends Identity {
    public RutaId(String id) {
        super(id);
    }
    public RutaId() {}
    public static RutaId of(String id) {
        return new RutaId(id);
    }
}
