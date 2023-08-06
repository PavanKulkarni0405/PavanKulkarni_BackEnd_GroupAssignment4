package com.greatlearning.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.emp.model.Role;
import com.greatlearning.emp.model.User;
import com.greatlearning.emp.service.RoleService;
import com.greatlearning.emp.service.UserService;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping("/roles")
	public Role createRole(@RequestBody Role role){
		return this.roleService.createRole(role);
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		
		return this.userService.createUser(user);
	}
}

