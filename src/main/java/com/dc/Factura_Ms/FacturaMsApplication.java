package com.dc.Factura_Ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FacturaMsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(FacturaMsApplication.class, args);
	}
}	