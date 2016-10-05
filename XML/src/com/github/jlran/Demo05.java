package com.github.jlran;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * 写内容到xml
 * @author jlran
 *
 */
//读取或创建一个document对象
public class Demo05 {
	public static void main(String[] args) throws Exception   {
		//读取  dom4j一次读取全部
		Document doc = new SAXReader().read(new File("./src/com/github/jlran/book.xml"));
		
		
		//写出
		//指定文件输出位置
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/write.xml");
		//创建写出对象
		XMLWriter writer = new XMLWriter(out);
		//写出对象
		writer.write(doc);
		//关闭流
		writer.close();
	}
}
