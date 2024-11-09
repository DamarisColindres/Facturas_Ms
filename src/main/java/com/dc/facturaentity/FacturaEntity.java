package com.dc.facturaentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dc.clienteentity.ClienteEntity;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="facturas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacturaEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
        
    @Column(name = "cliente_id", nullable = false)
    private ClienteEntity cliente;
    
    @OneToMany
    @JoinColumn(name = "factura_id")
    private List<ProductoEntity> productos;
    
    private Double total;
    
    public void calcularTotal() {
        if (productos != null && !productos.isEmpty()) {
            total = productos.stream()
                .mapToDouble(ProductoEntity::getPrecio)
                .sum();
        } else {
            total = 0.0;
        }
    }
    
    
}