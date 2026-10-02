package com.example.studentManagement.Student.Management.entity;

public class Student {

	private int id;
	private String name;
	private int age;
	private String domain;

	public Student(int id, String name, int age, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.domain = domain;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

}
