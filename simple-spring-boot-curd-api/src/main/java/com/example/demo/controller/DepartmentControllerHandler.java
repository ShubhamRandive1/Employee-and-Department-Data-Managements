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
import com.example.demo.model.Department;
import com.example.demo.service.DepartmentServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class DepartmentControllerHandler {
	
	@Autowired
	private DepartmentServiceImpl deptImpl;
	
	@GetMapping("/Departments")
	public List<Department> getAllDepartments(){
		
		return deptImpl.getAllListOfDepartment();
	}
	
	@GetMapping("/Departments/{id}")
	public Department getDepartmentUsingId(@PathVariable Integer id) throws DepartmentNotFoundException {
		
		return deptImpl.getDepartmentByID(id);
	}
	
	@PostMapping("/Departments")
	public void addDepartment(@RequestBody Department dept){
		deptImpl.addTheDepartment(dept);
	}
	
	@PutMapping("/Departments/{id}")
	public void updateDepartment(@RequestBody Department dept, @PathVariable Integer id) throws DepartmentNotFoundException{
		deptImpl.updateTheDepartment(dept, id);
	}
	
	@DeleteMapping("Departments/{id}")
	public void deleteDepartmentByID(@RequestBody Department dept, @PathVariable Integer id) throws DepartmentNotFoundException{
		deptImpl.deleteDepartmenByID(id);
	}
	
	@DeleteMapping("/Departments")
	public void deleteAllDepartments(){
		
		deptImpl.deleteAllDepartments();
	}

}
