package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {

}
