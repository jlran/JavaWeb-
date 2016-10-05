// JavaScript Document
/*
函数主要用来封装具体的功能代码。
函数是由这样的方式进行声明的：关键字 function、函数名、一组参数，以及置于括号中的待执行代码。 
注意：函数的形参是不用声明使用的。
函数的基本语法是这样的：
function functionName(arg0, arg1, ... argN) {
  statements
}
例如：
function sayHi(sName, sMessage) {
  alert("Hello " + sName + sMessage);
}

没有返回值类型，如果一个函数需要返回值直接使用return即可.
该函数只需要使用 return 运算符后跟要返回的值即可。

function sum(iNum1, iNum2) {
  return iNum1 + iNum2;
}

参数:
	JS的函数都是类似于Java中可变参数的。
在函数中可以直接使用arguments变量，arguments是一个数组，表示所有传递过来的参数。
在声明函数时，定义的形参就对应arguments数组中相应位置的参数值，写形参只是用着方便一点。

特点：
       1、使用function关键字定义函数。
       2、没有任何的返回值类型。
       3、函数的定义优先执行，与顺序无关。
       4、可以通过函数名赋值函数，函数变量的类型是function对象。
       5、参数列表不能有var关键字。
       6、函数的参数列表在具体调用的时候实参个数可以和形参个数不同。
       7、JavaScript函数天然的支持可变参数。 
       8、同名的函数最后声明会覆盖前面以声明。Javascript中没有函数重载。
*/

function add(num1, num2){
	return num1 + num2;    
}


function sum(){
	document.write(arguments[0] + " " + arguments[1] + "<br />");    
}
sum(1, 2);


document.write(add(1, 2));

