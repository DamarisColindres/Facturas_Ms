package com.dc.facturaservice;


import com.dc.facturaentity.FacturaEntity;

import java.util.List;

public interface IFacturaService {
    FacturaEntity guardarFactura(FacturaEntity factura);
    List<FacturaEntity> listarFacturas();
    FacturaEntity obtenerFacturaPorId(Long id);
    void eliminarFactura(Long id);
}
