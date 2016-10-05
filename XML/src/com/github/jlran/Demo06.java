package com.github.jlran;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * д�����ݵ�xml�ĵ���ϸ��
 * @author jlran
 *
 */
public class Demo06 {
	public static void main(String[] args) throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/com/github/jlran/book.xml"));
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/write.xml");
		
		//ָ��д���ĸ�ʽ
		OutputFormat format1 = OutputFormat.createCompactFormat();	//���յĸ�ʽ
		OutputFormat format2 = OutputFormat.createPrettyPrint();	//�ÿ��ĸ�ʽ
		//ָ�������ĵ��ı���
		//ͬʱӰ����xml�ĵ�����ʱ�ı���  ��  xml�ĵ�������encoding�ı��루xml����ʱ�ı��룩
		//���ۣ� ʹ�ø÷������ɵ�xml�ĵ����������������⡣
		format1.setEncoding("utf-8");
		
		XMLWriter xmlWriter = new XMLWriter(out, format1);
		xmlWriter.write(doc);
		xmlWriter.close();
		
	}
}
