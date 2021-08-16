package com.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.dao.StudentDao;
import com.model.Student;

public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	public Integer addStudent(Student student) {
		Integer roll = null;
		try {
			String addQuery = "INSERT INTO student(s_name,roll_number,age,address) VALUES(?,?,?,?)";
			roll = this.jdbcTemplate.update(addQuery,student.getName(),student.getRollNumber(),student.getAge(),student.getAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	public List<Student> getStudents() {
		String query = "SELECT * FROM student";
		List<Student> list = this.jdbcTemplate.query(query, new RowMappedImpl());
		return list;
	}

	public Integer deleteStudent(Student student) {
		Integer roll = null;
		try {
			String deleteQuery = "DELETE FROM student WHERE s_id=?";
			roll = this.jdbcTemplate.update(deleteQuery,student.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}

	public Student getStudentById(int id) {
		String query = "SELECT * FROM student WHERE s_id = ?";
		RowMapper<Student> mapper = new RowMappedImpl();
		Student student = this.jdbcTemplate.queryForObject(query, mapper,id);
		return student;
	}

	public Integer updateStudent(Student student) {
		Integer roll = null;
		try {
			String updateQuery = "UPDATE student SET s_name=?,roll_number=?,age=?,address=? WHERE s_id =?";
			roll = this.jdbcTemplate.update(updateQuery,student.getName(),student.getRollNumber(),student.getAge(),student.getAddress(),student.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return roll;
	}
	public Student getStudentByName(String name) {
		String query = "SELECT * FROM student WHERE s_name = ?";
		RowMapper<Student> mapper = new RowMappedImpl();
		Student student = this.jdbcTemplate.queryForObject(query, mapper,name);
		return student;
	}

	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
