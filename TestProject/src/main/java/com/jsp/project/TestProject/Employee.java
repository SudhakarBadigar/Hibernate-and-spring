package com.jsp.project.TestProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usn")
	private int id;
	@Column(name="EmployeeName",length=30)
	private String name;
	@Column(name="EmployeeSal")
	private double salary;
	@Transient
	private int x;
	public Employee() {

	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ",salary=" + salary + ", x=" + x + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	
		

}
