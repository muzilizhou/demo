package com.sz.college.dao;

import java.util.List;

import com.sz.college.model.Student;

/**
 * 学员接口
 * @author zhouxiaohu
 *
 */
public interface StudentDao {
	/**
	 * 学员查找
	 * @return
	 */
	public List<Student> selectObject();
	/**
	 * 条件查找
	 * @param condition
	 * @return
	 */
	public Student selectCondition(String condition);
	/**
	 * 学员添加
	 * @param student
	 */
	public void addStudent(Student student);
	/**
	 * 学员信息修改
	 * @param student
	 */
	public void updateStudent(Student student);
	/**
	 * 学员删除
	 * @param student
	 */
	public void deleteStudent(Student student);
}
