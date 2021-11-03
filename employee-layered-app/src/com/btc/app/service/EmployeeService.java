package com.btc.app.service;

import java.sql.SQLException;
import java.util.List;

import com.btc.app.model.Employee;

public interface EmployeeService {
   public Employee addEmployee(Employee employee) throws SQLException;
	
	public Employee searchEmployeeById(int employeeId) throws SQLException;
	
	public boolean deleteEmployeeById(int employeeId) throws SQLException;
	
	public Employee updateEmployee(Employee employee) throws SQLException;
	
	public List<Employee> getAllEmployee() throws SQLException;
}
