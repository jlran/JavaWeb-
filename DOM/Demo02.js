// JavaScript Document
/*
	通过关系(父子关系、兄弟关系)找标签。
		parentNode	获取当前元素的父节点。
		childNodes	获取当前元素的所有下一级子元素。
		firstChild	获取当前节点的第一个子节点。
		lastChild	获取当前节点的最后一个子节点。
------------------------------------------------------------	
		nextSibling		获取当前节点的下一个节点。（兄节点）
		previousSibling	获取当前节点的上一个节点。（弟节点）		
我们可以通过标签的类型进行判断筛选：	
	文本节点的类型： 3
	注释的节点类型： 8
	标签节点的类型： 1

*/

function ready(){
	/*var bodyNode = document.getElementsByTagName("body")[0];
	document.write(bodyNode.parentNode.nodeName + "<br/>");	//获取当前元素的父节点
	var childNode = bodyNode.childNodes;
	for(var i = 0; i< childNode.length; i++){
		document.write(childNode[i].nodeName + "  ");
	}
	document.write("<hr/>");
	document.write(bodyNode.firstChild.nodeName + "<br/>");
	document.write(bodyNode.lastChild.nodeName + "<br/>");
	
	document.write("<hr/>");
	//在执行上面的时候 页面上没有添加任何input标签
	*/
	
	var id = document.getElementById("userName");
	alert(id.nextSibling.nodeName  + "<br/>");
	alert(id.previousSibling.nodeName  + "<br/>");
}