package com.github.jlran;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

/**
 * Dom4j读取xml
 * @author jlran
 *
 */
/*
 * XML文档的解析方式：
	DOM(JAXP)
	DOM解析器使用树形模型，把XML文档转化为一个包含其内容的树，并可以对树进行遍历。
	SAX
	SAX解析器采用了基于事件的模型，解析XML文档的时候可以触发一系列的事件。
	JDOM
	JDOM的目的是成为Java特定文档模型，它简化与XML的交互并且比使用DOM实现更快。 
	DOM4J
	DOM4J是一个非常非常优秀的Java XML API，具有性能优异、功能强大和极端易用使用的特点。 

 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		//创建一个xml解析器对象
		SAXReader reader = new SAXReader();
		//读取xml文档，返回document
		Document doc = reader.read(new File("./src/com/github/jlran/book.xml"));
		System.out.println(doc);
	}
}
