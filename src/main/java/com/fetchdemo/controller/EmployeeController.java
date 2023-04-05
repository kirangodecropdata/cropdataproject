package com.fetchdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fetchdemo.model.Employee;
import com.fetchdemo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
private EmployeeService employeeService;

@PostMapping
public ResponseEntity<Employee> savedetails(@RequestBody Employee employee){
	Employee emp=employeeService.savedata(employee);
	return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
}
@GetMapping("/{id}")
public ResponseEntity<Employee> fetchdata(@PathVariable Long id,@RequestBody Employee employee){
	Employee emp1=employeeService.findEmployeeById(id,employee);
	return new ResponseEntity<Employee>(emp1,HttpStatus.OK);
}
@PutMapping("/{id}")
public ResponseEntity<Employee> updatadata(@PathVariable Long id,@RequestBody Employee employee){
	Employee emp2=employeeService.updateById(id,employee);
	return new ResponseEntity<Employee>(emp2,HttpStatus.OK);
}

@DeleteMapping("{id}")
public ResponseEntity<Employee> deletedata(@PathVariable Long id){
	Employee emp3=employeeService.deletedataById(id);
	return ResponseEntity.ok().body(emp3);
	
}

@GetMapping
public ResponseEntity<List<Employee>> fetchAlldata(){
	List<Employee> emp4=employeeService.fetchalldetails();
	return new ResponseEntity<List<Employee>>(emp4,HttpStatus.OK);
}

}
