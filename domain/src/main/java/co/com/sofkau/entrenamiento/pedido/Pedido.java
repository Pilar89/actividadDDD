package co.com.sofkau.entrenamiento.pedido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.entrenamiento.pedido.events.MedicamentoCreado;
import co.com.sofkau.entrenamiento.pedido.events.PedidoCreado;
import co.com.sofkau.entrenamiento.pedido.values.*;

import java.util.List;
import java.util.Map;

public class Pedido extends AggregateEvent<PedidoId> {

  protected Vendedor vendedor;
  protected Fecha fecha;
  protected Estado estado;
  protected Cliente cliente;
  protected Map<Fecha.MedicamentoId,Medicamento> medicamentos;




  public Pedido(PedidoId entityId, Cliente cliente, Vendedor vendedor, Fecha fecha, Estado estado) {
    super(entityId);
    appendChange(new PedidoCreado(cliente,vendedor, fecha, estado)).apply();
    subscribe(new PedidoEventChange(this));
  }

  public Pedido(PedidoId entityId) {
    super(entityId);
    subscribe(new PedidoEventChange(this));

  }

  public static Pedido from(PedidoId entityId, List<DomainEvent>events){
    var pedido = new Pedido(entityId);
    events.forEach(pedido::applyEvent);
    return pedido;


  }

  public void agregarMedicamento(Fecha.MedicamentoId entityId, Nombre nombre,
                                 Presentacion presentacion, Laboratorio laboratorio,
                                 PrecioUnitario precioUnitario, Cantidad cantidad){
    appendChange(new MedicamentoCreado(entityId, nombre,presentacion,laboratorio, precioUnitario,cantidad)).apply();


  }

  public Vendedor vendedor(){
    return vendedor;
  }




}
