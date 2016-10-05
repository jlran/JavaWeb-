package com.github.jlran;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��ȡ�����������
 * @author jlran
 *
 */
public class Demo04 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//��ȡ����ͷ��user-agent
		String header = request.getHeader("user-agent");
		System.out.println(header);
		//�ж��û�ʹ�õ����������
		if(header.contains("Firefox")){
			response.getWriter().write("����ʹ�û�������");
		}else if(header.contains("Chrome")){
			response.getWriter().write("����ʹ�ùȸ������");
		}else if(header.contains("Trident")){
			response.getWriter().write("����ʹ��IE�����");
		}else{
			response.getWriter().write("��ʹ�õ������������ʹ��Ŷ");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
