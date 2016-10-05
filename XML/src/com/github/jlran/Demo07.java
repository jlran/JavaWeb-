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
 * 增删改查 xml
 * @author jlran
 *
 */
/*
 * 修改：xml内容
 * 增加：文档，标签 ，属性
 * 修改：属性值，文本
 * 删除：标签，属性
 */
public class Demo07 {
	public static void main(String[] args) throws Exception {
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/write.xml");
		//创建文档
		Document doc = DocumentHelper.createDocument();
		//添加标签
		Element rootElem = doc.addElement("bookstore");
		Element bookElem = rootElem.addElement("book");
		Element nameElem = bookElem.addElement("name");
		//增加属性
		bookElem.addAttribute("id", "001");
		nameElem.addText("javk");
		
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		XMLWriter xmlWriter = new XMLWriter(out, format);
		xmlWriter.write(doc);
		xmlWriter.close();
	}
	
	//修改属性值和文本
	@Test
	public void Modify() throws Exception{
		Document doc = new SAXReader().read(new File("./src/com/github/jlran/write.xml"));
		Element bookElement = doc.getRootElement().element("book");
		//修改属性
		bookElement.addAttribute("id", "002");
		//|修改文本
		Element element = bookElement.element("name");
		element.setText("Jo");
		
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/write.xml");
		XMLWriter xmlWriter = new XMLWriter(out);
		xmlWriter.write(doc);
		xmlWriter.close();
	}
	
	//删除标签 属性
	@Test 
	public void Remove() throws Exception{
		Document doc = new SAXReader().read(new File("./src/com/github/jlran/write.xml"));
		//删除标签
		Element nameElem = doc.getRootElement().element("book").element("name");
		nameElem.detach();
		//删除属性  得到第一个标签
		Element bookElem = (Element) doc.getRootElement().elements().get(0);
		Attribute attribute = bookElem.attribute("id");
		attribute.detach();
		
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/write.xml");
		XMLWriter xmlWriter = new XMLWriter(out);
		xmlWriter.write(doc);
		xmlWriter.close();
	}
}
