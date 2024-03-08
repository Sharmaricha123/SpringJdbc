package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		// TODO Auto-generated method stub
//		   insert query
	        String query="insert into student(id,name) values(?,?)";
	        int r=this.jdbcTemplate.update(query,student.getId(),student.getName());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int change(Student student) {
		// TODO Auto-generated method stub
		String query="update student set name=? where id=?";
		int r=this.jdbcTemplate.update(query,student.getName(),student.getId());
		return r;
	}

	public int delete(int studentId) {
		// TODO Auto-generated method stub
		String query="delete from student where id=?";
		int r=this.jdbcTemplate.update(query,studentId);
		return r;
		
	}

	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
		return student;
	}

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		String query="select * from student";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		List<Student> students=this.jdbcTemplate.query(query,rowMapper);
		return students;
	}

	
	
	
	

}
