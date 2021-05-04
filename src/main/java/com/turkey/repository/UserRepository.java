package com.turkey.repository;

import java.util.List;

import com.turkey.models.User;


public interface UserRepository {
	
	void save(User user);
	
	void update(User user);
	
	List<User> findAll();
	
	User authentication(String userName, String password);
	
	User findByUserName(String username);
	
	String updateSavedCall(String savedCallIds, int userId);
	
	String getSavedCall(int user_id);

}
