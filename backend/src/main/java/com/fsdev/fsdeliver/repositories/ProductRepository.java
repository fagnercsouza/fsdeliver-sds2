package com.fsdev.fsdeliver.repositories;

import com.fsdev.fsdeliver.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

        List<Product> findAllByOrderByNameAsc();
}
