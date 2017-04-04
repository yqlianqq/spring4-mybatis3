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
	         //ʹ��"spring.xml"��"spring-mybatis.xml"�����������ļ�����Spring������
	         ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
	         //��Spring�����и���bean��idȡ������Ҫʹ�õ�userService����
	         employeeService = (EmployeeServiceI) ac.getBean("employeeService");
	     }
	     
	     @Test
	     public void testAddEmployee(){
	         //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
	         //UserServiceI userService = (UserServiceI) ac.getBean("userService");
	         Employee employee = new Employee();
//	         employee.setEmpId(UUID.randomUUID().toString().replaceAll("-", ""));
	         employee.setEmpName("�׻����xdp");
//	         employee.setUserBirthday(new Date());
//	         employee.setUserSalary(10000D);
	         employeeService.addEmployee(employee);
	     }

}
