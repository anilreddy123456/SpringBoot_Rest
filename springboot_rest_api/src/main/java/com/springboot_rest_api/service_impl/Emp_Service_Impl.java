package com.springboot_rest_api.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot_rest_api.dao.EmployeeDao;
import com.springboot_rest_api.entity.Employee;
import com.springboot_rest_api.service.EmpService;


@Service
public class Emp_Service_Impl implements EmpService {
	
	@Autowired
	private EmployeeDao employeeDao;
	

	@Override
	public Employee saveEmp(Employee emp) {
		// TODO Auto-generated method stub
		return employeeDao.save(emp);
	}

	@Override
	public Employee updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		return employeeDao.saveAndFlush(emp);
	}

	@Override
	public List<Employee> getAllEmployeeList() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployee(Long empId) {
		// TODO Auto-generated method stub
		return (Employee) employeeDao.findAll();
	}

	@Override
	public void deleteEmp(Long empId) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(empId);

	}

}
