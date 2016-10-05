package com.github.jlran;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

/**
 * 
 * @author jlran
 *
 */
/*
 1.使用dom4j的api来生成以下的xml文件
<Students>
<Student id="1">
	<name>张三</name>
	<gender>男</gender>
	<address>广州天河</address>
</Student>
<Student id="2">
	<name>李四</name>
	<gender>女</gender>
	<address>广州天河</address>
</Student>
</Students>

2.修改id为2的学生的姓名，改为“jose”
3.删除id为2的学生
 */
public class Demo08 {
	public static void main(String[] args) throws Exception {
		//增加
		Document doc = DocumentHelper.createDocument();
		Element rootElem = doc.addElement("Students");
		Element StudentElem1 = rootElem.addElement("Student");
		StudentElem1.addAttribute("id", "001");
		StudentElem1.addElement("name").setText("张三");
		StudentElem1.addElement("gender").setText("男");
		StudentElem1.addElement("address").setText("广州天河");
		
		Element StudentElem2 = rootElem.addElement("Student");
		StudentElem2.addAttribute("id", "002");
		StudentElem2.addElement("name").setText("李四");
		StudentElem2.addElement("gender").setText("女");
		StudentElem2.addElement("address").setText("广州天河");
		
		
		
		
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/students.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(out, format);
		writer.write(doc);
		writer.close();
		
		//Modify();
		//remove();
		
	}
	
	//修改id为2的学生的姓名，改为“jose”
	public static void Modify() throws Exception{
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/com/github/jlran/students.xml"));
		Iterator<Element> it = doc.getRootElement().elementIterator("Student");
		while(it.hasNext()){
			Element next = it.next();
			//查询ID为002学生
			if(next.attributeValue("id").equals("002")){
				next.element("name").setText("王丽");
				break;
			}
		}
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/students.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(out, format);
		writer.write(doc);
		writer.close();
	}
	
	//删除id为2的学生
	public static void remove() throws Exception{
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/com/github/jlran/students.xml"));
		Iterator<Element> it = doc.getRootElement().elementIterator("Student");
		while(it.hasNext()){
			Element next = it.next();
			if(next.attributeValue("id").equals("002")){
				next.detach();
				break;
			}
		}
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/students.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(out, format);
		writer.write(doc);
		writer.close();
	}
}
