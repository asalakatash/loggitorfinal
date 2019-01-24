package com.LoggitorApp.LoggitorApp.web;

import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LoggitorApp.LoggitorApp.domain.Users;
import com.LoggitorApp.LoggitorApp.domain.UserRepository;
import com.LoggitorApp.LoggitorApp.domain.UsersOnHP;


@RestController
public class UserController {
	@Autowired 
	private UserRepository repository;

	  @RequestMapping("/usersonhp")
	  public Set<UsersOnHP> getUsersOnHP() 
	  {
         return repository.getUsersOnHP();	 
      }

//	@RequestMapping("/users")
//	public Iterable<User> getUsers() {
//        return UserRepository.findAll();
//	} 
}
