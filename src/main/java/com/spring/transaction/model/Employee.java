package com.spring.transaction.model;

public class Employee {
	/*
	 * @created 22/07/2020-4:51 PM
	 * @project transaction
	 * @author Sagar Siwakoti
	 */
	private String empId;
	private String empName;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}