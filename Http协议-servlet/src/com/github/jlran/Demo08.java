package com.github.jlran;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ��ʱˢ��
 * @author jlran
 *
 */
public class Demo08 extends HttpServlet {
	//ԭ���������ʶrefreshͷ���õ�refreshͷ֮����������ǰ��Դ
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//resp.setHeader("refresh", "1");	//ÿ��һ��ˢ��ҳ��
		//���������ת���������Դ
		resp.setHeader("refresh", "3;url=/WebPro/index.html");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}
}
