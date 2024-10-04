package com.shadab.SPringBoot_JDBC;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.zaxxer.hikari.util.DriverDataSource;

import models.Student;

@Configuration
public class config {

	@Bean
	public JdbcTemplate getTemplate() {
		return new JdbcTemplate(getDataSource());

	}

	@Bean
	public DataSource getDataSource() {
		String url = "jdbc:postgresql://localhost:5432/jdbc_demo";
		String username = "postgres";
		String password = "0000";
		return new DriverManagerDataSource(url, username, password);
	}

	@Bean
	public Student student() {
		return new Student();

	}

}
