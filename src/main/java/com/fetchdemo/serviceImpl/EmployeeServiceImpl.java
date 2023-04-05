package com.fetchdemo.serviceImpl;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fetchdemo.model.Employee;
import com.fetchdemo.repository.EmployeeRepo;
import com.fetchdemo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public Employee savedata(Employee employee) {

		return employeeRepo.save(employee);
	}

	@Override
	public Employee findEmployeeById(Long id, Employee employee) {

		return employeeRepo.findById(id).orElseThrow();
	}

	@Override
	public Employee updateById(Long id, Employee employee) {

		Optional<Employee> employee2 = employeeRepo.findById(id);
		if (employee2.isPresent()) {
			Employee emp = new Employee();
			emp.setLname(employee.getLname());
			emp.setName(employee.getName());

			return employeeRepo.save(emp);

		}
		return null;

	}

	@Override
	public Employee deletedataById(Long id) {
		employeeRepo.deleteById(id);
		return null;
	}

	@Override
	public List<Employee> fetchalldetails() {
		  
		return employeeRepo.findAll();
	}
}
