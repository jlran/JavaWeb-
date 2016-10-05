package com.github.jlran;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获取浏览器的类型
 * @author jlran
 *
 */
public class Demo04 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//获取请求头：user-agent
		String header = request.getHeader("user-agent");
		System.out.println(header);
		//判断用户使用的浏览器类型
		if(header.contains("Firefox")){
			response.getWriter().write("你在使用火狐浏览器");
		}else if(header.contains("Chrome")){
			response.getWriter().write("你在使用谷歌浏览器");
		}else if(header.contains("Trident")){
			response.getWriter().write("你在使用IE浏览器");
		}else{
			response.getWriter().write("你使用的浏览器很少人使用哦");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
