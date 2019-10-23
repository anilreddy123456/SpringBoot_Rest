package com.springboot_rest_api.service;

import java.util.List;

import com.springboot_rest_api.entity.Employee;

public interface EmpService {

	 Employee saveEmp(Employee emp);
	 
	 Employee updateEmp(Employee emp);
	 
	 List<Employee> getAllEmployeeList();
	 
	 Employee getEmployee(Long empId);

	 void deleteEmp(Long empId);

	 
		
		
	
	 
}
