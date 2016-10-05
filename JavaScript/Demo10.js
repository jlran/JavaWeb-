// JavaScript Document
/*
 “prototype”字面翻译是“原型”，是javascript实现继承的主要手段。粗略来说就是：prototype是javascript中的函数(function)的一个保留属性，并且它的值是一个对象（我们可以称这个对象为"prototype对象"）。
Prototype注意的细节：
1.prototype是函数(function)的一个必备属性(书面一点的说法是"保留属性")(只要是function,就一定有一个prototype属性)
2.prototype的值是一个对象
3.可以任意修改函数的prototype属性的值。
4.一个对象会自动拥有这个对象的构造函数的prototype的成员属性和方法。
*/
/*
function myTool(){}

var tool = new myTool();
tool.getMAX = function(arr){
	var max = arr[0];
	for(var i = 1; i < arr.length; i++){
		if(arr[i] > max){
			max = arr[i];	
		}	
	}
	return max;
};
*/
//把数组的工具方法添加到javascript内置对象Array中。
Array.prototype.getMAX = function(){
	var max = this[0];
	for(var i = 1; i < this.length; i++){
		if(this[i] > max){
			max = this[i];	
		}	
	}
	return max;
}

var array = new Array();
array[0] = 12;
array.push(12,34,56,78,21,53,10);

document.write(array.getMAX());

