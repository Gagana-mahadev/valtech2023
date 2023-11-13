package com.valtech.training.spring.service;

import com.valtech.training.hibernate.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee e);

	Employee makeActive(Employee e);

	Employee makeInactive(Employee e);

	Employee increamentSalary(Employee e, float increament);

	void increamentSalaryForAll(int increament);

}