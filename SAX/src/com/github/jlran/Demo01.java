package com.github.jlran;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * SAX��ȡxml�ļ�����
 * @author jlran
 *
 */
public class Demo01 {
	public static void main(String[] args) throws Exception, SAXException {
		//����SAXParser����
		SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
		//����parse����
		parser.parse(new File("./src/com/github/jlran/book.xml"), new MyDefaultHandler());
		
	}
}
