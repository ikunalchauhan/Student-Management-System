package com.example.studentManagement.Student.Management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.studentManagement.Student.Management.entity.Student;

@Component
public class StudentService {

	private static List<Student> list = new ArrayList<>();
	
	static {
		list.add(new Student(101,"Aman",24, "Java"));
		list.add(new Student(102,"Himanshi",24, "Python"));
		list.add(new Student(103,"Rishu",24, "Python"));
		list.add(new Student(104,"Keshav",24, "Java"));
		list.add(new Student(105,"Anshuman",20, "Maths"));
	}
	
	
	public List<Student> getAllRecords() {
		return list;
	}
}
