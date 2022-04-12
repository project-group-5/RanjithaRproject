package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserProfileService;
import com.model.UserProfileDetails;

@RestController
public class UserController {
	
	@RequestMapping("/")
	public UserProfileDetails getProfile() {
		return new UserProfileDetails();
	}
	
	

}
