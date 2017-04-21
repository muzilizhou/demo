package com.sz.college.model;
/**
 * 位置表
 * @author zhouxiaohu
 *
 */
public class Position {
	private Integer ID;//ID
	private String Number;//编号
	private String Name;//名称
	private String Longitude;//经度
	private String	Latitude;//纬度
	private String Explan;//说明
	private String Status;//状态
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
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getExplan() {
		return Explan;
	}
	public void setExplan(String explan) {
		Explan = explan;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Position() {
		super();
	}
	
}
