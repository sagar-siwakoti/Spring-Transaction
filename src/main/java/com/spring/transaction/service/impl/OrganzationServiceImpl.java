package com.spring.transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.transaction.model.Employee;
import com.spring.transaction.model.EmployeeHealthInsurance;
import com.spring.transaction.service.EmployeeService;
import com.spring.transaction.service.HealthInsuranceService;
import com.spring.transaction.service.OrganizationService;

@Service
public class OrganzationServiceImpl implements OrganizationService {
	/*
	 * @created 22/07/2020-4:51 PM
	 * @project transaction
	 * @author Sagar Siwakoti
	 */
	@Autowired
	EmployeeService employeeService;

	@Autowired
	HealthInsuranceService healthInsuranceService;

	@Override
	@Transactional
	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
		employeeService.insertEmployee(employee);
		if (employee.getEmpId().equals("emp1")) {
			throw new RuntimeException("thowing exception to test transaction rollback");
		}
		healthInsuranceService.registerEmployeeHealthInsurance(employeeHealthInsurance);
	}

	@Override
	@Transactional
	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance) {
		employeeService.deleteEmployeeById(employee.getEmpId());
		healthInsuranceService.deleteEmployeeHealthInsuranceById(employeeHealthInsurance.getEmpId());
	}
}