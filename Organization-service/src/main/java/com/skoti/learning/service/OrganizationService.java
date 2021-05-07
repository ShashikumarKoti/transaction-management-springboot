package com.skoti.learning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.skoti.learning.dto.Employee;
import com.skoti.learning.dto.HealthInsuranceSchema;
import com.skoti.learning.dto.OrgRequest;

@Service
public class OrganizationService {

	@Autowired
	private RestTemplate restTemplate;
	
	public void joinOrganization(OrgRequest request ) {
		String emp_url = "http://localhost:8081/saveEmp";
		String insurance_url = "http://localhost:8082/saveInsurance";
		Employee postForObject = restTemplate.postForObject(emp_url, request.getEmp(), Employee.class);
		HealthInsuranceSchema postForObject2 = restTemplate.postForObject(insurance_url, request.getSchema(), HealthInsuranceSchema.class);
		System.out.println("Empoyee:" + postForObject);
		System.out.println("Insurance: "+ postForObject2);
	}
	
}
