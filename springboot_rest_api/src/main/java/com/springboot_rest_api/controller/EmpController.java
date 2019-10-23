package com.springboot_rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_rest_api.entity.Employee;
import com.springboot_rest_api.service.EmpService;

@RequestMapping("/employee")
@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee emp ) {
		
		return empService.saveEmp(emp);
	}
	
	@PostMapping("/update")
	public Employee update(@RequestBody Employee emp) {
		return empService.updateEmp(emp);
	}
	
	@PostMapping("/all")
	public List<Employee> getAllEmployee(){
		return empService.getAllEmployeeList();
	}
	
	@PostMapping("/by/{empId}")
	public Employee getEmployee(@PathVariable(name="empId") Long empId) {
		return empService.getEmployee(empId);
		
	}
	
	@PostMapping("/delete/{empId}")
	public void deleteEmployee(@PathVariable(name="empId") Long empId) {
		empService.deleteEmp(empId);
	}

}
