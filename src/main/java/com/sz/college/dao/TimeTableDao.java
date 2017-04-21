package com.sz.college.dao;

import java.util.List;

import com.sz.college.model.TimeTable;

/**
 * 课程接口
 * @author zhouxiaohu
 *
 */
public interface TimeTableDao {
	/**
	 * 课程查找
	 * @return
	 */
	public List<TimeTable> slectObject();
	/**
	 * 条件查找
	 * @param condition
	 * @return
	 */
	public TimeTable selectCondition(String condition);
	/**
	 * 根据ID查找对象
	 * @param id
	 * @return
	 */
	public TimeTable slectById(int id);
	/**
	 * 课程添加
	 * @param timetanle
	 * @return
	 */
	public int addTimeTable(TimeTable timetanle);
	/**
	 * 课程删除
	 * @param timetable
	 */
	public void deleteTimeTable(TimeTable timetable);
	/**
	 * 课程修改
	 * @param timetable
	 */
	public void UpdateTimeTable(TimeTable timetable);
}
