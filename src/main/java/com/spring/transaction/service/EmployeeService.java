package com.spring.transaction.service;

import com.spring.transaction.model.Employee;
/*
 * @created 22/07/2020-4:51 PM
 * @project transaction
 * @author Sagar Siwakoti
 */
public interface EmployeeService {
	void insertEmployee(Employee emp);

	void deleteEmployeeById(String empid);
}