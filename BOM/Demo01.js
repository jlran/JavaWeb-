// JavaScript Document
/*
javascript组成部分：
	EMCAScript（基本语法）
	BOM( Browser Object MOdel) 浏览器对象模型.
	浏览器对象模型中把浏览器 的各个部分都是用了一个对象进行描述，如果我们要
	操作浏览器的一些属性，我就可以通过浏览器对象模型 的对象进行操作。
	
	window  代表了一个新开的窗口
	location 代表了地址栏对象。
	screen  代表了整个屏幕的对象

window对象常用的方法：
	
	open()   打开一个新的窗口。
	resizeTo() 将窗口的大小更改为指定的宽度和高度值。
	moveBy()  相对于原来的窗口移动指定的x、y值。 
	moveTo() 将窗口左上角的屏幕位置移动到指定的 x 和 y 位置。 
	
	setInterval() 每经过指定毫秒值后就会执行指定的代码。
	clearInterval() 根据一个任务的ID取消的定时任务。
	setTimeout() 经过指定毫秒值后执行指定 的代码一次。
	
注意： 使用window对象的任何属性与方法都可以省略window对象不写的。

<input type="button" onclick="showAd()" value="下载" /> <br />
    <input type="button" onclick="Small()" value="变小"/> <br />
    <input type="button" onclick="moveby()" value="移动"  /> <br />
	<input type="button" onclick="moveto()" value="移动2"  /> <br />
    <input type="button" onclick="clearTest()" value="取消"  />
	
	使用IE对此进行测试
   
*/

function showAd(){
	open("", "_blank", "height=400px, width=300px, toolbar=no, location=no, top=20px");
}

function Small(){
	resizeTo(300,200);
}

function moveby(){
	moveBy(50,0);
}

function moveto(){
	moveTo(0,50);
}

var id = window.setInterval("showAd()", 10000);

function clearTest(){
	window.clearInterval(id);
}
