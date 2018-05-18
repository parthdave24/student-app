package com.springboot.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.student.dao.Student;
import com.springboot.student.service.impl.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	@RequestMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId)
	{
		return studentService.getStudent(studentId);
	}
	@RequestMapping(method=RequestMethod.POST, value="/students")
	public void addTopic(@RequestBody Student student)
	{
		studentService.addStudent(student);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/students/{studentId}")
	public void updateTopic(@RequestBody Student student, @PathVariable int studentId)
	{
		studentService.updateStudent(studentId, student);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/students/{studentId}")
	public void deleteStudent(@PathVariable int studentId)
	{
		studentService.deleteStudent(studentId);
	}
	
	@RequestMapping("/studentsInDepartment/{dipartmentId}")
	public List<Student> getStudentInDipartment(@PathVariable int dipartmentId)
	{
		return studentService.getStudentInDispartment(dipartmentId);
	}
}