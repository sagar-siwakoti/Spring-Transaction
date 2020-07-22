package com.spring.transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.transaction.dao.HealthInsuranceDao;
import com.spring.transaction.model.EmployeeHealthInsurance;
import com.spring.transaction.service.HealthInsuranceService;
/*
 * @created 22/07/2020-4:51 PM
 * @project transaction
 * @author Sagar Siwakoti
 */
@Service
public class HealthInsuranceServiceImpl implements HealthInsuranceService {

	@Autowired
	HealthInsuranceDao healthInsuranceDao;

	@Override
	public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) {
		healthInsuranceDao.registerEmployeeHealthInsurance(employeeHealthInsurance);
	}

	@Override
	public void deleteEmployeeHealthInsuranceById(String empid) {
		healthInsuranceDao.deleteEmployeeHealthInsuranceById(empid);
	}

}