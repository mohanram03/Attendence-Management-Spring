package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Attendence;
import com.example.demo.services.AttendenceService;



@RestController
public class AttendenceController {
	
	@Autowired
	private AttendenceService service;
	
	
	@PostMapping(path="/attendence",produces="application/json",consumes ="application/json")
	public Attendence addAttendence(@RequestBody Attendence attendence) {
		
		return this.service.addAttendence(attendence);
	}
	@GetMapping(path="/attendenceMgr",produces="application/json")
	public List<Attendence> findAll(){

		return this.service.findAll();	
	}
	
	@GetMapping(path="/attendence/{attendenceId}",produces="application/json")
	public Attendence findById(@PathVariable("attendenceId")long attendenceId){
		Optional<Attendence> response= this.service.findById(attendenceId);
		
		Attendence found= null;
		if(response.isPresent()) {
			found=response.get();
		
		}
     return found;
		
	}

}
