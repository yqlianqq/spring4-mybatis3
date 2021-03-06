package me.gacl.test;

import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.gacl.domain.Employee;
import me.gacl.service.EmployeeServiceI;

public class MyBatisTest {
	private EmployeeServiceI employeeService;
	@Before
	     public void before(){
	         //使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
	         ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
	         //从Spring容器中根据bean的id取出我们要使用的userService对象
	         employeeService = (EmployeeServiceI) ac.getBean("employeeService");
	     }
	     
	     @Test
	     public void testAddEmployee(){
	         //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
	         //UserServiceI userService = (UserServiceI) ac.getBean("userService");
	         Employee employee = new Employee();
//	         employee.setEmpId(UUID.randomUUID().toString().replaceAll("-", ""));
	         employee.setEmpName("白虎神皇xdp");
//	         employee.setUserBirthday(new Date());
//	         employee.setUserSalary(10000D);
	         employeeService.addEmployee(employee);
	     }

}
