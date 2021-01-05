package com.fsdev.fsdeliver.rest;

import com.fsdev.fsdeliver.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductRest {

    @Autowired
    private ProductService service;

    @GetMapping
    public String get(){
        return "1h20min";
    }
}
