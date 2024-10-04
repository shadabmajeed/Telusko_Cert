package com.shadab.SpringBoot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {

	@Autowired
	@Qualifier("desktop")
	private Computer comp;

	public void callAlien() {
		System.out.println("Call Alien");
		comp.code();
	}
	
	@Autowired
	@Qualifier("laptop")
	public void setComp( Computer comp)
	{
		
		System.out.println("calling");
		
	}
	
	

}
