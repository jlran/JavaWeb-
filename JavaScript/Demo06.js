// JavaScript Document
/*
toFixed()是指定小数位数。

构造函数中可以传递任意值,实参在内部会进行自动类型转换,转为true或者false
*/

var a = 12;
var b = new Number(12);

document.write(a + " " + b + "<br />");
with(document){
	write((a == b) + "<br />");
	write((a === b) + "<br />");
	write((new Number(12) == new Number(12)) + "<br />" );
	write((new Number(12).valueOf() == new Number(12).valueOf()) + "<br />");
	write((new Number(12).valueOf() === new Number(12).valueOf()) + "<br />");
	write(Number.MAX_VALUE + "<br />");
	write(Number.MIN_VALUE + "<br />");
	write((new Number(12).toString(10)) + "<br />");
	write((new Number(12).toString(16)) + "<br />");
	write((new Number(12).toString(8)) + "<br />");
	write((new Number(12).toString(2)) + "<br />");
	write((new Number(12.3467)) + "<br />");
	write((new Number(12.3467).toFixed()) + "<br />");
	write((new Number(12.3467).toFixed(2)) + "<br />");
	write((new Number(12.3467).toFixed(5)) + "<br />");
	
	var a = new Boolean(false);
	write(a.constructor + "<br />");
	write(a.toString() + "<br />");
	write(a.valueOf() + "<br />");
	if(a.valueOf()){
		write("条件成立" + "<br />");
	}else{
		write("条件不成立" + "<br />");
	}
	
	write(Math.ceil(12.34) + "<br />");
	write(Math.abs(-1234) + "<br />");
	write(Math.floor(12.34) + "<br />");
	write(Math.round(12.34) + "<br />");
	write(Math.round(12.54) + "<br />");
	write(Math.random() + "<br />");
	write(Math.max(12,34,21,15) + "<br />");
	write(Math.min(12,34,56,10) + "<br />");
}