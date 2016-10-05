// JavaScript Document
/*
事件： 
注册事件的方式：	
	方式一： 直接在html元素上注册
		<body onload="ready()">			
		function ready(){
			alert("body的元素被加载完毕了..");	
		}	
	方式二：可以js代码向找到对应的对象再注册。 推荐使用。	
	var bodyNode = document.getElementById("body");	
	bodyNode.onload = function(){
		alert("body的元素被加载完毕");	
	} 

常用的事件：

	鼠标点击相关：
		onclick 在用户用鼠标左键单击对象时触发。 
		ondblclick 当用户双击对象时触发。 
		onmousedown 当用户用任何鼠标按钮单击对象时触发。 
		onmouseup 当用户在鼠标位于对象之上时释放鼠标按钮时触发。 

	鼠标移动相关：
		onmouseout  当用户将鼠标指针移出对象边界时触发。 
		onmousemove 当用户将鼠标划过对象时触发。 

	焦点相关的：
		onblur 在对象失去输入焦点时触发。 
		onfocus 当对象获得焦点时触发。

	其他：
		onchange 当对象或选中区的内容改变时触发。 
		onload 在浏览器完成对象的装载后立即触发。 
		onsubmit 当表单将要被提交时触发
		
	
	地址栏对象(Location)
		href : 设置以及获取地址栏的对象
		reload() 刷新当前的页面
		
	Screen(屏幕)对象
		availHeight	获取系统屏幕的工作区域高度，排除 Microsoft Windows 任务栏。 	
		availWidth	获取系统屏幕的工作区域宽度，排除 Windows 任务栏。 	
		height		获取屏幕的垂直分辨率。 
		width		获取屏幕的水平分辨率。 
		
<input type="button" onclick="check()" value="单击" /> <br />
<input type="button" ondblclick="dbcheck()" value="双击" /><br />
<input type="button" onmousemove="show()" onmouseout="hide()" value="时间" /><br /><span id="time" ></span>

<select onchange="change()">
	<option>北京</option>
   	<option>上海</option>
    <option>广州</option>
</select> 

<input type="button" onclick="locationUrl()" value="地址栏"  />
<span onclick="showDown()" >下载电影</span>
<span onclick="showScreen()">Screen(屏幕)对象</span>
*/	

function ready(){
	alert("body元素已经加载完成了...");
}

function check(){
	alert("单击了...");
}


function dbcheck(){
	alert("双击了...");
}

function show(){
	var time = document.getElementById("time");
	var d = new Date(); 
	var str = d.getFullYear() + "/" + d.getMonth() + "/" + d.getDay() + " " + d.getHours() + ":" + d.getMinutes();
	time.innerHTML = str.fontcolor("red");
}

function hide(){
	var time = document.getElementById("time");
	time.innerHTML = "";
}

function change(){
	alert("你选择的改变了哦！");
}

function locationUrl(){
	alert(location.url);
}

function showDown(){
	location.href = "http://www.baidu.com";
}

function showScreen(){
	var scr = document.getElementById("scr");
	var str = "获取系统屏幕的工作区域高度-" + screen.availHeight + "获取系统屏幕的工作区域宽度-" + screen.availWidth + "获取屏幕的垂直分辨率-" + screen.height + "获取屏幕的水平分辨率-" + screen.width;
	scr.innerHTML = str;
}