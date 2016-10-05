package com.github.jlran;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * д���ݵ�xml
 * @author jlran
 *
 */
//��ȡ�򴴽�һ��document����
public class Demo05 {
	public static void main(String[] args) throws Exception   {
		//��ȡ  dom4jһ�ζ�ȡȫ��
		Document doc = new SAXReader().read(new File("./src/com/github/jlran/book.xml"));
		
		
		//д��
		//ָ���ļ����λ��
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/write.xml");
		//����д������
		XMLWriter writer = new XMLWriter(out);
		//д������
		writer.write(doc);
		//�ر���
		writer.close();
	}
}
