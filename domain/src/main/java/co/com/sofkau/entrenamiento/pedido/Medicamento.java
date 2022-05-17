package co.com.sofkau.entrenamiento.pedido;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.entrenamiento.pedido.values.*;

public class Medicamento extends Entity<MedicamentoId> {
  protected Nombre nombre;
  protected Presentacion presentacion;
  protected Laboratorio laboratorio;
  protected Cantidad cantidad;
  protected PrecioUnitario precioUnitario;

  public Medicamento(MedicamentoId entityId, Nombre nombre,
                     Presentacion presentacion, Laboratorio laboratorio,
                     PrecioUnitario precioUnitario, Cantidad cantidad) {
    super(entityId);
    this.nombre = nombre;
    this.presentacion = presentacion;
    this.laboratorio = laboratorio;
    this.precioUnitario = precioUnitario;
    this.cantidad = cantidad;

  }


}
