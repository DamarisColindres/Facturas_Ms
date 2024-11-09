package com.dc.dto;

import lombok.Data;

@Data
public class ClienteDto {
	
    private Integer id;           
    private String nombre;         
    private String correo;          
    private String telefono;       
    private String direccion;      
    private String nit;
}
