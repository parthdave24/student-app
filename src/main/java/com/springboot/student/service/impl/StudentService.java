package com.springboot.student.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.student.dao.Department;
import com.springboot.student.dao.Student;
import com.springboot.student.service.IDepartmentService;
import com.springboot.student.service.IStudentService;

@Service
public class StudentService implements IStudentService {
	
	@Autowired
	IDepartmentService departmentService;
	
	private List<Student> students = new ArrayList<>(Arrays.asList(
			new Student(1,"Jhon", new Department(1,"Science")),
			new Student(2,"Sung", new Department(2,"Physics")),
			new Student(3,"Dave", new Department(3,"Maths"))));
	
	public List<Student> getAllStudents()
	{
		return students;
	}
	
	public Student getStudent(int studentId)
	{
		return students.stream().filter(t -> t.getStudentId() == studentId).findFirst().get();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void updateStudent(int studentId, Student student) {
		for(int i=0; i<students.size();i++ )
		{
			Student t = students.get(i);
			if(t.getStudentId()==(studentId))
			{
				students.set(i, student);
				return;
			}
		}
	}

	public void deleteStudent(int studentId) {
		students.removeIf(t -> t.getStudentId()==studentId);
	}

	public List<Student> getStudentInDispartment(int dipartmentId) {
		return students.stream().filter(t-> t.getDepartment().getDepartmentId() == dipartmentId).collect(Collectors.toList());
	}
}
