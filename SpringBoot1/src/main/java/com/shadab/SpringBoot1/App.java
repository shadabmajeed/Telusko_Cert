package com.shadab.SpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con = SpringApplication.run(App.class);
       Alien a = con.getBean("alien",Alien.class);
       a.callAlien();
    }
}
