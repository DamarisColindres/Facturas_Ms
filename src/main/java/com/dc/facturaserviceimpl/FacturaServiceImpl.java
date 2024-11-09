package com.dc.facturaserviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dc.facturaentity.FacturaEntity;
import com.dc.facturarepository.IFacturaRepository;
import com.dc.facturaservice.IFacturaService;
import com.dc.feignclient.IClienteFeignClient;
import com.dc.feignclient.IProductoFeignClient;

@Service
public class FacturaServiceImpl implements IFacturaService{

    @Autowired
    private IFacturaRepository facturaRepository;
    
    @Autowired
    private IClienteFeignClient clienteFeignClient;

    @Autowired
    private IProductoFeignClient productoFeignClient;

    @Override
    public FacturaEntity guardarFactura(FacturaEntity factura) {
    	return facturaRepository.save(factura);
    }

    @Override
    public List<FacturaEntity> listarFacturas() {
        return facturaRepository.findAll();
    }

    @Override
    public FacturaEntity obtenerFacturaPorId(Long id) {
        return facturaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarFactura(Long id) {
        facturaRepository.deleteById(id);
    }
}