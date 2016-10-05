package com.github.jlran;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/**
 * Dom4j��ȡxml
 * @author jlran
 *
 */
/*
 * XML�ĵ��Ľ�����ʽ��
	DOM(JAXP)
	DOM������ʹ������ģ�ͣ���XML�ĵ�ת��Ϊһ�����������ݵ����������Զ������б�����
	SAX
	SAX�����������˻����¼���ģ�ͣ�����XML�ĵ���ʱ����Դ���һϵ�е��¼���
	JDOM
	JDOM��Ŀ���ǳ�ΪJava�ض��ĵ�ģ�ͣ�������XML�Ľ������ұ�ʹ��DOMʵ�ָ��졣 
	DOM4J
	DOM4J��һ���ǳ��ǳ������Java XML API�������������졢����ǿ��ͼ�������ʹ�õ��ص㡣 

 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//����һ��xml����������
		SAXReader reader = new SAXReader();
		//��ȡxml�ĵ�������document
		Document doc = reader.read(new File("./src/com/github/jlran/book.xml"));
		System.out.println(doc);
	}
}
