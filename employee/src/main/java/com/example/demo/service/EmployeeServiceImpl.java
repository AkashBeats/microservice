package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.entity.Employee;
import com.example.demo.vo.Department;
import com.example.demo.vo.ResponseTemplateVO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO employeedao;
	


	
	@Transactional
	public void save(Employee employee) {
		
		employeedao.save(employee);
		
	}

	@Transactional
	public List<Employee> getAll() {
		
		return employeedao.getAll();
		
	}

	@Transactional
	public ResponseTemplateVO get(Long id) {
		Employee employee=employeedao.get(id);
		RestTemplate resttemplate =new RestTemplate();
		Department department=resttemplate.getForObject("http://localhost:9001/department/dept/"+employee.getDepartmentId() 
				, Department.class);
	return new ResponseTemplateVO(employee,department);
		 
		
	}

}
