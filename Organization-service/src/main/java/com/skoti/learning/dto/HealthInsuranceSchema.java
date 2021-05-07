package com.skoti.learning.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HealthInsuranceSchema {

	@Id
	private int empID;
	private String schemaName;
	private int coverageAmount;
	
	public HealthInsuranceSchema() {
		super();
	}

	public HealthInsuranceSchema(int empID, String schemaName, int coverageAmount) {
		super();
		this.empID = empID;
		this.schemaName = schemaName;
		this.coverageAmount = coverageAmount;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getSchemaName() {
		return schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public int getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(int coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	@Override
	public String toString() {
		return "HealthInsuranceSchema [empID=" + empID + ", schemaName=" + schemaName + ", coverageAmount="
				+ coverageAmount + "]";
	}
	
	
}
