package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.School;

@Repository
public interface SchoolRepository extends JpaRepository<School,Integer>{
    
}
