package com.skoti.learning.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skoti.learning.entity.HealthInsuranceSchema;
import com.skoti.learning.repository.HealthInsuranceRepository;

@Service
public class HealthInsuranceService {

	@Autowired
	private HealthInsuranceRepository healthInsuranceRepository;
	
	public HealthInsuranceSchema registerInsurance(HealthInsuranceSchema healthInsuranceSchema) {
		if(healthInsuranceSchema.getEmpID()==11)
			throw new RuntimeException("id absconded");
		HealthInsuranceSchema insuranceSchema = healthInsuranceRepository.save(healthInsuranceSchema);
		return insuranceSchema;
	}
	
	public void deletInsuranceByEmpId(int empID) {
		healthInsuranceRepository.deleteById(empID);
	}
}
