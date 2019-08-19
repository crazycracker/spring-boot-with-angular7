package com.vinay.springboot.springmvcfullstackapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.springboot.springmvcfullstackapplication.model.Employee;
import com.vinay.springboot.springmvcfullstackapplication.repository.EmployeeRepository;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping(value = "/rest")
public class TestController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping(value = "/employees")
	public List<Employee> getListOfEmployees(){
		return employeeRepository.findAll();
	}
}
