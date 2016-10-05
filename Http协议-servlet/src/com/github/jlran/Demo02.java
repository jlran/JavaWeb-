package com.github.jlran;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 请求数据的获取
 * @author jlran
 *
 */
public class Demo02 extends HttpServlet {
	/*
	 * 1)tomcat服务器接收到浏览器发送的请求数据，然后封装到HttpServetRequest对象
	 * 2）tomcat服务器调用doGet方法，然后把request对象传入到servlet中。
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("GBK");
		response.getWriter().write(" 成功访问Demo02网站");
		
		//请求行   格式：（GET /day09/hello HTTP/1.1）
		System.out.println("请求方式-》" + request.getMethod()); //请求方式
		System.out.println("URI-》" + request.getRequestURI()); //请求资源
		System.out.println("URL-》" + request.getRequestURL());
		System.out.println("HTTP协议版本-》" + request.getProtocol());	//http协议
		//请求头
		//从request对象取出请求数据
		String host = request.getHeader("Host");	//根据头的名称得到头的内容
		System.out.println(host);
		//遍历所有请求头
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String handerName = headerNames.nextElement();
			String headValue = request.getHeader(handerName);
			System.out.println(handerName + " " + headValue);
		}
	}
}
