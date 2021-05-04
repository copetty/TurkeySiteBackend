package com.turkey.service;

import java.util.List;

import com.turkey.models.User;

public interface UserService {
	
	public boolean registerUser(User user);
	
	public List<User> getAllUsers();
	
	public User getUser(String username, String userPassword);
	
	public User getByUsername(String username);
	
	public String updateSavedCall(String save_calls, int user_id);
	
	public String getSavedCall(int user_id);
	
	public boolean updateUser(User user);

}
