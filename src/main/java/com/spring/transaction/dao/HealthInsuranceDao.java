package com.spring.transaction.dao;

import com.spring.transaction.model.EmployeeHealthInsurance;
/*
 * @created 22/07/2020-4:51 PM
 * @project transaction
 * @author Sagar Siwakoti
 */
public interface HealthInsuranceDao {
	void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

	void deleteEmployeeHealthInsuranceById(String empid);
}