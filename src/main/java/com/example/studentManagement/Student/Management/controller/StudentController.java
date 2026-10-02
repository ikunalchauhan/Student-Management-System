package com.example.studentManagement.Student.Management.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentManagement.Student.Management.entity.Student;
import com.example.studentManagement.Student.Management.service.StudentService;

@RestController
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	
	@RequestMapping("/getAllRecords")
	public List<Student> getAllRecords() {
		return studentService.getAllRecords();
	}
}
