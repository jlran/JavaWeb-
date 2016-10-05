package com.github.jlran;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 把xml数据封装
 * @author jlran
 *
 */
public class Demo04 {
	public static void main(String[] args) throws Exception {
		List<Book> list = new ArrayList();
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/com/github/jlran/book.xml"));
		Iterator<Element> it = doc.getRootElement().elementIterator();
		while(it.hasNext()){
			Element ele = it.next();
			Book book = new Book();
			book.setId(Integer.parseInt(ele.attributeValue("id")));
			book.setAuther(ele.elementText("auther"));
			book.setDate(ele.elementText("date"));
			book.setName(ele.elementText("name"));
			list.add(book);
		}
		
		for (Book b : list) {
			System.out.println(b.getId() + "\t" + b.getName() + "\t" + b.getAuther() + "\t" + b.getDate() );
		}
		
	}
}
