package com.dc.feignclient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dc.entity.ProductoEntity;

@FeignClient(name = "producto-service", url = "http://localhost:8082")
public interface IProductoFeignClient {
    @GetMapping("/productos/{id}")
    ProductoEntity obtenerProductoPorId(@PathVariable("id") Long id);
}
