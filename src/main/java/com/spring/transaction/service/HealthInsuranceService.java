package com.spring.transaction.service;

import com.spring.transaction.model.EmployeeHealthInsurance;
/*
 * @created 22/07/2020-4:51 PM
 * @project transaction
 * @author Sagar Siwakoti
 */
public interface HealthInsuranceService {
	void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

	void deleteEmployeeHealthInsuranceById(String empid);
}