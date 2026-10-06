package com.example.studentManagement.Student.Management.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.studentManagement.Student.Management.entity.Student;

@Component
public class StudentService {

	private static List<Student> list = new ArrayList<>();
	
	static {
		list.add(new Student(101,"Aman",24, "Java"));					// list.get(0)
		list.add(new Student(102,"Himanshi",24, "Python"));				// list.get(1)
		list.add(new Student(103,"Rishu",24, "Python"));				// list.get(2)
		list.add(new Student(104,"Keshav",24, "Java"));					// list.get(3)
		list.add(new Student(105,"Anshuman",20, "Maths"));				// list.get(4)
	}
	
	
	public List<Student> getAllRecords() {
		return list;
	}
	
	
	public Student getRecordById(int id) {
		
		Student record = null;

		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i).getId() == id)
				record = list.get(i);
		}
		
		return record;
	}
	
	
	public List<Student> getAllRecordsByDomain(String domain) {
		
		List<Student> data = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			
			if(list.get(i).getDomain().equalsIgnoreCase(domain)) {
				
				data.add(list.get(i));
			}
		}
		
		return data;
	}
	
}
