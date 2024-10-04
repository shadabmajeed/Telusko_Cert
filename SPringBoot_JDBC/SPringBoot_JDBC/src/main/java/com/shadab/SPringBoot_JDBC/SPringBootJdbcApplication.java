package com.shadab.SPringBoot_JDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import models.Student;
import service.StudentService;

@SpringBootApplication
@ComponentScan({ "models", "service", "repository","com.shadab.SPringBoot_JDBC"})
public class SPringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SPringBootJdbcApplication.class, args);
		System.out.println("running");

		Student s = con.getBean("student", Student.class);
		s.setAge(26);
		s.setName("majeed");
		s.setRollNo(27);

		StudentService studentService = con.getBean("studentService", StudentService.class);
		studentService.addStudent(s);

		System.out.println(studentService.getAllStudents());

	}

}
