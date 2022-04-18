package com.controller;

import com.model.*;

public class AddUserException extends RuntimeException{
	private static int id;
	private Object duration;
	private Object password;
	public AddUserException(User user) {
		
		User u1=new User();
		this.password=password;
	
		
	}

	@Override
	public String toString() {
		return  "User not added";
	}

}
