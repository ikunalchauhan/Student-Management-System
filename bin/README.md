# Student Management REST API 🎓

A simple **Spring Boot REST API project** designed to help students understand the fundamentals of **REST API development and CRUD operations**.

Instead of using a real database, this project uses a Java `List` as an **in-memory fake database**, allowing students to focus on understanding how REST APIs work without the additional complexity of JPA, Hibernate, or MySQL.

## 🎯 Learning Objectives

Through this project, students will learn:

* REST API fundamentals
* HTTP methods — GET, POST, PUT, DELETE
* CRUD operations
* JSON request and response
* `@RestController`
* `@RequestMapping`
* `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`
* `@PathVariable`
* `@RequestBody`
* HTTP status codes
* Controller and Service layers
* Basic exception handling
* Testing APIs using Postman

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Web
* Maven
* Postman
* In-memory `List` as a fake database

## 📌 Project Scope

The application provides APIs to:

* Create a student
* Get all students
* Get a student by ID
* Update a student
* Delete a student

This project intentionally avoids a real database so that students can first understand the **complete REST API request → controller → service → data flow** before moving on to JPA, MySQL, MongoDB, and other persistence technologies.
