package com.controller;

public class UpdateUserException extends RuntimeException {
	public UpdateUserException() {
		super("User is not available to Update");	
		}

		@Override
		public String toString() {
			return "User is not available  to update";
		}
}
