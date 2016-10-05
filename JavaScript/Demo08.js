// JavaScript Document
/*
Array中的方法：
		sort()
			对当前数组进行排序，并返回已经进行了排序的此Array对象。
			不会创建新对象，是在指定数组中直接进行排序。
		reverse()
			对当前数组进行反转排序，返回一个元素顺序被反转的 Array 对象。 
			不会创建新对象，是在指定数组中直接进行排序。

		push( [item1 [item2 [. . . [itemN ]]]] )
			将以新元素出现的顺序添加这些元素。
			如果参数之一为数组，那么该数组将作为单个元素添加到数组中。
		pop()
			移除数组中的最后一个元素并返回该元素。
			如果该数组为空，那么将返回 undefined。
		shift()
			移除数组中的第一个元素并返回该元素。
			如果该数组为空，那么将返回 undefined。
		unshift([item1[, item2 [, . . . [, itemN]]]])
			将指定的元素插入数组开始位置并返回该数组。

		splice(start, deleteCount, [item1[, item2[, . . . [,itemN]]]])
			移除从 start 位置开始的指定个数的元素，并插入新元素，从而修改 concat([item1[, item2[, . . . [, itemN]]]])
			返回一个新数组，这个新数组是由两个或更多数组组合而成的。原数组不变。
			要加的项目（item1 … itemN）会按照从左到右的顺序添加到数组。	
			如果某一项为数组，那么添加其内容到 array1 的末尾。
			如果该项目不是数组，就将其作为单个的数组元素添加到数组的末尾。		
		slice(start, [end]) 
			返回一个包含了指定的部分元素的数组。
			将返回索引大于等于start且小于end的一段。
			原数组不变。
		join(separator)
			把所有元素由指定的分隔符分隔开来组成一个字符串，返回这个字符串值。
			如果数组中有元素没有定义或者为 null，将其作为空字符串处理。
			
	//指定比较方式
	a.sort(compareTo);
	document.write(a + "<br/>");
	function compareTo(a, b) {
		return a - b;
	}
*/

var arr = new Array();
arr[0] = 12;
arr[3] = "dah";
arr[4] = "张三";

arr.push(19,34,12,56);
arr.sort();
arr.reverse();
arr.pop();

for(var index in arr){
	document.write(arr[index] + " ");
}

var str = arr.join("-");
document.write("<br/>" + str);

