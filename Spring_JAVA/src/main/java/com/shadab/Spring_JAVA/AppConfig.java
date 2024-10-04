package com.shadab.Spring_JAVA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
//Explicit Dependency Injection
//@Bean(name = "alienObject")
//public Alien alien()
//{
//  Alien al = new Alien();
//  al.setAge(12);
//  al.setLap(lap());
//  return al;	
//}
	
// Autowiring
@Bean(name="alienObject")
public Alien alien(Laptop l)
{
return new Alien(22,l);	

}

@Bean Laptop lap()
{
return new Laptop();	
}

}
