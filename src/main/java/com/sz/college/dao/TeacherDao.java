package com.sz.college.dao;

import java.util.List;

import com.sz.college.model.Teacher;

/**
 * 教员接口
 * @author zhouxiaohu
 *
 */
public interface TeacherDao {
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
