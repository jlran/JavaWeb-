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
		//获取根节点
		Element root = document.getRootElement();
		System.out.println(root.getName());
	}
	
	//得到节点信息
	@Test
	public void test1() throws Exception{
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("./src/com/github/jlran/book.xml"));
		//得到当前节点下的所有子节点对象
		//只有标签节点才有子节点
		//判断当前节点是否是标签节点
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
	//遍历xml的所有节点
	@Test
	public void test2() throws Exception{
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("./src/com/github/jlran/book.xml"));
		//得到根标签
		Element root = document.getRootElement();
		getChildNodes(root);
		
	}
	// 获取 传入的标签下的所有子节点
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
	//获取标签
	@Test
	public void test03() throws Exception{
		System.out.println("*********************");
		SAXReader reader = new SAXReader();
		Document document = reader.read(new File("./src/com/github/jlran/book.xml"));
		//获取根标签
		Element rootElem = document.getRootElement();
		String name = rootElem.getName();
		System.out.println(name);
//		//得到当前标签下制定名称的第一个子标签
//		Element elem = rootElem.element("book");
//		System.out.println(elem.getName());
//		//得到当前标签下的指定名称的所有子标签
//		Iterator<Element> it = rootElem.elementIterator();
//		while(it.hasNext()){
//			Element ele = it.next();
//			System.out.println(ele.getName());
//		}
//		//得到当前标签下的所有子标签
//		List<Element> list= rootElem.elements();
//		Iterator<Element> it =list.iterator();
//		while(it.hasNext()){
//			Element ele = it.next();
//			System.out.println(ele.getName());
//		}
		//获取更深层次的标签（一层一层的获取）
		Element ele = document.getRootElement().element("book").element("name");
		System.out.println(ele.getName());
	}
	
	//获取属性
	@Test
	public void test04() throws Exception{
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/com/github/jlran/book.xml"));
		Element rootElement = doc.getRootElement();
		Element ele = rootElement.element("book");
		//ctrl + 2 松开 l
		//得到指定名称属性值
		String idValue = ele.attributeValue("id");
		System.out.println(idValue);
		//得到指定名称的属性对象
		Attribute idAttribute = ele.attribute("id");
		System.out.println("属性名称 " + idAttribute.getName() + " 属性值 " + idAttribute.getValue());
		//得到所有属性对象 返回list集合
		List<Attribute> list = ele.attributes();
		Iterator<Attribute> iterator = list.iterator();
		while(iterator.hasNext()){
			Attribute attr = iterator.next();
			System.out.println(attr.getName() + attr.getValue());
		}
	}
	
	//获取文本
	@Test
	public void test05() throws Exception{
		System.out.println("========================");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/com/github/jlran/book.xml"));
		//空格和换行也是XML的内容
		String rootContent = doc.getRootElement().getText();
		System.out.println(rootContent);
		
		//获取文本
		Element element = doc.getRootElement().element("book").element("name");
		String text = element.getText();
		System.out.println(text);
		//得到指定子标签的文本内容
		String string = doc.getRootElement().element("book").elementText("date");
		System.out.println(string);
	}
}
