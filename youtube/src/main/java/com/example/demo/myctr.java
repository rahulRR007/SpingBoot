package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myctr {
	@GetMapping("/katum")
	
	public String display()
	{
		return "Hello World";
	}

}
