package com.github.jlran;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ��ȡGET��ʽ��Post��ʽ�ύ�Ĳ���
 * @author jlran
 *
 */
public class Demo05 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * ���ò�����ѯ�ı���
		 * �÷���ֻ�ܶ�����ʵ�����ݵ����ݱ��������á�POST�ύ��������ʵ�������У����Ը÷�����POST������Ч��
		 * GET�����Ĳ�������URI���棬���Զ�GET��ʽ��Ч������
		 */
		request.setCharacterEncoding("utf-8");
		//ͳһ����ػ�ȡ��������ķ���
		System.out.println(request.getMethod() + "��ʽ");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name + " " + password);
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//ͳһ����ػ�ȡ��������ķ���
		this.doGet(request, response);
	}
}
