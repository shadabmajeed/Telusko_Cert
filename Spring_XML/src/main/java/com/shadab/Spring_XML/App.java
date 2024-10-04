package com.shadab.Spring_XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		Alien alien = (Alien) con.getBean("alienObject");
		alien.callAlien();
		
	}
}
