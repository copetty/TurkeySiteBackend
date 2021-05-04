package com.turkey.service;


import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turkey.models.User;
import com.turkey.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	public boolean registerUser(User user) {
		String hashedPass = this.hashPassword(user.getPassword());
		user.setPassword(hashedPass);
		userRepository.save(user);
		
		return user.getId() != 0;
	}
	
	public String hashPassword(String password) {
		// it is MD5 byte
		MessageDigest md = null;
		
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_16BE));
		
		BigInteger bi = new BigInteger(1, hashedPassword);
		String hashed = bi.toString(16);
		
		return hashed;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public User getUser(String username, String userPassword) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateSavedCall(String save_calls, int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSavedCall(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
