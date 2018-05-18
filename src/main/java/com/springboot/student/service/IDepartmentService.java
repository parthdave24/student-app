package com.springboot.student.service;

import java.util.List;

import com.springboot.student.dao.Department;

public interface IDepartmentService {
	public List<Department> getAllDepartments();
	
	public Department getDepartment(int departmentId);
	
	public void addDepartment(Department department);
	
	public void updateDepartment(int departmentId, Department department);
	
	public void deleteDepartment(int departmentId);
}
