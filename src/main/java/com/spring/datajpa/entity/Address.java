package com.spring.datajpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ADDRESS")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="address_id")
	private int id;
	private String city;
	private String addressType;

	/* --> Bi directional
	@OneToOne(mappedBy = "address")
	private Employee employee;
	*/


}
