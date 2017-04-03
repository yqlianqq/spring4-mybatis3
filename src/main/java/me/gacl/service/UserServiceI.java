package me.gacl.service;

import java.util.List;

import me.gacl.domain.User;

public interface UserServiceI {
	void addUser(User user);
	User getUserById(String userId);
	/**获取所有用户信息
	      * @return List<User>
	      */
	    List<User> getAllUser();

}
