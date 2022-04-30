package com.gaurav.std_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gaurav.std_ms.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
      
} 
