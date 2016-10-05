// JavaScript Document
/*
setInterval(代码, 毫秒数) 每经过指定毫秒值后执行指定的代码。
setTimeout(代码, 毫秒数)  经过指定毫秒值后执行指定的代码（只执行一次）。
*/

function showTime(){
	//获取系统时间
	var date = new Date();
	//获取年月日  时分秒
	var str = date.getFullYear() + "年" + (date.getMonth()+ 1) + "月" + date.getDate() + "日"+  
	" 星期" + date.getDay()  + "  "+date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();
	
	var span = document.getElementById("showDate");
	//document.write(span);
	span.innerHTML=str.fontcolor("red");
	window.setTimeout("showTime()", 1000);
}


