package com.turkey.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.turkey.models.User;

@Repository("userRepository")
@Transactional
public class UserRepositoryImpl implements UserRepository{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	

	public void save(User user) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(user);
		
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(User.class).list();
	}

	public User authentication(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateSavedCall(String savedCallIds, int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getSavedCall(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
