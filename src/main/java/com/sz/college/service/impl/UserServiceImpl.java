package com.sz.college.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sz.college.dao.UserDao;
import com.sz.college.model.User;
import com.sz.college.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	UserDao userDao;
	@Override
	public int userRegister(User user) {
		return userDao.userRegister(user);
	}
	@Override
	public User userLogin(User user) {
		return userDao.userLogin(user);
	}
	@Override
	public List<User> userSelect() {
		return userDao.userSelect();
	}
	@Override
	public int addUser(User user) {
		return userDao.addUser(user);
	}
	@Override
	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}
	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}
	@Override
	public User selectById(int id) {
		return userDao.selectById(id);
	}

}
