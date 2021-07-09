package com.purchase.home.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.purchase.home.model.Employee; 

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	 @Query(nativeQuery = true,value = "call getEmpSecondSalary")
	  public int getSecondHighSalary();
}
