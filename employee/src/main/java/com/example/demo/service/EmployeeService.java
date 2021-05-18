package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;
import com.example.demo.vo.ResponseTemplateVO;

public interface EmployeeService {

	public void save(Employee employee);
	public List<Employee> getAll();
	public ResponseTemplateVO get(Long id);
}
