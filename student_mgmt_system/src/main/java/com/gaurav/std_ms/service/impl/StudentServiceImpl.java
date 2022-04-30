package com.gaurav.std_ms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gaurav.std_ms.entity.Student;
import com.gaurav.std_ms.repository.StudentRepo;
import com.gaurav.std_ms.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepo studentRepo;

	public StudentServiceImpl(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public Student saveStd(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
		
	}

}
