package com.skoti.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skoti.learning.entity.Employee;
import com.skoti.learning.service.EmployeeService;

@RestController
public class EmployeeContrller {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmp")
	public Employee saveEmp(@RequestBody Employee emp) {
		System.out.println("Employee controller called");
		return employeeService.saveEmp(emp);
	}

	@DeleteMapping("/removeEmp")
	public void removeEmp(int empID) {
		employeeService.removeEmp(empID);
	}
}
