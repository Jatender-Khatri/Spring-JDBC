package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.daoImpl.StudentDaoImpl;

public class Result {
	public static void main(String ages[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		StudentDaoImpl studentDao = context.getBean("studentDaoImpl",StudentDaoImpl.class);
		
		 /*      Add Students
		Student s = new Student();
		s.setAddress("Umerkot");
		s.setAge(21);
		s.setName("Jai Kumar");
		s.setRollNumber("18CS44");
		studentDao.addStudent(s);
		System.out.println("Data Added Successfully");*/
		
		/*       Updated Record
		Student s = new Student();
		s.setAddress("Umerkot");
		s.setAge(21);
		s.setName("Jethananad");
		s.setRollNumber("2K19/AA/23");
		s.setId(4);
		studentDao.updateStudent(s);
		System.out.println("Updated Added Successfully");*/
		
		/*       Get Student By ID
		
		Student s = studentDao.getStudentById(1);
		System.out.println(s.toString());*/
		
		/*       Get Student By Name
		
		Student s = studentDao.getStudentByName("Naresh Khatri");
		System.out.println(s.toString());*/
		
		
		/*       Get All Student
		List<Student> list = studentDao.getStudents();
		for(Student student : list)
		{
			System.out.println(student.toString());
		}*/
	}
}
