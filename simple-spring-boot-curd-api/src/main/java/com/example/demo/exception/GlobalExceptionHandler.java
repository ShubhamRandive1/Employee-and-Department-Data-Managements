package com.example.demo.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(EmployeeNotfOUNDeXCEPTION.class)
	public ResponseEntity<MyErroException> employeeNotFoundException(EmployeeNotfOUNDeXCEPTION ex, WebRequest req){
		
		
		
		MyErroException err = new MyErroException();
		
		err.setLocalStamp(LocalDateTime.now());
		err.setMessage(ex.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErroException>(err,HttpStatus.NOT_FOUND);
		
		
	}
	
	
	
	@ExceptionHandler(DepartmentNotFoundException.class)
	public ResponseEntity<MyErroException> departNotFoundException(DepartmentNotFoundException dx, WebRequest req){
		
		
		
		MyErroException err = new MyErroException();
		
		err.setLocalStamp(LocalDateTime.now());
		err.setMessage(dx.getMessage());
		err.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErroException>(err,HttpStatus.NOT_FOUND);
		
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErroException> otherExceptionHandler(Exception se, WebRequest req){
		
		
		MyErroException err = new MyErroException();
		
		err.setLocalStamp(LocalDateTime.now());
		err.setMessage(se.getMessage());
		err.setDetails(req.getDescription(false));
				
		return new ResponseEntity<MyErroException>(err, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}


}
