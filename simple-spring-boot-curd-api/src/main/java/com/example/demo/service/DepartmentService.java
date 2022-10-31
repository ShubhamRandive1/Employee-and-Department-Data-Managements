package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.DepartmentNotFoundException;
import com.example.demo.model.Department;

public interface DepartmentService {
	
	List<Department> getAllListOfDepartment();
	
	public Department getDepartmentByID(Integer ID)throws DepartmentNotFoundException;
	
	public void addTheDepartment(Department dept);
	
	public void updateTheDepartment(Department dept, Integer ID)throws DepartmentNotFoundException;
	
	public void deleteAllDepartments();
	
	public void deleteDepartmenByID(Integer id)throws DepartmentNotFoundException;

}
