package co.com.sofkau.logisticaYDistribucion.transporte;

import co.com.sofkau.generic.values.Fecha;
import co.com.sofkau.logisticaYDistribucion.factura.values.FacturaId;
import co.com.sofkau.logisticaYDistribucion.pedido.Medicamento;
import co.com.sofkau.logisticaYDistribucion.pedido.values.MedicamentoId;

import java.util.Map;

public class Transporte extends AgreggateEvent<FacturaId>{
    protected Fecha fecha;
    protected Map<MedicamentoId, Medicamento> medicamentos;
}
