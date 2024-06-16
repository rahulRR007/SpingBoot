package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class spy {
	@GetMapping("/start/{name}")
	public String getinfo(@PathVariable String name)
	{
		return "INFOMATION ABOUT " + name;
	}

}
