package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class Coffee {
 
	@GetMapping("/Coffee")
	public List<String> getcoffee()
	{
		List<String> cf = new ArrayList<>();
		cf.add("boost");
		cf.add("Latte");
		cf.add("Cappuccino");
		cf.add("Americo");
		
		return cf;
	}
	
 
 
}
