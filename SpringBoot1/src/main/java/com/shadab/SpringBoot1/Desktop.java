package com.shadab.SpringBoot1;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
@Override
public void code() {

	System.out.println("Coding through Desktop");
	
}
}
