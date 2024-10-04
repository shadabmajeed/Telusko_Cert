package com.shadab.SpringBoot1;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
@Override
public void code() {
	System.out.println("Coding through Laptop");
	
}
}
