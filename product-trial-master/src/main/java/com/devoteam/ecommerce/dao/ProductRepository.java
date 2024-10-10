package com.devoteam.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devoteam.ecommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
