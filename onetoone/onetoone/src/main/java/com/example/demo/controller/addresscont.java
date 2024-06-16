package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Address;
import com.example.demo.Entity.Student;
import com.example.demo.Repo.Studentrepo;
import com.example.demo.Repo.addressRepo;
import com.example.demo.Service.StudentSer;
import com.example.demo.Service.addressser;


@RestController
public class addresscont {
	
@Autowired
	addressser ss;

@Autowired

Studentrepo sr;


	
	@PostMapping("/address")
	
	public ResponseEntity<Address> add( @RequestBody Address se)
	{
		
		se.setStudent(sr.findById(se.getId()).orElse(null));
		
		Address obj = ss.add(se);
		return new ResponseEntity<>(obj,HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/address")
	
	public ResponseEntity<List<Address>> gettall()
	{
		List<Address> obj = ss.getall();
		
		return new ResponseEntity<>(obj,HttpStatus.OK);
	}

}
