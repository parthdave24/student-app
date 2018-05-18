package com.springboot.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.student.dao.Department;
import com.springboot.student.service.impl.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping("/departments")
	public List<Department> getAllDepartments()
	{
		return departmentService.getAllDepartments();
	}
	@RequestMapping("/departments/{departmentId}")
	public Department getDepartment(@PathVariable int departmentId)
	{
		return departmentService.getDepartment(departmentId);
	}
	@RequestMapping(method=RequestMethod.POST, value="/departments")
	public void addDepartment(@RequestBody Department department)
	{
		departmentService.addDepartment(department);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/departments/{departmentId}")
	public void updateTopic(@RequestBody Department department, @PathVariable int departmentId)
	{
		departmentService.updateDepartment(departmentId, department);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/departments/{departmentId}")
	public void deleteDepartment(@PathVariable int departmentId)
	{
		departmentService.deleteDepartment(departmentId);
	}
}