package com.github.jlran;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * Ä£ÄâÓÃ»§µÇÂ¼xpath
 * @author jlran
 *
 */
public class Demo03 {
	public static void main(String[] args) throws Exception {
		writeUser();
		Document doc = new SAXReader().read(new File("./src/com/github/jlran/users.xml"));
		String xpath="//user[@name='jo' and @passward='153']";
		if(doc.selectSingleNode(xpath)!= null){
			System.out.println("µÇÂ¼³É¹¦!");
		}else{
			System.out.println("µÇÂ¼Ê§°Ü£¡");
		}
	}

	private static void writeUser() throws FileNotFoundException,
			UnsupportedEncodingException, IOException {
		Document doc = DocumentHelper.createDocument();
		Element rootUser = doc.addElement("Users");
		Element user1 = rootUser.addElement("user");
		user1.addAttribute("id", "001");
		user1.addAttribute("name", "jack");
		user1.addAttribute("passward", "123");
		
		Element user2 = rootUser.addElement("user");
		user2.addAttribute("id", "002");
		user2.addAttribute("name", "jo");
		user2.addAttribute("passward", "123");
		
		FileOutputStream out = new FileOutputStream("./src/com/github/jlran/users.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("UTF-8");
		XMLWriter xmlWriter = new XMLWriter(out,format);
		xmlWriter.write(doc);
		xmlWriter.close();
	}
}
