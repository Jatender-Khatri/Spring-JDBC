package com.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.model.Student;
public class RowMappedImpl implements org.springframework.jdbc.core.RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("s_id"));
		student.setAge(rs.getInt("age"));
		student.setAddress(rs.getString("address"));
		student.setName(rs.getString("s_name"));
		student.setRollNumber(rs.getString("roll_number"));
		return student;
	}

	
}
