package com.sdj.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sdj.bo.AdressBo;
import com.sdj.entity.Address;
import com.sdj.repositories.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;

	@Transactional(readOnly = true)
	public AdressBo getAddress(int addressNo) {
		Address address = null;
		AdressBo bo = null;

		address = addressRepository.findById(addressNo).get();
		bo = new AdressBo();
		BeanUtils.copyProperties(address, bo);
		return bo;
	}
}
