package com.example.studentManagement.Student.Management.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@RequestMapping(method = RequestMethod.GET, value = "/getRecordById/{id}")
	public Student getRecordById(@PathVariable("id") int id) {
		return studentService.getRecordById(id);
	}

	@GetMapping("/getAllRecordsByDomain/{domain}")
	public List<Student> getAllRecordsByDomain(@PathVariable("domain") String domain) {
		return studentService.getAllRecordsByDomain(domain);
	}
	
	
	@PostMapping("/addRecord")
	public Student addRecord(@RequestBody Student data) {
		return studentService.addRecord(data);
	}
	
	@PostMapping("/addRecordMap")
	public void addRecordMap(@RequestBody Map<String, String> data) {
		System.out.println(data);
	}
}
