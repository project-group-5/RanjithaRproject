package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserService;

import com.model.User;

@RestController
public class UserRestController {
	@Autowired
	UserService service;
	
	@GetMapping("/findAll/")
	   public List<User> getAllSeat()
	   
	   {
		  
		   return service.findAll();
	   }
	 @GetMapping("/findAll/{id}")
	 public ResponseEntity<?> findAllUser(@PathVariable int id) throws SearchUserException
	   
	   { 
		 User u1=service.find(id);
		  if(u1==null) {
			  throw new SearchUserException(id);
		  }
		  
		    service.findAll();
		    return ResponseEntity.ok("Seat is available");
	   }
	 @PostMapping("/addUser")
	   public ResponseEntity<?> bookSeat(@RequestBody User user) throws AddUserException
	   {
		    
			int id = 0;
			User u1=service.find(id);
		     if(user.getPassword()==null)
		     {
				 throw new AddUserException(user);
					
				}
		     
		
		service.add(user);
		return ResponseEntity.status(HttpStatus.OK).body("User added successfully");
		
	   }
	 @DeleteMapping("/deleteUser/{id}")
	   public ResponseEntity<?> deleteSeat(@PathVariable int id)throws DeleteUserException 
	   {
		   User u1=service.find(id);
		   if(u1==null)
		   {
			   
			    throw new DeleteUserException(id);
		   }
		
		     	   service.delete(id);   
		      return ResponseEntity.ok("Seat deleted successfully");
	   }
	 @GetMapping("/findUser/{id}")
	  public ResponseEntity<?> searchSeat(@PathVariable int id)throws FindUserException
	  {
		  User u1=service.find(id);
		  if(u1==null) {
			  throw new FindUserException(id);
		  }
		  service.find(u1.getUserId());
		  return ResponseEntity.ok("User is found");
	  }
	 @PatchMapping("/updateSeat")
	 public ResponseEntity<?> updateSeat(@RequestBody User user) 
	   {
		    
			
			User u1=service.find(user.getUserId());
			if(u1==null) {
				
				throw new UpdateUserException();
				
			}
		service.update(user);
		return ResponseEntity.ok("  Seat Updated  Successfully ");
		
	   }

}
