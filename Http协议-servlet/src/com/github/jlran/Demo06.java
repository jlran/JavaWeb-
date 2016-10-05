package com.github.jlran;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 设置响应信息
 * @author jlran
 *
 */
/*
* 1)tomcat服务器把请求信息封装到HttpServletRequest对象，且把响应信息封装到HttpServletResponse
* 2）tomcat服务器调用doGet方法，传入request，和response对象
 */
public class Demo06 extends HttpServlet {
	//tomcat服务器把response对象的内容转换成响应格式内容，再发送给浏览器解析。
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//通过response对象改变响应信息
		//响应行
//		response.setStatus(404);//修改状态码
//		response.sendError(404);// 发送404的状态码+404的错误页面
		//响应头
//		response.setHeader("server", "JoRan");
		//实体内容(浏览器直接能够看到的内容就是实体内容)
		response.getOutputStream().write("你好啊".getBytes()); //字节内容
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
