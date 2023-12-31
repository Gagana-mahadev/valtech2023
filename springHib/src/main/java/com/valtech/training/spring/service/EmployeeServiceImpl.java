package com.valtech.training.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.training.hibernate.Employee;
import com.valtech.training.spring.dao.EmployeeDAO;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee createEmployee(Employee e) {
		return employeeDAO.saveEmployee(e);

	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public Employee makeActive(Employee e) {

		e.setActive(true);
		return employeeDAO.updateEmployee(e);

	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public Employee makeInactive(Employee e) {
		e.setActive(false);
		return employeeDAO.updateEmployee(e);

	}

	@Override
	public Employee increamentSalary(Employee e, float increament) {
		e.setSalary(e.getSalary() + increament);
		return employeeDAO.updateEmployee(e);

	}

	@Override
	public void increamentSalaryForAll(int increament) {
		 employeeDAO.getAllEmployees().forEach(e -> e.setSalary(e.getSalary() + increament));
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

}
