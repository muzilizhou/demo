package com.sz.college.test;

import com.sz.college.dao.UserDao;

import com.sz.college.dao.impl.UserDaoImpl;
import com.sz.college.model.User;

public class UserTest {
	public static void main(String[] args) {
	UserDao ud=new UserDaoImpl();
	User user=new User("2013101206","周小虎","admin","admin",0,"4127261959595","1160252","dasdas","123",0,0,"dasd","dasd","dasds","vfds");
	ud.userRegister(user);
	}
}
