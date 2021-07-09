package com.purchase.home.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purchase.home.controler.HomeController;
import com.purchase.home.model.Employee;
import com.purchase.home.model.Items;
import com.purchase.home.repo.EmployeeRepo;
import com.purchase.home.repo.HomeRepo;
import com.purchase.home.service.EmpService;
import com.purchase.home.service.HomeService;

@Service
public class EmpServiceImpl implements EmpService {
	private static Logger logger = LoggerFactory.getLogger(EmpServiceImpl.class);
	@Autowired
	private EmployeeRepo empRepo; 

	@Override
	public List<Employee> getAllEmployees() { 
		return empRepo.findAll();
	}

	@Override
	public int getSecondSalary() { 
		return empRepo.getSecondHighSalary();
	}

}
