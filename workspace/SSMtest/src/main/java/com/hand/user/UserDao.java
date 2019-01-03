package com.hand.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private SqlSession sqlSession;


	public List<User> queryPage() {
		List<User> list = sqlSession.selectList("com.hand.user.User.queryPage", User.class);
		return list;
	}
	
	public void insert(User user) {
		sqlSession.insert("com.hand.user.User.insert",  User.class);
	}

}
