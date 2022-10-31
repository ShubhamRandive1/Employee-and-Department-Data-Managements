package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.DepartmentNotFoundException;
import com.example.demo.exception.EmployeeNotfOUNDeXCEPTION;
import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class EmployeeControllerHandler {
	
	@Autowired
	private EmployeeServiceImpl empImpl;
	
	
	
	@GetMapping("/Employees")
	public List<Employee> getAllEmployee(){
		
		return empImpl.getAllListOfEmployees();
	}
	
	
	@GetMapping("/Employees/{id}")
	public Employee getEmployeeBYID(@PathVariable Integer id) throws EmployeeNotfOUNDeXCEPTION{
		
		return empImpl.getEmployeeByID(id);
	}
	
	@PostMapping("/Employees")
	public void addEmployee(@RequestBody Employee emp){
		empImpl.addTheEmployee(emp);
	}
	
	@PutMapping("/Employees/{id}")
	public void updateTheEmployees(@RequestBody Employee emp, @PathVariable Integer id) throws EmployeeNotfOUNDeXCEPTION{
		
		empImpl.updateTheEmployee(emp, id);
	}
	
	@DeleteMapping("Employees/{id}")
	public void deleteEmployeeByID(@RequestBody Employee emp, @PathVariable Integer id) throws EmployeeNotfOUNDeXCEPTION{
		
		empImpl.deleteEmployeeByID(id);
	}
	
	@DeleteMapping("/Employees")
	public void deleteAllDepartments(){
		
		empImpl.deleteAllEmployee();
	}


}
