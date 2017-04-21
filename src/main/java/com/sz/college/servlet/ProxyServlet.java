package com.sz.college.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * 商保平台总代理分发类
 * 
 * 
 */
@Controller("proxyServlet")
@Scope("prototype")
public class ProxyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Servlet proxy;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		String action = request.getParameter("action");
		if (action != null && !action.equals("")) {
			WebApplicationContext wac = WebApplicationContextUtils
					.getRequiredWebApplicationContext(getServletContext());
			this.proxy = (Servlet) wac.getBean(action);
			proxy.service(request, response);
		}

	}

}
