// JavaScript Document
/*
常见的方法：
Anchor（） 生产锚点
Blink（）   为元素添加blink标签 
charAt()    返回指定索引位置处的字符。
charCodeAt() 回一个整数，代表指定位置上字符的 Unicode 编码。
Concat()    回字符串值，该值包含了两个或更多个提供的字符串的连接。
Fontcolor()  把带有 COLOR 属性的一个 HTML <FONT> 标记放置在 String 对象中的文本两端
indexOf()    返回 String 对象内第一次出现子字符串的字符位置
italics()    把 HTML <I> 标记放置在 String 对象中的文本两端。 
Link()         把一个有 HREF 属性的 HTML 锚点放置在 String 对象中的文本两端。
Replace()      返回根据正则表达式进行文字替换后的字符串的复制
Split()        切割   
Substr()       截取子串
toUpperCase()  转大写
toLowerCase    转小写
*/

document.write("是不是对的" + "<br />"); 
document.write("是不是对的".anchor("ch1")  + "<br />");
document.write("是不是对的".blink() + "<br />");
document.write("是不是对的".charAt(0) + "<br />");
document.write("是不是对的".charCodeAt(1) + "<br />");
document.write("是不是对的".concat("123456") + "<br />"); 
document.write("是不是对的".fontcolor("#ff0000") + "<br />"); 
document.write("是不是对的".indexOf("不是") + "<br />"); 
document.write("是不是对的".italics() + "<br />"); 
document.write("是不是对的".link("http://www.baidu.com") + "<br />"); 
document.write("Hello World".replace(/l/g, "L") + "<br />"); 
var names = "jo-rose-jack".split("-");
for(var index in names){
	document.write(names[index] + "<br />"); 
}
document.write("是不是对的".substr(1,4) + "<br />"); 
document.write("hello world".toUpperCase() + "<br />");
document.write("HELLOWORLD".toLowerCase() + "<br />"); 