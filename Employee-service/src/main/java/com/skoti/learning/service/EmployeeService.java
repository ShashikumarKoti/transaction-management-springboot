package com.skoti.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skoti.learning.entity.Employee;
import com.skoti.learning.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmp(Employee emp) {
		Employee empDB = employeeRepository.save(emp);
		return empDB;
	}
	
	public void removeEmp(int empID) {
		employeeRepository.deleteById(empID);
	}
}
