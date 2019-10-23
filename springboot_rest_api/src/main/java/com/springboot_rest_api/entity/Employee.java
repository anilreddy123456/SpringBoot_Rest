package com.springboot_rest_api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employee")
@Setter
@Getter
public class Employee {
	
	@Id
	@Column(name="eid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long empId;
	
	@Column
	private String ename;
	
	@Column(name="esalary")
	private int salary;
	
	
	
	

}
