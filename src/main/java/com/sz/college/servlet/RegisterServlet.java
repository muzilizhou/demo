package com.sz.college.servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sz.college.model.User;
import com.sz.college.service.UserService;

/**
 * 用户Servlet
 * @author zhouxiaohu
 *
 */
@SuppressWarnings("serial")
@Controller("register")
@Scope("prototype")
public class RegisterServlet extends HttpServlet{
	@Resource
	UserService userService;
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			/**
			 * 接收基本信息
			 */
			String username=request.getParameter("username");//用户名称
			String password=request.getParameter("password");//用户密码
			String sex=request.getParameter("sex");//性别
			String number=request.getParameter("number");//编号
			/**
			 * 身份验证
			 */
			String name=request.getParameter("name");//真实姓名
			String card=request.getParameter("card");//身份证号
			String usertype=request.getParameter("usertype");//身份类型
			/**
			 * 单位信息
			 */
			String unitname=request.getParameter("unitname");//单位名称
			String unitnumber=request.getParameter("unitnumber");//单位编号
			String unitaddress=request.getParameter("unitaddress");//单位地址
			String unitphone=request.getParameter("unitphone");//单位电话
			/**
			 * 信息绑定 
			 */
			String email=request.getParameter("email");//Email邮箱
			String phone=request.getParameter("phone");//手机号
			User user=new User(number,name,username,password,new Integer(sex),card,email,phone,"",new Integer(usertype),0,unitnumber,unitname,unitaddress,unitphone);
			int a=userService.userRegister(user);
			response.getWriter().write(a);
	}
	
}
