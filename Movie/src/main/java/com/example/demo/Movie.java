package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Movie 
{
@GetMapping("/SearchMovie")
	public String searchMoive (@RequestParam(name = "name") String movie)
	{
		return "Result for movie "+movie;
	}
}

