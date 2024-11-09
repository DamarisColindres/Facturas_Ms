
package com.dc.facturacontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.dc.facturaentity.FacturaEntity;
import com.dc.facturaservice.IFacturaService;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {

    @Autowired
    private IFacturaService facturaService;

    @PostMapping
    public FacturaEntity guardarFactura(@RequestBody FacturaEntity factura) {
        return facturaService.guardarFactura(factura);
    }

    @GetMapping
    public List<FacturaEntity> listarFacturas() {
        return facturaService.listarFacturas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FacturaEntity> obtenerFacturaPorId(@PathVariable Long id) {
        FacturaEntity factura = facturaService.obtenerFacturaPorId(id);
        return factura != null ? ResponseEntity.ok(factura) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public void eliminarFactura(@PathVariable Long id) {
        facturaService.eliminarFactura(id);
    }
}