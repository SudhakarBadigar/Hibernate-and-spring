package com.IsARelationshipTabelePerClass.ORM;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

//@Entity
////@DiscriminatorColumn(name = "etype")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@MappedSuperclass

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="etype", discriminatorType = DiscriminatorType.STRING)
public class Employee {
	@Id
	private int id;
	private String name;
	private String email;
    private double  salary;
	
    public Employee() {

	}

	public Employee(int id, String name, String email, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}	

}
