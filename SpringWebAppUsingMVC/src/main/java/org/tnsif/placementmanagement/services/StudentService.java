/*package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placemenetmanagement.entities.Student;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	public private StudentRepository repo;
	
	//additon or creation or insertion
	public void add(Student student)
	{
		repo.save(student);
	}
	//to retrive particular ID 
	public void retrieve(Integer id)
	{
		repo.findById(id).get();
		
	}
	//delete
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}
	
	public List<Student>retreiveAll()
	{
		return repo.findAll();
	}
	
	
}
*/