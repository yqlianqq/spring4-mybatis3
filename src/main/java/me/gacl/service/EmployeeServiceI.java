package me.gacl.service;

import java.math.BigInteger;
import java.util.List;

import me.gacl.domain.Employee;

public interface EmployeeServiceI {
	void addEmployee(Employee employee);
	Employee getEmployeeById(Long id);
	/**获取所有用户信息
	      * @return List<Employee>
	      */
	    List<Employee> getAllEmployee();

}
