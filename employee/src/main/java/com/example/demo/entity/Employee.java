package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long employeeId;
private String firstName;
private String lastName;
private String email;
private long departmentId;


public Long getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Long employeeId) {
	this.employeeId = employeeId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(long departmentId) {
	this.departmentId = departmentId;
}
public Employee(Long employeeId, String firstName, String lastName, String email, long departmentId) {
	super();
	this.employeeId = employeeId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.departmentId = departmentId;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}



}
