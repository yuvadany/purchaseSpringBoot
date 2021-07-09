package com.purchase.home.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.purchase.home.model.Employee;
import com.purchase.home.model.Items;

@Service
public interface EmpService {
	public List<Employee> getAllEmployees();
	public int getSecondSalary();

}
