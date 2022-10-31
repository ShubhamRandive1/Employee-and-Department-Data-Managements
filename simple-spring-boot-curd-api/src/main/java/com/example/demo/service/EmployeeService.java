package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.EmployeeNotfOUNDeXCEPTION;
import com.example.demo.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllListOfEmployees();
	
	public Employee getEmployeeByID(Integer ID)throws EmployeeNotfOUNDeXCEPTION;
	
	public void addTheEmployee(Employee emp);
	
	public void updateTheEmployee(Employee emp, Integer ID)throws EmployeeNotfOUNDeXCEPTION;
	
	public void deleteAllEmployee();
	
	public void deleteEmployeeByID(Integer id)throws EmployeeNotfOUNDeXCEPTION;

}
