package com.sz.college.service;

import java.util.List;

import com.sz.college.model.Teacher;

/**
 * 教员服务层
 * @author zhouxiaohu
 *
 */
public interface TeacherService {
	/**
	 * 教员查找
	 * @return
	 */
	public List<Teacher> selectObject();
	/**
	 * 条件查找
	 * @param condition
	 * @return
	 */
	public Teacher selectCondition(String condition);
	/**
	 * 教员添加
	 * @param teacher
	 */
	public void addTeacher(Teacher teacher);
	/**
	 * 教员删除
	 * @param teacher
	 */
	public void deleteTeacher(Teacher teacher);
	/**
	 * 教员修改
	 * @param teacher
	 */
	public void updateTeacher(Teacher teacher);
}
