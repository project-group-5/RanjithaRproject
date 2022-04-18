package com.controller;

public class SearchUserException extends RuntimeException {
	private int id;
	public SearchUserException(int id) {
		
		super("id "+id+" not found");
		this.id=id;
	}

	@Override
	public String toString() {
		return "User "+ "is" +" not available";
	}

}
