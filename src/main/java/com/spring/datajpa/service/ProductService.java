package com.spring.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.datajpa.entity.Product;
import com.spring.datajpa.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productrepository;
	
	public Product saveproduct(Product product) {
		
		return productrepository.save(product);
	}
	
	public List<Product> saveproducts(List<Product> products) {
		
		return productrepository.saveAll(products);
	}
	
	public List<Product> getProducts() {
		
		return productrepository.findAll();
	}

	public Product getProductById(int id) {
		
		return productrepository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name) {
		
		return productrepository.getProductByName(name);
	}
	
	public String deleteProduct(int id) {
		
		productrepository.deleteById(id);
		
		return "deleted product" + id;
	}
	
	public Product updateProduct(Product product) {
		
		Product existingProduct = productrepository.findById(product.getId()).orElse(null);
		existingProduct.setId(product.getId());
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		
		return productrepository.save(existingProduct);
	}


}
