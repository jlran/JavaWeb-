package com.github.jlran;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

/**
 * ��ɾ�Ĳ� xml
 * @author jlran
 *
 */
/*
 * �޸ģ�xml����
 * ���ӣ��ĵ�����ǩ ������
 * �޸ģ�����ֵ���ı�
 * ɾ������ǩ������
 */
public class Demo07 {
	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/write.xml");
		//�����ĵ�
		Document doc = DocumentHelper.createDocument();
		//��ӱ�ǩ
		Element rootElem = doc.addElement("bookstore");
		Element bookElem = rootElem.addElement("book");
		Element nameElem = bookElem.addElement("name");
		//��������
		bookElem.addAttribute("id", "001");
		nameElem.addText("javk");
		
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		XMLWriter xmlWriter = new XMLWriter(out, format);
		xmlWriter.write(doc);
		xmlWriter.close();
	}
	
	//�޸�����ֵ���ı�
	@Test
	public void Modify() throws Exception{
		Document doc = new SAXReader().read(new File("./src/com/github/jlran/write.xml"));
		Element bookElement = doc.getRootElement().element("book");
		//�޸�����
		bookElement.addAttribute("id", "002");
		//|�޸��ı�
		Element element = bookElement.element("name");
		element.setText("Jo");
		
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/write.xml");
		XMLWriter xmlWriter = new XMLWriter(out);
		xmlWriter.write(doc);
		xmlWriter.close();
	}
	
	//ɾ����ǩ ����
	@Test 
	public void Remove() throws Exception{
		Document doc = new SAXReader().read(new File("./src/com/github/jlran/write.xml"));
		//ɾ����ǩ
		Element nameElem = doc.getRootElement().element("book").element("name");
		nameElem.detach();
		//ɾ������  �õ���һ����ǩ
		Element bookElem = (Element) doc.getRootElement().elements().get(0);
		Attribute attribute = bookElem.attribute("id");
		attribute.detach();
		
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/write.xml");
		XMLWriter xmlWriter = new XMLWriter(out);
		xmlWriter.write(doc);
		xmlWriter.close();
	}
}
