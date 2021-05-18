package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.vo.ResponseTemplateVO;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	

	
	
	@Autowired
	EmployeeService employeeservice;
	@PostMapping("/emp")
	public ResponseEntity<?> save(@RequestBody Employee employee) {
		employeeservice.save(employee);
		return new ResponseEntity<Employee> (employee,HttpStatus.CREATED);
		
	}
	@GetMapping("/emp")
	public ResponseEntity<?> getAll() {
		List<Employee> emp= employeeservice.getAll();
		return new ResponseEntity<List<Employee> > (emp,HttpStatus.OK);
		
	}
	@GetMapping("/emp/{id}")
	public ResponseEntity<?> get(@PathVariable long id) {
		ResponseTemplateVO restVo =employeeservice.get(id);
		
		return new ResponseEntity<ResponseTemplateVO> (restVo,HttpStatus.OK);
		
		
		
	}

}
