package com.gaurav.std_ms.service;

import java.util.List;

import com.gaurav.std_ms.entity.Student;

public interface StudentService {
      List<Student> getAllStudents();
      Student saveStd(Student student);
      Student getStudentById(Long id);
      Student updateStudent(Student student);
      void deleteStudent(Long id);
	
}
