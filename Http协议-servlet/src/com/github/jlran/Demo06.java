package com.github.jlran;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ������Ӧ��Ϣ
 * @author jlran
 *
 */
/*
* 1)tomcat��������������Ϣ��װ��HttpServletRequest�����Ұ���Ӧ��Ϣ��װ��HttpServletResponse
* 2��tomcat����������doGet����������request����response����
 */
public class Demo06 extends HttpServlet {
	//tomcat��������response���������ת������Ӧ��ʽ���ݣ��ٷ��͸������������
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//ͨ��response����ı���Ӧ��Ϣ
		//��Ӧ��
//		response.setStatus(404);//�޸�״̬��
//		response.sendError(404);// ����404��״̬��+404�Ĵ���ҳ��
		//��Ӧͷ
//		response.setHeader("server", "JoRan");
		//ʵ������(�����ֱ���ܹ����������ݾ���ʵ������)
		response.getOutputStream().write("��ð�".getBytes()); //�ֽ�����
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
