package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Student;
import com.example.demo.repos.StudentRepository;


@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	
	public List<Student> findAll(){
		
		return this.repo.findAll();
		
	}
		public Student add(Student stu) {
		
		return this.repo.save(stu);
	}
}
