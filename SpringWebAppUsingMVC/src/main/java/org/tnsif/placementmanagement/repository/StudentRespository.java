package org.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placemenetmanagement.entities.Student;

public interface StudentRespository extends JpaRepository<Student,Integer>{

	
	
}
