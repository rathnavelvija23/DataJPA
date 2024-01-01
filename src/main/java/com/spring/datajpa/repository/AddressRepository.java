package com.spring.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.datajpa.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
