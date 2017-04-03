package me.gacl.test;

import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.gacl.domain.User;
import me.gacl.service.UserServiceI;

public class MyBatisTest {
	private UserServiceI userService;
	@Before
	     public void before(){
	         //使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
	         ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
	         //从Spring容器中根据bean的id取出我们要使用的userService对象
	         userService = (UserServiceI) ac.getBean("userService");
	     }
	     
	     @Test
	     public void testAddUser(){
	         //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
	         //UserServiceI userService = (UserServiceI) ac.getBean("userService");
	         User user = new User();
	         user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
	         user.setUserName("白虎神皇xdp");
	         user.setUserBirthday(new Date());
	         user.setUserSalary(10000D);
	         userService.addUser(user);
	     }

}
