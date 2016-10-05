// JavaScript Document
/*
JS在new Person()会做如下事：
		1，创建一个新对象。
		2，this指向新对象。
		3，执行构造方法中的代码。
		4，返回新对象。
*/

//无参构造函数
function Person(){
	window.document.write("constructor()<br/>");
}

var person = new Person();

//定义属性
person.name = "Jo ran";
person.age = 22;
//定义方法
person.work = function(){
	window.document.write("Person working...<br />");	
}

//获取构造函数
window.document.write(person.constructor + "<br />");

window.document.write(person.name + "-->" + person.age + "<br />");
person.work();

//有参数构造函数
function People(name, age){
	this.name = name;
	this.age = age;
	this.work = function(){
		document.write(this.name + "--->" + this.age + "<br />");
	}
}

var peo = new People("Jo Ran", 22);
peo.work();

//Object方式
var p = new Object();
p.name = "Jo ran";
p.age = 21;
p.say = function(){
	document.write(this.name + "----->" + this.age + "<br />");	
}
p.say();



