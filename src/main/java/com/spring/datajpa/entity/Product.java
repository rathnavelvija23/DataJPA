package com.spring.datajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT_TBL")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private int quantity;
	private double price;
//
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="fk_id",referencedColumnName="id")
//	private List<Address> address;
	
	

	

}
