package com.github.jlran;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * ʹ��xpath����
 * @author jlran
 *
 */
public class Demo01 {
	public static void main(String[] args) throws Exception {
		Document doc = new SAXReader().read(new File("./src/com/github/jlran/students.xml"));
		
		//��ѯidΪ002��ѧ����ǩ
		Element ele = (Element) doc.selectSingleNode("//Student[@id='002']");
		ele.detach();	//ɾ����ǩ
		
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/students.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(out, format);
		writer.write(doc);
		writer.close();
	}
}
