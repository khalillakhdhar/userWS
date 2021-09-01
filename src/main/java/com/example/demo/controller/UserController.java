package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.entities.UserInterface;

@RestController
public class UserController {
@Autowired 
UserInterface userRepository;
@GetMapping("user")
public List<User> findusers()
{
return userRepository.findAll();	
}
@PostMapping("user")
public User addUser(@Valid @RequestBody User user)

{
return userRepository.save(user);	
}



	
	
}
