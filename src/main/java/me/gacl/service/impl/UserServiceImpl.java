package me.gacl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.gacl.dao.UserMapper;
import me.gacl.domain.User;
import me.gacl.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI{

	@Autowired
    private UserMapper userMapper;//×¢Èëdao
	
	public void addUser(User user) {
		userMapper.insert(user);		
	}

	public User getUserById(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}
	

}
