package com.sz.college.model;
/**
 * 用户表
 * @author zhouxiaohu
 *
 */
public class User {
	private Integer	ID;//ID
	private String Number;//用户编号
	private String Name;//用户姓名
	private String UserName;//用户名称
	private String Password;//密码
	private Integer Sex;//性别
	private String Card;//身份证号
	private String Email;//邮箱
	private String Phone;//手机号
	private String Explan;//说明
	private Integer UserType;//类型(0:普通用户-学员;1:普通用户-教员;2:管理员-教务人员)
	private Integer Status;//状态(0:正常;1:禁用)
	private String UnitNumber;//所属单位编号
	private String UnitName;//所属单位名称
	private String UnitAddress;//所属单位地址
	private String UnitPhone;//所属单位电话
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
	public Integer getSex() {
		return Sex;
	}
	public void setSex(Integer sex) {
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
	public Integer getUserType() {
		return UserType;
	}
	public void setUserType(Integer userType) {
		UserType = userType;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	public String getUnitNumber() {
		return UnitNumber;
	}
	public void setUnitNumber(String unitNumber) {
		UnitNumber = unitNumber;
	}
	public String getUnitName() {
		return UnitName;
	}
	public void setUnitName(String unitName) {
		UnitName = unitName;
	}
	public String getUnitAddress() {
		return UnitAddress;
	}
	public void setUnitAddress(String unitAddress) {
		UnitAddress = unitAddress;
	}
	public String getUnitPhone() {
		return UnitPhone;
	}
	public void setUnitPhone(String unitPhone) {
		UnitPhone = unitPhone;
	}
	public User(String number, String name, String userName, String password, Integer sex, String card, String email,
			String phone, String explan, Integer userType, Integer status, String unitNumber, String unitName,
			String unitAddress, String unitPhone) {
		super();
		Number = number;
		Name = name;
		UserName = userName;
		Password = password;
		Sex = sex;
		Card = card;
		Email = email;
		Phone = phone;
		Explan = explan;
		UserType = userType;
		Status = status;
		UnitNumber = unitNumber;
		UnitName = unitName;
		UnitAddress = unitAddress;
		UnitPhone = unitPhone;
	}
	
	public User(Integer iD, String number, String name, String userName, String password, Integer sex, String card,
			String email, String phone, String explan, Integer userType, Integer status, String unitNumber,
			String unitName, String unitAddress, String unitPhone) {
		super();
		ID = iD;
		Number = number;
		Name = name;
		UserName = userName;
		Password = password;
		Sex = sex;
		Card = card;
		Email = email;
		Phone = phone;
		Explan = explan;
		UserType = userType;
		Status = status;
		UnitNumber = unitNumber;
		UnitName = unitName;
		UnitAddress = unitAddress;
		UnitPhone = unitPhone;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [ID=" + ID + ", Number=" + Number + ", Name=" + Name + ", UserName=" + UserName + ", Password="
				+ Password + ", Sex=" + Sex + ", Card=" + Card + ", Email=" + Email + ", Phone=" + Phone + ", Explan="
				+ Explan + ", UserType=" + UserType + ", Status=" + Status + ", UnitNumber=" + UnitNumber
				+ ", UnitName=" + UnitName + ", UnitAddress=" + UnitAddress + ", UnitPhone=" + UnitPhone + "]";
	}
	public User(String userName, String password) {
		super();
		UserName = userName;
		Password = password;
	}

}
