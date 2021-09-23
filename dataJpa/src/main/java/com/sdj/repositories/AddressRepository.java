package com.sdj.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sdj.entity.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {
	

}
