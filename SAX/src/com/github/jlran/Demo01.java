package com.github.jlran;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * SAX读取xml文件程序
 * @author jlran
 *
 */
public class Demo01 {
	public static void main(String[] args) throws Exception, SAXException {
		//创建SAXParser对象
		SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
		//调用parse方法
		parser.parse(new File("./src/com/github/jlran/book.xml"), new MyDefaultHandler());
		
	}
}
