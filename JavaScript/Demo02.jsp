// JavaScript Document
/*
window.alert() 或写为 alert() ：显示一个提示框显示内容。
window.document.write() ：在网页的当前位置处写内容。

由于保存浮点数需要的内存空间是保存正数值的两倍，因此ECMAScrip会将浮点数值转换为整数值。
如果小数点后没有跟任何数字和浮点数本身就是一个整数就会被转换为整数。

ECMAScript 提供了两种把非数字的原始值转换成数字的方法，即 parseInt() 和 parseFloat()。只有对 String 类型调用这些方法，它们才能正确运行；对其他类型返回的都是 NaN。
	在判断字符串是否是数字值前，parseInt() 和 parseFloat() 都会仔细分析该字符串。
parseInt() 方法首先查看位置 0 处的字符，判断它是否是个有效数字；如果不是，该方法将返回 NaN，不再继续执行其他操作。但如果该字符是有效数字，该方法将查看位置 1 处的字符，进行同样的测试。这一过程将持续到发现非有效数字的字符为止，此时 parseInt() 将把该字符之前的字符串转换成数字。
	例如，如果要把字符串 "12345red" 转换成整数，那么 parseInt() 将返回 12345，因为当它检查到字符 r 时，就会停止检测过程。
    
字符串中包含的数字字面量会被正确转换为数字，比如 "0xA" 会被正确转换为数字 10。不过，字符串 "22.5" 将被转换成 22，因为对于整数来说，小数点是无效字符。

{
    parseInt
	parseFloat  
    isNaN  判断是否是一个有效的数值.
 
}

for in语句
for in语句是严格的迭代语句，用于枚举对象的属性或者遍历一个数组的元素。
它的语法如下：
for (property in expression) statement
例子：用于显示 window 对象的所有属性。
for (sProp in window) {
  alert(sProp);
}

With语句
wth语句的作用： 有了 With 语句，在存取对象属性和方法时就不用重复指定参考对象。
格式 ：
	with(obj){
		操作obj的属性语句;
	}


*/

var color = "red";
var num = 100;
var visible = true;
var a = 3.1415;
var b = 1.;
var c = "301415abv";

document.write(a + "<br />");
document.write(b + "<br />");
document.write(parseInt(c) + "<br />");

/*
if(num > 120){
	alert("大于120"); 
}else{
	alert("小于120");    
}
*/

document.write(num + "-->" + typeof num + "<br />");
document.write(color + "-->" + typeof color + "<br />");
document.write(visible + "-->" + typeof visible + "<br />");
document.write("ECMASCRIPT 中有4种基本数据类型:Undefined, Boolean,Number和String ");


for (sProp in window) {
  document.write("<br />" + sProp + " ");
}


with(document){
        write("<br/>您好 !");
        write("<br>这个文档的标题是 : \"" + title + "\".");
        write("<br>这个文档的 URL 是: " + URL);
        write("<br>现在您不用每次都写出 document 对象的前缀了 !");
}