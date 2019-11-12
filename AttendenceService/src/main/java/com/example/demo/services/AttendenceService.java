package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Attendence;
import com.example.demo.repos.AttendenceRepository;

@Service
public class AttendenceService {
	
	@Autowired
	private AttendenceRepository repo;
	
	public Attendence addAttendence(Attendence attendence) {
		return this.repo.save(attendence);
	}
	public List<Attendence> findAll(){
		return this.repo.findAll();
	}
	public Optional<Attendence> findById(long id){
	 return this.repo.findById(id); 
   }
//	public void deleteById(Long id) {
		//this.repo.deleteById(id);
	//}
}
