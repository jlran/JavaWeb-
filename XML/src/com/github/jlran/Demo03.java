package com.github.jlran;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.Text;
import org.dom4j.io.SAXReader;

/**
 * 完整读取xml内容 使用dom4j
 * @author jlran
 *
 */

public class Demo03 {
	public static void main(String[] args) {
		SAXReader reader = new SAXReader();
		Document doc;
		try {
			doc = reader.read(new File("./src/com/github/jlran/book.xml"));
		} catch (DocumentException e) {
			throw new RuntimeException(e);
		}
		Element rootElement = doc.getRootElement();
		StringBuffer sb = new StringBuffer();
		getChildNode(rootElement, sb);
		System.out.println("\n*******************");
		System.out.println(sb.toString());
	}
	
	public static void getChildNode(Element ele, StringBuffer sb){
		System.out.print("<" + ele.getName());
		sb.append("<" + ele.getName());
		//获取属性
		List<Attribute> attrs = ele.attributes();
		if(attrs != null){
			for (Attribute attribute : attrs) {
				System.out.print(" " + attribute.getName()+"=\"" + attribute.getValue() + "\"");
				sb.append(" " + attribute.getName()+"=\"" + attribute.getValue() + "\"");
			}
		}
		System.out.print(">");
		sb.append(">");
		
		
		Iterator<Node> it= ele.nodeIterator();
		while(it.hasNext()){
			Node node = it.next();
			if(node instanceof Element){
				Element el2node = (Element) node;
				getChildNode(el2node, sb);
			}
			
			if(node instanceof Text){
				Text no = (Text)node;
				System.out.print(no.getText());
				sb.append(no.getText());
			}
		}
		System.out.print("</" + ele.getName() + ">");
		sb.append("</" + ele.getName() + ">");
	}
}


