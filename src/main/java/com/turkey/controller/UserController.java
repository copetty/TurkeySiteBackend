package com.turkey.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.turkey.ajax.ClientMessage;
import com.turkey.models.User;

public interface UserController {
	
	ClientMessage registerUser(User user);
	
	ClientMessage updateUser(User user);
	
	User findUser(User user, HttpServletRequest request);
	
	List<User> findAllUsers();
	

}
