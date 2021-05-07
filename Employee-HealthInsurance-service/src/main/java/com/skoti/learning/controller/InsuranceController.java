package com.skoti.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skoti.learning.entity.HealthInsuranceSchema;
import com.skoti.learning.entity.service.HealthInsuranceService;

@RestController
public class InsuranceController {

	@Autowired
	private HealthInsuranceService healthInsuranceService;
	
	@PostMapping("/saveInsurance")
	public HealthInsuranceSchema saveInsurance(@RequestBody HealthInsuranceSchema insuranceSchema) {
		System.out.println("Insurance schema controller called");
		return healthInsuranceService.registerInsurance(insuranceSchema);
	}
	
	@DeleteMapping("/removeSchema/")
	public void removeSchema(int empID) {
		healthInsuranceService.deletInsuranceByEmpId(empID);
	}
}
