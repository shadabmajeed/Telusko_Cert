package com.shadab.SpringBoot_Assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootAssignment1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con = SpringApplication.run(SpringBootAssignment1Application.class, args);
		Alien al = con.getBean(Alien.class);
		al.callAlien();
	}

}
