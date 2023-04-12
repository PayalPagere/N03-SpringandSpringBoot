package org.tnsif.placementmanagement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placementmanagement.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService uservice;
	//to retrieve all recorrds in users
	
		@GetMapping("/users")
		public List<User> listAll()
		{
			return uservice.retrieveAll();
		}
		
		//retrieve with specific id
		@GetMapping("/users/{id}")
		public ResponseEntity<User>get(@PathVariable Integer id)
		{
			try
			{
				User user=uservice.retrieve(id);
				return new ResponseEntity<User>(user,HttpStatus.OK);
				
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
				
				
			}	
		}
		//remove data
		@DeleteMapping("/users/{id}")
		public void remove(@PathVariable Integer id) 
		{
			uservice.delete(id);
		}
		//insert the data
		@PostMapping("/users")
		public void insert(@RequestBody User user)
		{
			uservice.add(user);
		}
		//update
		@PutMapping("/users/{id}")
		public ResponseEntity<?>update(@RequestBody User user, @PathVariable Integer id)
		{
			try
			{
			User u1=uservice.retrieve(id);
			uservice.add(user);
			return new ResponseEntity<>(HttpStatus.OK);
			
			}
			catch(NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				
			}
			
		}
		
		
	
}
