package com.spring.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.datajpa.entity.Product;
import com.spring.datajpa.service.ProductService;

@RestController
public class ProductController {

//	@Autowired
//	private ProductService productservice;
	
//	@PostMapping("/addproduct")
//	public Product addProduct(@RequestBody Product product) {
//		return new Product();
//				//productservice.saveproduct(product);
//	}
	
//	@PostMapping("/addproducts")
//	public List<Product> addProducts(@RequestBody List<Product> products) {
//		return productservice.saveproducts(products);
//	}
//
//	@GetMapping("/productbyId/{id}")
//	public Product getProductId(@PathVariable int id) {
//		return productservice.getProductById(id);
//	}
//
	@GetMapping("/productbyName/{name}")
	public Product getProductName(@PathVariable String name) {
		return new Product(1,"name",23,100.00);
				//productservice.getProductByName(name);
	}
//
//	@GetMapping("/products")
//	public List<Product> findProducts() {
//		return productservice.getProducts();
//	}
//
//	@PutMapping("/update")
//	public Product deleteProduct(@RequestBody Product product) {
//		return productservice.updateProduct(product);
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public String updateProduct(@PathVariable int id) {
//		return productservice.deleteProduct(id);
//	}
}
