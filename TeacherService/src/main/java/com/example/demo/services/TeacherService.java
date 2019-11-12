package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Teacher;
import com.example.demo.repos.TeacherRepository;


@Service
public class TeacherService {

	@Autowired
	private TeacherRepository repo;
	
	
	public List<Teacher> findAll(){
		
		return this.repo.findAll();
		
	}
		public Teacher add(Teacher tea) {
		
		return this.repo.save(tea);
	}
}
