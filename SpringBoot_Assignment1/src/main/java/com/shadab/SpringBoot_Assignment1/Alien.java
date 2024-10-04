package com.shadab.SpringBoot_Assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    
	@Autowired
	Laptop lap;
	
	public void callAlien()
	{
		System.out.println("callingAlien");
		lap.callLaptop();
	}
}
