package com.github.jlran;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.stream.FileImageInputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * content-Type����
 * @author jlran
 *
 */
public class Demo09 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//������Ӧʵ�����ݱ���
//		response.setCharacterEncoding("UTF-8");
		// ���������͸���������������ͺ����ݱ���
//		response.setContentType("text/html;charset=utf-8");	//������һ�� �Ƽ�
//		response.getOutputStream().write("<html><head><title>this is tilte</title></head><body>�й�</body></html>".getBytes("utf-8"));
		//���������ط�ʽ���ļ�
		//����ͼƬ
		File file = new File("D:/javaWeb/src/img/1.png");
		//response.setHeader("Content-Disposition", "attachment; filename=" + file.getName());
		//����ͼƬ
		FileImageInputStream in = new FileImageInputStream(file);
		byte[] buf = new byte[1024];
		int len = 0;
		//��ͼƬ����д���������
		while((len = in.read(buf)) != -1){
			response.getOutputStream().write(buf, 0, len);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
