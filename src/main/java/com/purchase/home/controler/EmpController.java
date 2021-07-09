package com.purchase.home.controler;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purchase.home.advice.ItemNotFoundException;
import com.purchase.home.model.Employee;
import com.purchase.home.model.Items;
import com.purchase.home.repo.EmployeeRepo;
import com.purchase.home.service.EmpService;
import com.purchase.home.service.HomeService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin
@RequestMapping("/v1/emp")
public class EmpController {
	private static Logger logger = LoggerFactory.getLogger(EmpController.class);
	@Autowired
	private EmpService empService;

	@GetMapping
	public ResponseEntity<String> welcome() {
		String greetings = "Welcome to Emp Details...";
		HttpHeaders headers = new HttpHeaders();
		headers.add("content", "welcome Employee");
		logger.info("welcome()");
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(greetings);

	}

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllItems() {
		logger.info("getAllItems()");
		HttpHeaders headers = new HttpHeaders();
		headers.add("type", "get All Items");
		var lists = empService.getAllEmployees();
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(lists);

	}
	
	@GetMapping("/secondSalary")
	public ResponseEntity<String> getSecondSalary() {
		logger.info("getAllItems()");
		HttpHeaders headers = new HttpHeaders();
		headers.add("type", "get second Heighest Salary");
		var salary =  "The Second High Salary is - Rs."+empService.getSecondSalary();
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(salary);

	}

	
}
