package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	public Integer addStudent(Student student);

	public List<Student> getStudents();

	public Integer deleteStudent(Student student);

	public Student getStudentById(int id);

	public Integer updateStudent(Student student);

	public Student getStudentByName(String name);
}
