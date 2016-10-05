package com.github.jlran;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 定时刷新
 * @author jlran
 *
 */
public class Demo08 extends HttpServlet {
	//原理：浏览器认识refresh头，得到refresh头之后重新请求当前资源
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//resp.setHeader("refresh", "1");	//每隔一秒刷新页面
		//隔几秒后挑转到另外的资源
		resp.setHeader("refresh", "3;url=/WebPro/index.html");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
}
