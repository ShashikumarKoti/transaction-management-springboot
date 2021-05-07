package com.skoti.learning.dto;

public class OrgRequest {

	private Employee emp;
	private HealthInsuranceSchema schema;
	
	public OrgRequest() {
		super();
	}
	
	public OrgRequest(Employee emp, HealthInsuranceSchema schema) {
		super();
		this.emp = emp;
		this.schema = schema;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public HealthInsuranceSchema getSchema() {
		return schema;
	}
	public void setSchema(HealthInsuranceSchema schema) {
		this.schema = schema;
	}
	
	
}
