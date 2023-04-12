/*package org.tnsif.placementmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.placemenetmanagement.entities.Student;
import org.tnsif.placementmanagement.services.StudentService;

@RestController
public class StudentController {

	public static void main(String[] args) {
		
		@Autowired
		private StudentService service;
		
		public List<Student>listAll()
		{
			
			return service.retreiveAll();
			
		}
		public void get()
		{
			return service.findAll();
		}
		
		//to insert a 
		@PutMapping("/students/id")
		public ResponseEntity<?>update(@RequestBody Student student,@PathVariable Integer id){
			try {
				Student s1=service.retrieve(id);
				service.add(student);
				return new ResponseEntity<>(HttpStatus.OK);
				
			}
			catch()
			{
				
			}
		}
		
	}

}
*/