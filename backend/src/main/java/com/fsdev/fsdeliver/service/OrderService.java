package com.fsdev.fsdeliver.service;

import com.fsdev.fsdeliver.dto.OrderDTO;
import com.fsdev.fsdeliver.dto.ProductDTO;
import com.fsdev.fsdeliver.entities.Order;
import com.fsdev.fsdeliver.entities.OrderStatus;
import com.fsdev.fsdeliver.entities.Product;
import com.fsdev.fsdeliver.repositories.OrderRepository;
import com.fsdev.fsdeliver.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;
    @Autowired
    private ProductRepository prodRepository;
    @Transactional(readOnly = true)
    public List<OrderDTO> findAll(){
        List<Order> list = repository.findOrderWithProducts();
        return list.stream()
                .map(OrderDTO::new)
                .collect(Collectors.toList());
    }
    @Transactional
    public OrderDTO insert(OrderDTO dto){
        Order order = new Order(null, dto.getAddress(),
                dto.getLatitude(), dto.getLongitude(),
                Instant.now(), OrderStatus.PENDING);
        for (ProductDTO p : dto.getProducts()){
            Product product = prodRepository.getOne(p.getId());
            order.getProducts().add(product);
        }
        order = repository.save(order);
        return new OrderDTO(order);
    }

    @Transactional
    public OrderDTO setDeliverd(Long id){
       Order order = repository.getOne(id);
       order.setStatus(OrderStatus.DELIVERED);
       order = repository.save(order);
       return new OrderDTO(order);
    }
 }
