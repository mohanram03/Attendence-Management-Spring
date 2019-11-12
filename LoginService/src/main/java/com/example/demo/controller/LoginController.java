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
import com.example.demo.entity.User;
import com.example.demo.services.LoginService;



@RestController
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	
	@PostMapping(path="/user",produces="application/json",consumes ="application/json")
	public User add(@RequestBody User user) {
		
		return this.service.add(user);
	}
	@GetMapping(path="/users",produces="application/json")
	public List<User> findAll(){

		return this.service.findAll();	
	}
	
	@PostMapping(produces="text/text",consumes ="application/json")
	public String AuthenticateUser(@RequestBody User user) {
		
		User originalUser = findById(user.getUserId());
		if((user!=null)&&(user.getUserType().equals(originalUser.getUserType()))&&(user.getPassWord().equals(originalUser.getPassWord()))){
			return "Login SuccessFul";
		}
		else {
			return "Invalid UserId and Password";
		}
	
	
	}
	@GetMapping(path="/users/{userId}",produces="application/json")
	public User findById(@PathVariable("userId")long userId){
		Optional<User> response= this.service.findById(userId);
		
		User found= null;
		if(response.isPresent()) {
			found=response.get();
		
		}
     return found;
		
	}

}
