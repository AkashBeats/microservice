package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDAO {

	public void save(Employee employee);
	public List<Employee> getAll();
	public Employee get(Long id);
}
