package com.dc.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dc.clienteentity.ClienteEntity;


@FeignClient(name = "cliente-service", url = "http://localhost:8081")
public interface IClienteFeignClient {
    @GetMapping("/clientes/{id}")
    ClienteEntity obtenerClientePorId(@PathVariable("id") Long id);
}