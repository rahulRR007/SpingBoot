package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PojoApplication.class, args);
		home h = new home();
		h.connection();
	}

}
