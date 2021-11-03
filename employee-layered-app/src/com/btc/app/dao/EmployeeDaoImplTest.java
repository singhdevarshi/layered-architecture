package com.btc.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.btc.app.model.Employee;
public class EmployeeDaoImplTest {
EmployeeDao dao=new EmployeeDaoImpl();
	
	
	
	@Test
	void testAddEmployee() throws SQLException {
		Employee emp=new Employee(1006,"Uttam Reddy",LocalDate.parse("1994-02-10"),"uttam@gmail.com");
		
		assertEquals(emp, dao.addEmployee(emp));
		
	}

	@Test
	void testSearchEmployeeById() {
		assert(dao.searchEmployeeById(1006)) != null;
	}

//	@Test
//	void testDeleteEmployeeById() {
//		assert(dao.deleteEmployeeById(1006));
//	}

	@Test
	void testUpdateEmployee() {
		Employee emp=new Employee(1006,"Uttam Singh",LocalDate.parse("1994-02-10"),"uttamS@gmail.com");
		assertEquals(emp, dao.updateEmployee(emp));
	}

	@Test
	void testGetAllEmployee() {
		
	}
}
