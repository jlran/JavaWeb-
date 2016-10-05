package com.github.jlran;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 获取GET方式和Post方式提交的参数
 * @author jlran
 *
 */
public class Demo05 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 设置参数查询的编码
		 * 该方法只能对请求实体内容的数据编码起作用。POST提交的数据在实体内容中，所以该方法对POST方法有效！
		 * GET方法的参数放在URI后面，所以对GET方式无效！！！
		 */
		request.setCharacterEncoding("utf-8");
		//统一方便地获取请求参数的方法
		System.out.println(request.getMethod() + "方式");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name + " " + password);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//统一方便地获取请求参数的方法
		this.doGet(request, response);
	}
}
