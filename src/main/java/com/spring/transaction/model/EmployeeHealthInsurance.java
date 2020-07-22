package com.spring.transaction.model;

public class EmployeeHealthInsurance {
	/*
	 * @created 22/07/2020-4:51 PM
	 * @project transaction
	 * @author Sagar Siwakoti
	 */
	private String empId;
	private String healthInsuranceSchemeName;
	private int coverageAmount;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getHealthInsuranceSchemeName() {
		return healthInsuranceSchemeName;
	}
	public void setHealthInsuranceSchemeName(String healthInsuranceSchemeName) {
		this.healthInsuranceSchemeName = healthInsuranceSchemeName;
	}
	public int getCoverageAmount() {
		return coverageAmount;
	}
	public void setCoverageAmount(int coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

}
