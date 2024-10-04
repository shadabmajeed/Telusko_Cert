package com.shadab.Spring_JAVA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Alien a = con.getBean("alienObject",Alien.class);
    	a.callAlien();
    }
}
