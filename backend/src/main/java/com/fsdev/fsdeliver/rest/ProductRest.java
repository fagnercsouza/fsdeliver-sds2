package com.fsdev.fsdeliver.rest;

import com.fsdev.fsdeliver.dto.ProductDTO;
import com.fsdev.fsdeliver.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRest {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll(){
        List<ProductDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
//    @GetMapping("/test")
//    public String st(){
//        return  "Teste";
//    }
}
