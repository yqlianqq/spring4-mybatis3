package me.gacl.service;

import me.gacl.domain.User;

public interface UserServiceI {
	void addUser(User user);
	User getUserById(String userId);

}
