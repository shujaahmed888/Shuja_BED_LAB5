package com.greatlearning.EmpMgt.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EmpMgt.Entity.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	

}