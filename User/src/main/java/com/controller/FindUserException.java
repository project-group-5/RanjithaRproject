package com.controller;

public class FindUserException extends RuntimeException {
	private int id;
	public FindUserException(int id) {
		
		super("id "+id+" not found");
		this.id=id;
	}

	@Override
	public String toString() {
		return "User "+ "is" +" not available";
	}


}
