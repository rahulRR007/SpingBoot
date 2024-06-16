package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repo.Studentrepo;

@Service
public class StudentSer {

	@Autowired
	
	Studentrepo sr;
	
	
	public Student add(Student se) {
	
		return sr.save(se);
	}
	
	public List<Student> getall() {
		return sr.findAll();
	}
	
	
	
}
