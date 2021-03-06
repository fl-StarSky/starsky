package com.hand.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public List<User> queryPage() {
		return userDao.queryPage();
	}
	public void insert(User user) {
		userDao.insert(user);
	}
}
