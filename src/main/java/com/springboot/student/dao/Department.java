package com.springboot.student.dao;

public class Department {
	private int departmentId;
	private String departmentName;
	
	public Department() {
	}
	public Department(int departmentId, String deparartmentName) {
		this.departmentId = departmentId;
		this.departmentName = deparartmentName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	

}
