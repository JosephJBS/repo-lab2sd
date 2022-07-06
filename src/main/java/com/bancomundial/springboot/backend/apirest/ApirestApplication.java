package com.bancomundial.springboot.backend.apirest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ApirestApplication {

	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}

}
