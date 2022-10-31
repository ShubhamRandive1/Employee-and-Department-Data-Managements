package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.DepartmentNotFoundException;
import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository deptRepo;

	@Override
	public List<Department> getAllListOfDepartment() {
		// TODO Auto-generated method stub
		List<Department> getAllDepartment = deptRepo.findAll();
		return getAllDepartment;
	}

	@Override
	public Department getDepartmentByID(Integer ID) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		
		
		return deptRepo.getOne(ID);
	}

	@Override
	public void addTheDepartment(Department dept) {
		// TODO Auto-generated method stub
		
		deptRepo.save(dept);
		
	}

	@Override
	public void updateTheDepartment(Department dept, Integer ID) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		
		if(ID == dept.getDeptID()) {
			
			deptRepo.save(dept);
		}
		
	}

	@Override
	public void deleteAllDepartments() {
		// TODO Auto-generated method stub
		
		deptRepo.deleteAll();
		
	}

	@Override
	public void deleteDepartmenByID(Integer id) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		deptRepo.deleteById(id);
	}



}
