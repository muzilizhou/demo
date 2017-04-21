package com.sz.college.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sz.college.dao.StudentDao;
import com.sz.college.model.Student;
/**
 * 学员实现类
 * @author zhouxiaohu
 *
 */
public class StudentDaoImpl implements StudentDao {
	@Resource
	JdbcTemplate jdbcTemplateHIP;
	@Override
	public List<Student> selectObject() {
		return null;
	}

	@Override
	public Student selectCondition(String condition) {
		return null;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

}
