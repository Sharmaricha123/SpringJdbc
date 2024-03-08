package com.spring.jdbc.annotataion.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class RowMapperImpl implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		return student;
	}
	

}
