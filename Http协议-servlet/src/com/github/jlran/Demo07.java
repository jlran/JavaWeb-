package com.github.jlran;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 请求重定向（相当于超链接跳转页面）
 * @author jlran
 *
 */
public class Demo07 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//使用请求重定向： 发送一个302状态码+location的响应头
//		response.setStatus(302);	////发送一个302状态码
//		response.setHeader("location", "index.html");
		//简化写法
		response.sendRedirect("index.html");
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
