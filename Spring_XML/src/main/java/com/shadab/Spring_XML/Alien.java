package com.shadab.Spring_XML;

public class Alien {
    
	private int age;
	private Laptop laptopObject;
	
	public void callAlien()
	{  
		
		
		System.out.println("Calling Alien");
		laptopObject.compile();
	}
	
	public Alien()
	{
		System.out.println("object Created");
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setLap(Laptop lap)
	{
		this.laptopObject = lap;
	}
}
