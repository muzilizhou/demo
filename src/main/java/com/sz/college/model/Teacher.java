package com.sz.college.model;
/**
 * 教员表
 * @author zhouxiaohu
 *
 */
public class Teacher {
	private Integer	ID;//ID
	private String Number;//学号
	private String Name;//学员姓名
	private String UserName;//用户名称
	private String Password;//密码
	private String Sex;//性别
	private String Card;//身份证号
	private String Email;//邮箱
	private String Phone;//手机号
	private String Explan;//说明
	private Integer Type;//类型(0:普通用户-学员;1:普通用户-教员;2:管理员-教务人员)
	private Integer Status;//状态(0:正常;1:禁用)
	private String Unit;//所属单位
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
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getCard() {
		return Card;
	}
	public void setCard(String card) {
		Card = card;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getExplan() {
		return Explan;
	}
	public void setExplan(String explan) {
		Explan = explan;
	}
	public Integer getType() {
		return Type;
	}
	public void setType(Integer type) {
		Type = type;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	public String getUnit() {
		return Unit;
	}
	public void setUnit(String unit) {
		Unit = unit;
	}
	public Teacher() {
		super();
	}
	
	}
