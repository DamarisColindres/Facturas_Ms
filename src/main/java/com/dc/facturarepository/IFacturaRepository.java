package com.dc.facturarepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dc.facturaentity.FacturaEntity;

@Repository
public interface IFacturaRepository extends JpaRepository <FacturaEntity, Long>{

}
