package com.spring.datajpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS_TBL")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="add_id")
	private int id;
	private String city;
	
	private String addressType;

	//@OneToOne(mappedBy="address")
	//private Product product;
	
	public Address() {
		
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", addressType=" + addressType + "]";
	}
	public Address(int id, String city, String addressType) {
		super();
		this.id = id;
		this.city = city;
		this.addressType = addressType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	

}
