// JavaScript Document
/*
正则表达式的创建方式：
	""				
	方式1：
		/正则表达式/模式
	方式2：
		new RegExp("正则表达式",模式);
	
正则表达式对象常用的方法：
	 test()  使用正则对象去匹配字符串  如果匹配成功返回ture，否则返回false.	
	 exec()  根据正则表达式去查找字符串符合规则的内容。

模式：
	g （全文查找出现的所有 pattern） 	
	i （忽略大小写）

	var str = "hello123";
	var reg = /^[A-Z0-9]+$/i;
	alert("匹配吗？"+reg.test(str));	

词。
*/
//查找出三个字符组成的单词
var str = "Hello World heh";
var reg = /\b[a-z]{3}\b/gi;
var line = "";
while((line = reg.exec(str))!=null){
	document.write(line+"<br/>");
}