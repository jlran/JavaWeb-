package com.github.jlran;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo03 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doget");
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//请求的实体内容
		ServletInputStream in = request.getInputStream();	//得到实体内容
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = in.read(buf)) != -1){
			String string = new String(buf, 0, len);
			System.out.println(string);
		}
		System.out.println("post");
	}

}
