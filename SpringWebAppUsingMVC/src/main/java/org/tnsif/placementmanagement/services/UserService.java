package org.tnsif.placementmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagement.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userrepo;
	
	//insertion/addition/creation
	public void add(User user)
	{
		userrepo.save(user);
	}
	
	//retrieve with specific id
	public User retrieve(Integer id)
	{
		return userrepo.findById(id).get();
	}
	
	//delete
	public void delete(Integer id)
	{
		userrepo.deleteById(id);
	}
	
	//to retrieve all the recordes
	public List<User> retrieveAll(){
		return userrepo.findAll();
	}
}
