package com.fetchdemo.service;

import java.util.List;

import com.fetchdemo.model.Employee;



public interface EmployeeService {

	Employee savedata(Employee employee);

	Employee findEmployeeById(Long id, Employee employee);

	Employee updateById(Long id, Employee employee);

	Employee deletedataById(Long id);

	List<Employee> fetchalldetails();
	

}
