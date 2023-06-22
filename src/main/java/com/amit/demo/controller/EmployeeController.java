package com.amit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amit.demo.entity.Employee;
import com.amit.demo.service.EmployeeSeviceImpl;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeSeviceImpl employeeSeviceImpl;

	@GetMapping
	public ResponseEntity<List<Employee>> findAllEmployee() {
		List<Employee> allEmployee = employeeSeviceImpl.getAllEmployee();
		return new ResponseEntity<List<Employee>>(allEmployee, HttpStatus.OK);
	}

}
