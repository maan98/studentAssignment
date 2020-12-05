package com.org.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dxc.model.Student;
import com.org.dxc.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	@PostMapping("/student")
	public Student insertStudent(@RequestBody Student student) {
		return service.insertStudent(student);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id){
		return service.getStudentById(id);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
	}
}
