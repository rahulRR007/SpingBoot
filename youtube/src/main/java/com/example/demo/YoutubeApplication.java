package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class YoutubeApplication {

	public static void main(String[] args) {
		SpringApplication.run(YoutubeApplication.class, args);
		//System.out.print("Hello World");
	}
	
}