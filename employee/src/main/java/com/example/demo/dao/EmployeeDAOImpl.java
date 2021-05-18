package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	EntityManager em;
	
	@Override
	public void save(Employee employee) {
		 Session session =em.unwrap(Session.class);
		 
		 session.save(employee);
		
	}

	@Override
	public List<Employee> getAll() {
		
		 Session session =em.unwrap(Session.class);
		 
		 Query<Employee> query=session.createQuery("from Employee",Employee.class);
		 List<Employee> list=query.getResultList();
		 return list;
	}

	@Override
	public Employee get(Long id) {
		Session session =em.unwrap(Session.class);

		return session.get(Employee.class, id);
		
	}

}
