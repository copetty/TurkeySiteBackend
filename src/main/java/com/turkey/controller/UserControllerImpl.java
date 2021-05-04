package com.turkey.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.turkey.util.ClientMessageUtil.*;

import com.turkey.ajax.ClientMessage;
import com.turkey.models.User;
import com.turkey.service.UserService;

@Controller("userController")
@CrossOrigin(origins = "http://localhost:4200")
public class UserControllerImpl implements UserController{
	
	@Autowired
	private UserService userService;

	
	@PostMapping("/register")
	public @ResponseBody ClientMessage registerUser(@RequestBody User user) {
		System.out.println("this is register " + user);
		// TODO Auto-generated method stub
		return (userService.registerUser(user)) ? REGISTRATION_SUCCESSFUL : SOMETHING_WRONG;
	}

	public ClientMessage updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUser(User user, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/findAllUsers")
	public @ResponseBody List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userService.getAllUsers();
	}

}
