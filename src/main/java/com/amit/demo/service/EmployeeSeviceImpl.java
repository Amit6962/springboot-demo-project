package com.amit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.demo.entity.Employee;
import com.amit.demo.repository.EmployeeRepository;

@Service
public class EmployeeSeviceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	@Override
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

	@Override
	public Employee addNewEmployee(Employee emp) {

		return null;
	}

	@Override
	public Employee findEmpById(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public Employee updateExistingEmp(Integer id, Employee emp) {

		return null;
	}

	@Override
	public void deleteEmployee(Integer id) {

	}

}
