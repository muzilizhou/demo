package com.sz.college.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.sz.college.dao.TimeTableDao;
import com.sz.college.model.TimeTable;
import com.sz.college.service.TimeTableService;

public class TimeTableServiceImpl implements TimeTableService {
	@Resource
	TimeTableDao timeTableDao;
	@Override
	public List<TimeTable> slectObject() {
		return timeTableDao.slectObject();
	}
	@Override
	public TimeTable selectCondition(String condition) {
		return timeTableDao.selectCondition(condition);
	}
	@Override
	public TimeTable slectById(int id) {
		return timeTableDao.slectById(id);
	}
	@Override
	public int addTimeTable(TimeTable timetanle) {
		return timeTableDao.addTimeTable(timetanle);
	}
	@Override
	public void deleteTimeTable(TimeTable timetable) {
		timeTableDao.deleteTimeTable(timetable);
	}
	@Override
	public void UpdateTimeTable(TimeTable timetable) {
		timeTableDao.UpdateTimeTable(timetable);
	}

}
