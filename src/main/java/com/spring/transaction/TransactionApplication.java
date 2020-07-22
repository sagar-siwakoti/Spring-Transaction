package com.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.transaction.model.Employee;
import com.spring.transaction.model.EmployeeHealthInsurance;
import com.spring.transaction.service.EmployeeService;
import com.spring.transaction.service.OrganizationService;

@SpringBootApplication
public class TransactionApplication {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TransactionApplication.class, args);
		OrganizationService organizationService = context.getBean(OrganizationService.class);

		Employee emp = new Employee();
		emp.setEmpId("emp1");
		emp.setEmpName("emp1");

		EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
		employeeHealthInsurance.setEmpId("emp1");
		employeeHealthInsurance.setHealthInsuranceSchemeName("premium");
		employeeHealthInsurance.setCoverageAmount(20000);

		organizationService.joinOrganization(emp, employeeHealthInsurance);

	}
}