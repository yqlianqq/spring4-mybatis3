package me.gacl.service;

import java.util.List;

import me.gacl.domain.User;

public interface UserServiceI {
	void addUser(User user);
	User getUserById(String userId);
	/**��ȡ�����û���Ϣ
	      * @return List<User>
	      */
	    List<User> getAllUser();

}
