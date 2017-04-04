package me.gacl.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.gacl.dao.EmployeeMapper;
import me.gacl.domain.Employee;
import me.gacl.service.EmployeeServiceI;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeServiceI {

	@Autowired
	private EmployeeMapper employeeMapper;// ×¢Èëdao

	public void addEmployee(Employee employee) {
		employeeMapper.insert(employee);
	}
	public Employee getEmployeeById(Long id) {
		return employeeMapper.selectByPrimaryKey(id);
	}
	public List<Employee> getAllEmployee() {
		return employeeMapper.getAllEmployee();
	}



}
