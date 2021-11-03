package com.btc.app.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.btc.app.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
		
		private static Map<Integer, Employee> employees=new HashMap<>();
		
		

		@Override
		public Employee addEmployee(Employee employee) {
			
			employees.put(employee.getEmployeeId(), employee);
			return employee;
		}

		@Override
		public Employee searchEmployeeById(int employeeId) {
			if(employees.containsKey(employeeId)==true) {
			return employees.get(employeeId);
			}
			return null;
		}

		@Override
		public boolean deleteEmployeeById(int employeeId) {
			
			if(employees.containsKey(employeeId)==true) {
				employees.remove(employeeId);
				return true;
			}
			else {
				return false;
			}
			
		}

		@Override
		public Employee updateEmployee(Employee employee) {
			if(employees.containsKey(employee.getEmployeeId())==true) {
			employees.put(employee.getEmployeeId(), employee);
			return employee;
			}
			return null;
			
			
		}

		@Override
		public List<Employee> getAllEmployee() {
			
			List<Employee> emps= new ArrayList<Employee>(employees.values());
			
			return emps;
		}

}
