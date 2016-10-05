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
 * �������ݵĻ�ȡ
 * @author jlran
 *
 */
public class Demo02 extends HttpServlet {
	/*
	 * 1)tomcat���������յ���������͵��������ݣ�Ȼ���װ��HttpServetRequest����
	 * 2��tomcat����������doGet������Ȼ���request�����뵽servlet�С�
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("GBK");
		response.getWriter().write(" �ɹ�����Demo02��վ");
		
		//������   ��ʽ����GET /day09/hello HTTP/1.1��
		System.out.println("����ʽ-��" + request.getMethod()); //����ʽ
		System.out.println("URI-��" + request.getRequestURI()); //������Դ
		System.out.println("URL-��" + request.getRequestURL());
		System.out.println("HTTPЭ��汾-��" + request.getProtocol());	//httpЭ��
		//����ͷ
		//��request����ȡ����������
		String host = request.getHeader("Host");	//����ͷ�����Ƶõ�ͷ������
		System.out.println(host);
		//������������ͷ
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String handerName = headerNames.nextElement();
			String headValue = request.getHeader(handerName);
			System.out.println(handerName + " " + headValue);
		}
	}
}
