package com.springboot.student.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.student.dao.Department;
import com.springboot.student.service.IDepartmentService;

@Service
public class DepartmentService implements IDepartmentService {
	private List<Department> departments = new ArrayList<>(Arrays.asList(
			new Department(1, "Science"),
			new Department(2, "Physics"),
			new Department(3, "Maths")));
	
	public List<Department> getAllDepartments()
	{
		return departments;
	}
	
	public Department getDepartment(int departmentId)
	{
		return departments.stream().filter(t -> t.getDepartmentId() == (departmentId)).findFirst().get();
	}

	public void addDepartment(Department department) {
		departments.add(department);
	}

	public void updateDepartment(int departmentId, Department department) {
		for(int i=0; i<departments.size();i++ )
		{
			Department t = departments.get(i);
			if(t.getDepartmentId()== (departmentId))
			{
				departments.set(i, department);
				return;
			}
		}
	}

	public void deleteDepartment(int departmentId) {
		departments.removeIf(t -> t.getDepartmentId() == (departmentId));
	}
}
