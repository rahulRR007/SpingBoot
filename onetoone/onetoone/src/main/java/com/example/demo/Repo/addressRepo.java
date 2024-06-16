package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Address;

public interface addressRepo extends JpaRepository<Address, Integer> {

}
