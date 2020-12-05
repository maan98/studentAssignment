package com.org.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dxc.model.Student;
import com.org.dxc.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	StudentRepository repository;

	@Override
	public Student insertStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		Student stu=repository.findById(student.getId()).get();
		stu.setEmail(student.getEmail());
		return repository.save(stu);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Student> deleteStudent(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return repository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
}
