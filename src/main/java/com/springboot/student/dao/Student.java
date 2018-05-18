package com.springboot.student.dao;

public class Student{
	
	private int studentId;
	private String studentName;
	private Department department;
	
	public Student(int studentId, String studentName, Department department) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Department getDepartment() {
		return department;
	}
}