package com.vinay.springboot.springmvcfullstackapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinay.springboot.springmvcfullstackapplication.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
