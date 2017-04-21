package com.sz.college.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sz.college.dao.TeacherDao;
import com.sz.college.model.Teacher;
/**
 * 教员实现类
 * @author zhouxiaohu
 *
 */
@Repository("teacherDao")
public class TeacherDaoImpl implements TeacherDao {

	@Override
	public List<Teacher> selectObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher selectCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

}
