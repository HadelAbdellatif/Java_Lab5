package com.sun;

import java.util.Date;

public class Ex1_Employee {

	private int departmentNo;
	private String name;
	private long id;
	private java.util.Date birthDate;
	private java.util.Date hireDate;
	private double basicSalary;

	// constructor
	public Ex1_Employee(int departmentNo, String name, long id, Date birthDate, Date hireDate, double basicSalary) {
		super();
		this.departmentNo = departmentNo;
		this.name = name;
		this.id = id;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
		this.basicSalary = basicSalary;
	}

	// setters and getters
	public int getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public java.util.Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
	}

	public java.util.Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(java.util.Date hireDate) {
		this.hireDate = hireDate;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Ex1_Employee [departmentNo=" + departmentNo + ", name=" + name + ", id=" + id + ", birthDate="
				+ birthDate + ", hireDate=" + hireDate + ", basicSalary=" + basicSalary + "]";
	}

}
