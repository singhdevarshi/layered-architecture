package com.btc.app.service;

import java.sql.SQLException;
import java.util.List;

import com.btc.app.dao.EmployeeDao;
import com.btc.app.dao.EmployeeDaoImpl;
import com.btc.app.dao.EmployeeDaoJdbcImpl;
import com.btc.app.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao daoObj;
	
	public EmployeeServiceImpl() {
		daoObj = new EmployeeDaoJdbcImpl();
	}

	@Override
	public Employee addEmployee(Employee employee) throws SQLException {
		return daoObj.addEmployee(employee);
	}

	@Override
	public Employee searchEmployeeById(int employeeId) throws SQLException {
		return daoObj.searchEmployeeById(employeeId);
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) throws SQLException {
		
		return daoObj.deleteEmployeeById(employeeId);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws SQLException {
		
		return daoObj.updateEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() throws SQLException {
		 return daoObj.getAllEmployee();
	}

	
	
	
}