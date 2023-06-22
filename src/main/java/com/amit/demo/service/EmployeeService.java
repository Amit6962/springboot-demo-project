package com.amit.demo.service;

import java.util.List;

import com.amit.demo.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();

	public Employee addNewEmployee(Employee emp);

	public Employee findEmpById(Integer id);

	public Employee updateExistingEmp(Integer id, Employee emp);

	public void deleteEmployee(Integer id);

}
