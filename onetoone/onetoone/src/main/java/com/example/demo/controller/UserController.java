package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentSer;

@RestController
public class UserController {
	
	@Autowired
	
	StudentSer ss;
	
	@PostMapping("/student")
	
	public ResponseEntity<Student> add(@RequestBody  Student se)
	{
		Student obj = ss.add(se);
		return new ResponseEntity<>(obj,HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/student")
	
	public ResponseEntity<List<Student>> gettall()
	{
		List<Student> obj = ss.getall();
		
		return new ResponseEntity<>(obj,HttpStatus.OK);
	}
	

}
