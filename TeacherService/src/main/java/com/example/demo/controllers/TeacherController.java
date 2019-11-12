package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.services.TeacherService;


@RestController
public class TeacherController {

	@Autowired
	private TeacherService service;
	
	@GetMapping(path="/teachers")
	public List<Teacher> findAll(){
		
		return this.service.findAll();
	}
	
	@PostMapping(path ="/teacher",produces = "application/json",consumes="application/json")
	public Teacher add(@RequestBody Teacher stu) {
		
		return this.service.add(stu);
	}
	
}
