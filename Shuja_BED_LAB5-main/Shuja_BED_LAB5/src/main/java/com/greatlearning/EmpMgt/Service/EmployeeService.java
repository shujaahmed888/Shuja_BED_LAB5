package com.greatlearning.EmpMgt.Service;

import java.util.List;

import com.greatlearning.EmpMgt.Entity.Employee;



public interface EmployeeService {
	
	
	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(Long id);

}