package co.com.sofkau.logisticaYDistribucion.pedido;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.generic.values.Estado;
import co.com.sofkau.logisticaYDistribucion.pedido.events.CostoCalculado;
import co.com.sofkau.logisticaYDistribucion.pedido.events.EstadoActualizado;
import co.com.sofkau.logisticaYDistribucion.pedido.events.MedicamentoCreado;
import co.com.sofkau.logisticaYDistribucion.pedido.events.PedidoCreado;

import java.util.HashMap;

public class PedidoEventChange extends EventChange {

  public PedidoEventChange(Pedido pedido){

    apply((PedidoCreado event) -> {
      pedido.cliente = event.getCliente();
      pedido.vendedor = event.getVendedor();
      pedido.estado = event.getEstado();
      pedido.fecha =  event.getFecha();
      pedido.medicamentos = new HashMap<>();
    });

    apply((MedicamentoCreado event) -> {
      var medcamentoId = event.getMedicamentoId();
      var medicamento = new Medicamento(medcamentoId, event.getNombre(), event.getPresentacion(), event.getLaboratorio(), event.getPrecioUnitario(), event.getCantidad());
      pedido.medicamentos.put(medcamentoId, medicamento);
    });

    apply((EstadoActualizado event) -> {
      var pedidoId = event.getEntityId();
      var estadoActualizado = event.getEstado().value();
      var estado = new Estado(estadoActualizado);
      pedido.estado = estado;
    });
  }

}
