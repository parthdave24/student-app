package com.springboot.student.service;

import java.util.List;

import com.springboot.student.dao.Student;

public interface IStudentService {
	public List<Student> getAllStudents();
	
	public Student getStudent(int studentId);
	
	public void addStudent(Student student);
	
	public void updateStudent(int studentId, Student student);
	
	public void deleteStudent(int studentId);
	
}
