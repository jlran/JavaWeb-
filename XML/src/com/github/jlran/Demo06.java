package com.github.jlran;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * 写出内容到xml文档的细节
 * @author jlran
 *
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/com/github/jlran/book.xml"));
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/write.xml");
		
		//指定写出的格式
		OutputFormat format1 = OutputFormat.createCompactFormat();	//紧凑的格式
		OutputFormat format2 = OutputFormat.createPrettyPrint();	//好看的格式
		//指定生成文档的编码
		//同时影响了xml文档保存时的编码  和  xml文档声明的encoding的编码（xml解析时的编码）
		//结论： 使用该方法生成的xml文档避免中文乱码问题。
		format1.setEncoding("utf-8");
		
		XMLWriter xmlWriter = new XMLWriter(out, format1);
		xmlWriter.write(doc);
		xmlWriter.close();
		
	}
}
