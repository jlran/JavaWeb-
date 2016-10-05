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
 * content-Type作用
 * @author jlran
 *
 */
public class Demo09 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置响应实体内容编码
//		response.setCharacterEncoding("UTF-8");
		// 服务器发送给浏览器的数据类型和内容编码
//		response.setContentType("text/html;charset=utf-8");	//和上面一样 推荐
//		response.getOutputStream().write("<html><head><title>this is tilte</title></head><body>中国</body></html>".getBytes("utf-8"));
		//设置以下载方式打开文件
		//下载图片
		File file = new File("D:/javaWeb/src/img/1.png");
		//response.setHeader("Content-Disposition", "attachment; filename=" + file.getName());
		//发送图片
		FileImageInputStream in = new FileImageInputStream(file);
		byte[] buf = new byte[1024];
		int len = 0;
		//把图片内容写出到浏览器
		while((len = in.read(buf)) != -1){
			response.getOutputStream().write(buf, 0, len);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
