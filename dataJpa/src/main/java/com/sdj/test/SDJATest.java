package com.sdj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sdj.bo.AdressBo;
import com.sdj.config.RootConfig;
import com.sdj.service.AddressService;

public class SDJATest {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(RootConfig.class);
	AddressService addressService=context.getBean(AddressService.class);
	AdressBo adressBo= addressService.getAddress(1);
	System.out.println(adressBo.getCity());
	}

}
