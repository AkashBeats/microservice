package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {
	public List<Department> getAll();
	public void save(Department department);
	public Department get(long id);
}
