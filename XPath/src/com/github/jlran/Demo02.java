package com.github.jlran;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * 学习xpath语法
 * @author jlran
 *
 */
public class Demo02 {
	public static void main(String[] args) throws Exception {
		Document doc = new SAXReader().read(new File("./src/com/github/jlran/students.xml"));
		String xpath = "";
		//绝对路径    /   表示从xml的根位置开始或子元素（一个层次结构）
		xpath="/Students/Student";
		
		//相对路径  // 表示不分任何层次结构的选择元素
		xpath="//Student/name";
		
		// 通配符 *  表示匹配所有元素
		xpath="/Students/*";
		xpath="/Students//*";
		
		//条件  []  表示选择什么条件下的元素
		//带有id属性的Student标签
		xpath="/Students/Student[@id]";
		//第二个的Student标签
		xpath="//Student[2]";		
		//选择最后一个Student标签
		xpath="//Student[last()]";
		
		//属性  @ 表示选择属性节点
		xpath="//@id"; //选择id属性节点对象，返回的是Attribute对象
		xpath="//Student[not(@id)]";//选择不包含id属性的Student标签节点
		xpath="//Student[@id='002']"; //选择id属性值为002的Student标签
		xpath="//Student[@id='001' and @name='jack']";//选择id属性值为001，且name属性为jack的Student标签
		
		//文本 text() 表示选择文本内容
		xpath="//name/text()";	//选择name标签下的文本内容，返回Text对象
		xpath="//Student/name[text()='张三']";
		
		List<Node> list = doc.selectNodes(xpath);
		for (Node node : list) {
			System.out.println(node);
		}
	}
}
