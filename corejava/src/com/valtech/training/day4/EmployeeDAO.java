package com.valtech.training.day4;

import java.sql.SQLException;
import java.util.List;

import com.valtech.training.day3.Employee;

public interface EmployeeDAO {

	public long count() throws SQLException;

	void deleteEmployee(int id) throws SQLException;

	void updateEmployee(Employee emp) throws SQLException;

	void createEmployee(Employee emp) throws SQLException;

	List<Employee> getEmployees() throws SQLException;

	Employee getEmployee(int id) throws SQLException;

}