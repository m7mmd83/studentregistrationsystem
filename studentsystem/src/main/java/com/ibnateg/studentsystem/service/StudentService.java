package com.ibnateg.studentsystem.service;

import java.util.List;

import com.ibnateg.studentsystem.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();
}
