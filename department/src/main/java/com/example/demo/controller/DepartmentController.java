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

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	
	@Autowired
	DepartmentService departmentservice;
	
	@PostMapping("/dept")
	public ResponseEntity<?> save(@RequestBody Department department){
		
		departmentservice.save(department);
		
		return new ResponseEntity<Department>(department,HttpStatus.CREATED);
	}
	@GetMapping("/dept")
	public ResponseEntity<?> getAll(){
		List<Department> list=departmentservice.getAll();
		return new ResponseEntity<List<Department>>(list,HttpStatus.OK);
	}
	@GetMapping("/dept/{id}")
	public ResponseEntity<?> get(@PathVariable long id ){
		Department dep=departmentservice.get(id);
		return new ResponseEntity<Department>(dep,HttpStatus.OK);
	}
}
