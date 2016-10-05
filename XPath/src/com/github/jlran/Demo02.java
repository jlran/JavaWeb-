package com.github.jlran;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * ѧϰxpath�﷨
 * @author jlran
 *
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		Document doc = new SAXReader().read(new File("./src/com/github/jlran/students.xml"));
		String xpath = "";
		//����·��    /   ��ʾ��xml�ĸ�λ�ÿ�ʼ����Ԫ�أ�һ����νṹ��
		xpath="/Students/Student";
		
		//���·��  // ��ʾ�����κβ�νṹ��ѡ��Ԫ��
		xpath="//Student/name";
		
		// ͨ��� *  ��ʾƥ������Ԫ��
		xpath="/Students/*";
		xpath="/Students//*";
		
		//����  []  ��ʾѡ��ʲô�����µ�Ԫ��
		//����id���Ե�Student��ǩ
		xpath="/Students/Student[@id]";
		//�ڶ�����Student��ǩ
		xpath="//Student[2]";		
		//ѡ�����һ��Student��ǩ
		xpath="//Student[last()]";
		
		//����  @ ��ʾѡ�����Խڵ�
		xpath="//@id"; //ѡ��id���Խڵ���󣬷��ص���Attribute����
		xpath="//Student[not(@id)]";//ѡ�񲻰���id���Ե�Student��ǩ�ڵ�
		xpath="//Student[@id='002']"; //ѡ��id����ֵΪ002��Student��ǩ
		xpath="//Student[@id='001' and @name='jack']";//ѡ��id����ֵΪ001����name����Ϊjack��Student��ǩ
		
		//�ı� text() ��ʾѡ���ı�����
		xpath="//name/text()";	//ѡ��name��ǩ�µ��ı����ݣ�����Text����
		xpath="//Student/name[text()='����']";
		
		List<Node> list = doc.selectNodes(xpath);
		for (Node node : list) {
			System.out.println(node);
		}
	}
}
