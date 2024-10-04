package com.shadab.Spring_JAVA;

public class Alien {

	private int age;
	private Laptop lap;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	public void callAlien() {
		System.out.println("callAlien");
		lap.callLaptop();
	}

	public Alien(int age, Laptop lap) {
		super();
		this.age = age;
		this.lap = lap;
	}

}
