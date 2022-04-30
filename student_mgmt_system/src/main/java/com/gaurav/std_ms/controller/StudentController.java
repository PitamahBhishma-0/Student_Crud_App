package com.gaurav.std_ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gaurav.std_ms.entity.Student;
import com.gaurav.std_ms.service.StudentService;

@Controller
public class StudentController {

	private StudentService stdService;

	public StudentController(StudentService stdService) {

		this.stdService = stdService;
	}

	// Handler that handle list of student and return model and view
	@GetMapping("/students")
	public String listStuents(Model model) {
		model.addAttribute("students", stdService.getAllStudents());
		return "students";
	}
	@GetMapping("/students/new")
	public String createStudent(Model model) {
		// holding form data
		Student student=new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		stdService.saveStd(student);
		return "redirect:/students";
	}
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", stdService.getStudentById(id));
		return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent( @PathVariable Long id,
			@ModelAttribute("student") Student student,  Model model) {
		// Get student from database by id
		Student existingStudent=stdService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFname(student.getFname());
		existingStudent.setLname(student.getLname());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setAddress(student.getAddress());

		//save
		stdService.updateStudent(existingStudent);
		return "redirect:/students";
	}

	// delete
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
         stdService.deleteStudent(id);
         return "redirect:/students";
	}
}
