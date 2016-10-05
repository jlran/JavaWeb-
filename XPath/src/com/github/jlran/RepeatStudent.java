package com.github.jlran;

import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * ��дstudents�ĵ�
 * @author jlran
 *
 */
public class RepeatStudent {
	public static void main(String[] args) throws Exception {
		Document doc = DocumentHelper.createDocument();
		Element rootElem = doc.addElement("Students");
		Element StudentElem1 = rootElem.addElement("Student");
		StudentElem1.addAttribute("id", "001");
		StudentElem1.addAttribute("name", "jack");
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
	}
}
