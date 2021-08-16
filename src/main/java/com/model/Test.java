package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String args[])
	{
		System.out.println("Spring JDBC Templete");
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		JdbcTemplate template =context.getBean("student",JdbcTemplate.class);
		
		String insertQuery = "INSERT INTO student(s_name,roll_number,age,address) VALUES(?,?,?,?)";
		
		String updateQuery = "UPDATE student SET s_name=?,roll_number=?,age=?,address=? WHERE s_id =?;";
		
		String deleteQuery = "DELETE FROM student WHERE s_id=?";
		
		Integer result = template.update(insertQuery,"Raja Kumar","18SE23",23,"Sukker");
		System.out.println("Number of Recorded Insert : " + result);
		
		Integer result2 = template.update(updateQuery,"Turab Bajeer","18CS45",21,"Tharparkar",4);
		System.out.println("Number of Recorded Updated : " + result2);
		
		
		Integer result1 = template.update(deleteQuery,3);
		System.out.println("Number of Recorded Delete : " + result1);
	}
}
