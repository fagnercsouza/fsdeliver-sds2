package com.fsdev.fsdeliver.service;

import com.fsdev.fsdeliver.dto.ProductDTO;
import com.fsdev.fsdeliver.entities.Product;
import com.fsdev.fsdeliver.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll(){
        // fazer busca por nome em ordem alfabetica
        List<Product> list = repository.findAllByOrderByNameAsc();
        return list.stream()
                .map(x -> new ProductDTO(x))
                .collect(Collectors.toList());
    }
}
