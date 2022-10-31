package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.EmployeeNotfOUNDeXCEPTION;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllListOfEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empAll = empRepo.findAll();
		
		return empAll;
	}

	@Override
	public Employee getEmployeeByID(Integer ID) throws EmployeeNotfOUNDeXCEPTION {
		// TODO Auto-generated method stub
		
		;return empRepo.getById(ID);
	}

	@Override
	public void addTheEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		empRepo.save(emp);
		
	}

	@Override
	public void updateTheEmployee(Employee emp, Integer ID) throws EmployeeNotfOUNDeXCEPTION {
		// TODO Auto-generated method stub
		
		if(ID == emp.getEmployeeID()) {
			
			empRepo.save(emp);
		}
		
	}

	@Override
	public void deleteAllEmployee() {
		// TODO Auto-generated method stub
		
		empRepo.deleteAll();
		
	}

	@Override
	public void deleteEmployeeByID(Integer id) throws EmployeeNotfOUNDeXCEPTION {
		// TODO Auto-generated method stub
		
		empRepo.deleteById(id);
		
	}

}
