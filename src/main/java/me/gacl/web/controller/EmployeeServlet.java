package me.gacl.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import me.gacl.domain.Employee;
import me.gacl.service.EmployeeServiceI;

@WebServlet("/employeeServlet")
public class EmployeeServlet extends HttpServlet {
	
	private EmployeeServiceI employeeService;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	             throws ServletException, IOException {
	         //获取所有的用户信息
	         List<Employee> lstEmployees = employeeService.getAllEmployee();
	         request.setAttribute("lstEmployees", lstEmployees);
	         request.getRequestDispatcher("/index.jsp").forward(request, response);
	     }
	     
	     public void doPost(HttpServletRequest request, HttpServletResponse response)
	             throws ServletException, IOException {
	         this.doGet(request, response);
	    }
	 
	     public void init() throws ServletException {
	         //在Servlet初始化时获取Spring上下文对象(ApplicationContext)
	         ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
	         //从ApplicationContext中获取employeeServlet
	         employeeService = (EmployeeServiceI) ac.getBean("employeeService");
	     }

}
