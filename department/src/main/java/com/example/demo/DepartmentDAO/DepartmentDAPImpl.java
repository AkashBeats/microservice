package com.example.demo.DepartmentDAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Department;

@Repository

public class DepartmentDAPImpl implements DepartmentDAO{
	
	@Autowired
    EntityManager em;


	@Override
	public List<Department> getAll() {
       Session session =em.unwrap(Session.class);
       
       Query<Department> query=session.createQuery("from Department",Department.class);
       
      return query.getResultList();
	
	}

	@Override
	public void save(Department department) {
	
		Session session =em.unwrap(Session.class);
		
		session.saveOrUpdate(department);
		
	}

	@Override
	public Department get(long id) {
	
		Session session=em.unwrap(Session.class);
		
		return session.get(Department.class, id);
	}

}
