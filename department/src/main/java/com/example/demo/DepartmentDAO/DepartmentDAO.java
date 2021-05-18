package com.example.demo.DepartmentDAO;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentDAO {

	public List<Department> getAll();
	public Department get(long id);
	public void save(Department department);
}
