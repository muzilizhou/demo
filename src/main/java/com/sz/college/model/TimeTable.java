package com.sz.college.model;
/**
 * 课程表
 * @author zhouxiaohu
 *
 */
public class TimeTable {
	private Integer ID;//ID
	private String Number;//课程编号
	private String Name;//课程名称
	private	String Position;//课程地点
	private String Explan;//课程说明
	private String Time;//课程时间
	private String Teacher;//任课教师
	private String Operation;//操作
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public String getExplan() {
		return Explan;
	}
	public void setExplan(String explan) {
		Explan = explan;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getTeacher() {
		return Teacher;
	}
	public void setTeacher(String teacher) {
		Teacher = teacher;
	}
	public String getOperation() {
		return Operation;
	}
	public void setOperation(String operation) {
		Operation = operation;
	}
	public TimeTable() {
		super();
	}
	
}
