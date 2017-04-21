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
@Controller("login")
@Scope("prototype")
public class LoginServlet extends HttpServlet{
	@Resource
	UserService userService;
	@RequestMapping(value="/register",method=RequestMethod.POST)
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String UserName = request.getParameter( "UserName" );
        String Password = request.getParameter( "Password" );
		User user=new User(UserName,Password);
		User users=userService.userLogin(user);
		if(users!=null){
//			response.getWriter().write(JSON.toJSONString(userList));
		}
	}
		
	}
