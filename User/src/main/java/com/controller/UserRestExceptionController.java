package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class UserRestExceptionController {
	@ExceptionHandler(SearchUserException.class)
    public ResponseEntity<?> handleFindException(SearchUserException e,WebRequest req)
    {
	
		
		  return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
		
    }
	@ExceptionHandler(DeleteUserException.class)
    public ResponseEntity<?> handleDeleteException(DeleteUserException e,WebRequest req)
    {
	
		
		  return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
		
    }@ExceptionHandler(FindUserException.class)
    public ResponseEntity<?> handleFindException(FindUserException e,WebRequest req)
    {
	
		
		  return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
		
    }
    @ExceptionHandler(UpdateUserException.class)
    public ResponseEntity<?> handleUpdateSeatException(UpdateUserException e,WebRequest req)
    {
	
		
		  return new ResponseEntity<>(e.toString(),HttpStatus.NOT_FOUND);
		
    }

}
