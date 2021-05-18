package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DepartmentDAO.DepartmentDAO;
import com.example.demo.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDAO departmentdao;
	
	@Override
	@Transactional
	public List<Department> getAll() {
		 
		return departmentdao.getAll();
	}

	@Override
	@Transactional
	public void save(Department department) {
	  departmentdao.save(department);
	}

	@Override
	public Department get(long id) {
		return departmentdao.get(id);
	}

}
