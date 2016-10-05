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
 1.ʹ��dom4j��api���������µ�xml�ļ�
<Students>
<Student id="1">
	<name>����</name>
	<gender>��</gender>
	<address>�������</address>
</Student>
<Student id="2">
	<name>����</name>
	<gender>Ů</gender>
	<address>�������</address>
</Student>
</Students>

2.�޸�idΪ2��ѧ������������Ϊ��jose��
3.ɾ��idΪ2��ѧ��
 */
public class Demo08 {
	public static void main(String[] args) throws Exception {
		//����
		Document doc = DocumentHelper.createDocument();
		Element rootElem = doc.addElement("Students");
		Element StudentElem1 = rootElem.addElement("Student");
		StudentElem1.addAttribute("id", "001");
		StudentElem1.addElement("name").setText("����");
		StudentElem1.addElement("gender").setText("��");
		StudentElem1.addElement("address").setText("�������");
		
		Element StudentElem2 = rootElem.addElement("Student");
		StudentElem2.addAttribute("id", "002");
		StudentElem2.addElement("name").setText("����");
		StudentElem2.addElement("gender").setText("Ů");
		StudentElem2.addElement("address").setText("�������");
		
		
		
		
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/students.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(out, format);
		writer.write(doc);
		writer.close();
		
		//Modify();
		//remove();
		
	}
	
	//�޸�idΪ2��ѧ������������Ϊ��jose��
	public static void Modify() throws Exception{
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/com/github/jlran/students.xml"));
		Iterator<Element> it = doc.getRootElement().elementIterator("Student");
		while(it.hasNext()){
			Element next = it.next();
			//��ѯIDΪ002ѧ��
			if(next.attributeValue("id").equals("002")){
				next.element("name").setText("����");
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
	
	//ɾ��idΪ2��ѧ��
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
