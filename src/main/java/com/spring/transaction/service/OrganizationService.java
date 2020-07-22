package com.spring.transaction.service;

import com.spring.transaction.model.Employee;
import com.spring.transaction.model.EmployeeHealthInsurance;
/*
 * @created 22/07/2020-4:51 PM
 * @project transaction
 * @author Sagar Siwakoti
 */
public interface OrganizationService {

	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);

}
