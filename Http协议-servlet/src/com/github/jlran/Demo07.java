package com.github.jlran;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * �����ض����൱�ڳ�������תҳ�棩
 * @author jlran
 *
 */
public class Demo07 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//ʹ�������ض��� ����һ��302״̬��+location����Ӧͷ
//		response.setStatus(302);	////����һ��302״̬��
//		response.setHeader("location", "index.html");
		//��д��
		response.sendRedirect("index.html");
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
