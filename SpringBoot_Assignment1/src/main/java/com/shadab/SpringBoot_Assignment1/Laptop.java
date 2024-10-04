package com.shadab.SpringBoot_Assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Autowired
	Ram ram;

	public void callLaptop() {

		System.out.println("Calling Laptop");
		ram.callRam();
	}

}
