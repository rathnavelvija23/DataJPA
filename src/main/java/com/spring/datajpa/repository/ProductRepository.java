package com.spring.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.datajpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product getProductByName(String name);

}
