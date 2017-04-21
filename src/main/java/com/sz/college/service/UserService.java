package com.sz.college.service;

import java.util.List;

import com.sz.college.model.User;

/**
 * 用户服务层
 * @author zhouxiaohu
 *
 */
public interface UserService {
	/**
	 * 用户注册
	 * @param user
	 */
	public int userRegister(User user);
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public User userLogin(User user);
	/**
	 * 用户查找
	 * @return
	 */
	public List<User> userSelect();
	/**
	 * 用户添加
	 * @param user
	 */
	public int addUser(User user);
	/**
	 * 用户删除
	 * @param user
	 */
	public void deleteUser(User user);
	/**
	 * 用户修改
	 * @param user
	 */
	public void updateUser(User user);
	/**
	 * 根据ID查找用户
	 * @param id
	 * @return
	 */
	public User selectById(int id);
}
