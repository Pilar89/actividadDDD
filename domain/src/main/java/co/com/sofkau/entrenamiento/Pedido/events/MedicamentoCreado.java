package co.com.sofkau.entrenamiento.Pedido.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.Pedido.MedicamentoId;
import co.com.sofkau.entrenamiento.Pedido.values.*;

public class MedicamentoCreado extends DomainEvent {
  private final MedicamentoId medicamentoId;
  private final Nombre nombre;
  private final Presentacion presentacion;
  private final Laboratorio laboratorio;
  private final PrecioUnitario precioUnitario;
  private final Cantidad cantidad;

  public MedicamentoCreado(MedicamentoId medicamentoId, Nombre nombre,
                           Presentacion presentacion, Laboratorio laboratorio,
                           PrecioUnitario precioUnitario, Cantidad cantidad) {
    super("co.com.sofka.ddd.MedicamentoCreado");
    this.medicamentoId = medicamentoId;
    this.nombre = nombre;
    this.presentacion = presentacion;
    this.laboratorio = laboratorio;
    this.precioUnitario = precioUnitario;
    this.cantidad = cantidad;

  }

  public MedicamentoId getMedicamentoId() {
    return medicamentoId;
  }

  public Nombre getNombre() {
    return nombre;
  }

  public Presentacion getPresentacion() {
    return presentacion;
  }

  public Laboratorio getLaboratorio() {
    return laboratorio;
  }

  public PrecioUnitario getPrecioUnitario() {
    return precioUnitario;
  }

  public Cantidad getCantidad() {
    return cantidad;
  }
}
