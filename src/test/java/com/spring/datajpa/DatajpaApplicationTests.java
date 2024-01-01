package com.spring.datajpa;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.spring.datajpa.entity.Address;
import com.spring.datajpa.entity.Product;
import com.spring.datajpa.repository.ProductRepository;
import com.spring.datajpa.service.ProductService;

@SpringBootTest
class DatajpaApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private ProductRepository productrepository;
	
	@MockBean
	private ProductService productservice;
	
	
	public void getProductsTest() {
		List<Address> addresslist= new ArrayList<Address>();
//		Address address=new Address();
//		address.setCity("madurai");
//		address.setId(23);
//		address.setAddressType("Current");
//
//		addresslist.add(address);
//
//		when(productrepository.findAll())
//				.thenReturn(Stream
//				.of(new Product(1, "Test11", 15000, 4),new Product(2, "Test12", 15000, 4)).collect(Collectors.toList()));
//
//		asser
		
	}
	

}
