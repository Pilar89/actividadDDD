package co.com.sofka.ddd.pedido;


import co.com.sofka.ddd.pedido.events.MedicamentoCreado;
import co.com.sofka.ddd.pedido.events.PedidoCreado;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashMap;

public class PedidoEventChange extends EventChange {
  public PedidoEventChange(Pedido pedido){
    apply((PedidoCreado event) ->{
      pedido.cliente = event.getCliente();
      pedido.vendedor = event.getVendedor();
      pedido.estado = event.getEstado();
      pedido.fecha =  event.getFecha();
      pedido.medicamentos = new HashMap<>();
    });

    apply((MedicamentoCreado event) ->{
      var medcamentoId = event.getMedicamentoId();
      var medicamento = new Medicamento(medcamentoId, event.getNombre(), event.getPresentacion(), event.getLaboratorio(), event.getPrecioUnitario(), event.getCantidad());
      pedido.medicamentos.put(medcamentoId, medicamento);

    });


  }




}
