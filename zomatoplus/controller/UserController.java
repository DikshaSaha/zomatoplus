/*package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;


@RestController
@RequestMapping("/user")
public class UserController {

	static Set<User> userSet; 
	
/*
	
    /*public String userLogin() {
	 	return "Hello";
	 }
	 */
	   
	 
	/*public User userLogin() {
	 	User user=new User();
	 	user.setUsername("XY");
	 	user.setPassword("1234");
	 	return user;
	 }
	 */
	/*public List<User> userLogin() {
		User user1= new User("Jane Doe", "supercalifragilisticexpialidocious");
		User user2= new User("John Doe", "winter is coming");
		User user3= new User("Jane John", "abracadabra");
		List<User> userList=new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		return userList;
	}*/
	/*@GetMapping("/all")
	public Set<User> userLogin(){
		User user1= new User("Jane Doe", "supercalifragilisticexpialidocious");
		User user2= new User("John Doe", "winter is coming");
		User user3= new User("Jane John", "abracadabra");
		Set<User> userSet=new HashSet<>();
		userSet.add(user1);
		userSet.add(user2);
		userSet.add(user3);
		return userSet;
		
	}*/
	/*@GetMapping("/create")
	public User create(@RequestParam(value="username") String username, @RequestParam(value="password") String password)
	{
		User user1=new User(username, password);
		return user1;
	}*/
	/*
	@PostMapping("/create")
	public User create(@RequestBody User user)
	{
		System.out.println(user.toString());
		return user;
	}*/
	/*
	@PostMapping("/create")
	public User create(@RequestBody User user)
	{
		
			if(userSet.isEmpty())
			{
				userSet=new HashSet();
				userSet.add(user);
				System.out.println("Registration successful!");
				return user;
				
			}
			else if(userSet.contains(user))
			{
				System.out.println("User already exists");
				return null;
			}
			else
			{
				userSet.add(user);
				System.out.println("Registration successful!");
				return user;
			}
	}
	@PostMapping("/login")
	public User login(@RequestBody User user)
	{
		if(!userSet.isEmpty() && userSet.contains(user))
		{
			System.out.println("Login success!");
			return user;
		}
		else
		{
			System.out.println("Invalid username or password.");
			return null;
		}
		
	}
}
*/
package com.thinkxfactor.zomatoplus.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repo.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController{
	@Autowired
	private UserRepository userRepository; // declaring the interface
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		User persistedUser=userRepository.save(user);
		return persistedUser;
	}
	@GetMapping("/getAll")
	public List<User> getAll()
	{
		List<User> users=userRepository.findAll();
		return users;
	}
}


	