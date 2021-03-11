package com.bibliotheque.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bibliotheque.web.repository.CustomProperties;

@SpringBootApplication
public class WebApplication implements CommandLineRunner {
	
	@Autowired
	private CustomProperties props;

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(props.getApiUrl());
		
	}

}
