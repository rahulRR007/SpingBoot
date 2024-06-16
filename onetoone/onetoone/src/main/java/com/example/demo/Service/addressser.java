package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Address;
import com.example.demo.Entity.Student;
import com.example.demo.Repo.Studentrepo;
import com.example.demo.Repo.addressRepo;


@Service
public class addressser {
	
@Autowired
	
	addressRepo sr;
	
	
	public Address add(Address se) {
	
		return sr.save(se);
	}
	
	public List<Address> getall() {
		return sr.findAll();
	}
	

}
