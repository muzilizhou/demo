package com.sz.college.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.sz.college.dao.TeacherDao;
import com.sz.college.model.Teacher;
import com.sz.college.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {
	@Resource
	TeacherDao teacherDao;
	@Override
	public List<Teacher> selectObject() {
		return teacherDao.selectObject();
	}

	@Override
	public Teacher selectCondition(String condition) {
		return teacherDao.selectCondition(condition);
	}

	@Override
	public void addTeacher(Teacher teacher) {
		teacherDao.addTeacher(teacher);
	}

	@Override
	public void deleteTeacher(Teacher teacher) {
		teacherDao.deleteTeacher(teacher);
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		teacherDao.updateTeacher(teacher);
	}

}
