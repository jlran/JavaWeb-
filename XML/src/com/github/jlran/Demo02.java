package com.github.jlran;

import java.io.File;
import java.util.Iterator;
import java.util.List;


import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
 * 
 * @author jlran
 *
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("./src/com/github/jlran/book.xml"));
		//��ȡ���ڵ�
		Element root = document.getRootElement();
		System.out.println(root.getName());
	}
	
	//�õ��ڵ���Ϣ
	@Test
	public void test1() throws Exception{
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("./src/com/github/jlran/book.xml"));
		//�õ���ǰ�ڵ��µ������ӽڵ����
		//ֻ�б�ǩ�ڵ�����ӽڵ�
		//�жϵ�ǰ�ڵ��Ƿ��Ǳ�ǩ�ڵ�
		Iterator<Node> it = document.nodeIterator();
		while(it.hasNext()){
			Node n = it.next();
			System.out.println(n.getName());
			
			if(n instanceof Element){
				Element element = (Element)n;
				Iterator<Node> it1 = element.nodeIterator();
				while(it1.hasNext()){
					System.out.println(it1.next().getName());
				}
			}
		}
	}
	//����xml�����нڵ�
	@Test
	public void test2() throws Exception{
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("./src/com/github/jlran/book.xml"));
		//�õ�����ǩ
		Element root = document.getRootElement();
		getChildNodes(root);
		
	}
	// ��ȡ ����ı�ǩ�µ������ӽڵ�
	public void getChildNodes(Element e){
		System.out.println(e.getName());
		Iterator<Node>it = e.nodeIterator();	
		while(it.hasNext()){
			Node n = it.next();
			if(n instanceof Element){
				Element element = (Element) n;
				getChildNodes(element);
			}
		}
	}
	//��ȡ��ǩ
	@Test
	public void test03() throws Exception{
		System.out.println("*********************");
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("./src/com/github/jlran/book.xml"));
		//��ȡ����ǩ
		Element rootElem = document.getRootElement();
		String name = rootElem.getName();
		System.out.println(name);
//		//�õ���ǰ��ǩ���ƶ����Ƶĵ�һ���ӱ�ǩ
//		Element elem = rootElem.element("book");
//		System.out.println(elem.getName());
//		//�õ���ǰ��ǩ�µ�ָ�����Ƶ������ӱ�ǩ
//		Iterator<Element> it = rootElem.elementIterator();
//		while(it.hasNext()){
//			Element ele = it.next();
//			System.out.println(ele.getName());
//		}
//		//�õ���ǰ��ǩ�µ������ӱ�ǩ
//		List<Element> list= rootElem.elements();
//		Iterator<Element> it =list.iterator();
//		while(it.hasNext()){
//			Element ele = it.next();
//			System.out.println(ele.getName());
//		}
		//��ȡ�����εı�ǩ��һ��һ��Ļ�ȡ��
		Element ele = document.getRootElement().element("book").element("name");
		System.out.println(ele.getName());
	}
	
	//��ȡ����
	@Test
	public void test04() throws Exception{
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/com/github/jlran/book.xml"));
		Element rootElement = doc.getRootElement();
		Element ele = rootElement.element("book");
		//ctrl + 2 �ɿ� l
		//�õ�ָ����������ֵ
		String idValue = ele.attributeValue("id");
		System.out.println(idValue);
		//�õ�ָ�����Ƶ����Զ���
		Attribute idAttribute = ele.attribute("id");
		System.out.println("�������� " + idAttribute.getName() + " ����ֵ " + idAttribute.getValue());
		//�õ��������Զ��� ����list����
		List<Attribute> list = ele.attributes();
		Iterator<Attribute> iterator = list.iterator();
		while(iterator.hasNext()){
			Attribute attr = iterator.next();
			System.out.println(attr.getName() + attr.getValue());
		}
	}
	
	//��ȡ�ı�
	@Test
	public void test05() throws Exception{
		System.out.println("========================");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/com/github/jlran/book.xml"));
		//�ո�ͻ���Ҳ��XML������
		String rootContent = doc.getRootElement().getText();
		System.out.println(rootContent);
		
		//��ȡ�ı�
		Element element = doc.getRootElement().element("book").element("name");
		String text = element.getText();
		System.out.println(text);
		//�õ�ָ���ӱ�ǩ���ı�����
		String string = doc.getRootElement().element("book").elementText("date");
		System.out.println(string);
	}
}
