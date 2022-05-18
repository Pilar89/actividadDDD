package co.com.sofkau.logisticaYDistribucion.pedido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.generic.values.Estado;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.generic.values.Fecha;
import co.com.sofkau.generic.values.Nombre;
import co.com.sofkau.logisticaYDistribucion.pedido.events.EstadoActualizado;
import co.com.sofkau.logisticaYDistribucion.pedido.events.MedicamentoEliminado;
import co.com.sofkau.logisticaYDistribucion.pedido.values.PedidoId;
import co.com.sofkau.logisticaYDistribucion.pedido.events.CostoCalculado;
import co.com.sofkau.logisticaYDistribucion.pedido.events.MedicamentoCreado;
import co.com.sofkau.logisticaYDistribucion.pedido.events.PedidoCreado;
import co.com.sofkau.logisticaYDistribucion.pedido.values.*;

import java.util.List;
import java.util.Map;

public class Pedido extends AggregateEvent<PedidoId> {

  protected Vendedor vendedor;
  protected Fecha fecha;
  protected Estado estado;
  protected Cliente cliente;
  protected CostoTotalPedido costoPedido;
  protected Map<MedicamentoId,Medicamento> medicamentos;


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

  // comportamientos

  public void cambiarEstado(PedidoId pedidoId, Estado estado){
    appendChange(new EstadoActualizado(pedidoId, estado)).apply();
  }

  public void agregarMedicamento(MedicamentoId entityId, Nombre nombre,
                                 Presentacion presentacion, Laboratorio laboratorio,
                                 PrecioUnitario precioUnitario, Cantidad cantidad){
    appendChange(new MedicamentoCreado(entityId, nombre,presentacion,laboratorio, precioUnitario,cantidad)).apply();
  }

  public void eliminarMedicamento(MedicamentoId entityId){
    appendChange(new MedicamentoEliminado(entityId)).apply();
  }

  public void calcularPedido(PrecioUnitario precioUnitario, CostoTotalPedido costoPedido){
    appendChange(new CostoCalculado(precioUnitario, costoPedido)).apply();
  }



}
