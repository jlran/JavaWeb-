// JavaScript Document
/*
  DOM(Document Object Model) 文档对象模型
	
	一个html页面被浏览器加载的时候，浏览器就会对整个html页面上的所有标签都会创建一个对应的对象进行描述，我在浏览器上看到的信息只不过就是这些html对象的属性信息而已。我们只要能找到对应的对象操作对象的属性，则可以改变浏览器当前显示的内容。  	

	var allNodes = document.all;   //获取html文件中的所有标签节点 。
	for(var i = 0; i<allNodes.length ; i++){
		alert(allNodes[i].nodeName);	 //标签的名字  nodeName;
	}

*/

function ready(){
	/*var allNoders = document.all;	//获取html文件中的所有标签节点 
	for(var i = 0; i < allNoders.length; i++){
		document.write(allNoders[i].nodeName + " ");
	}*/
}

function writeUrl(){
	var links = document.links;	// 获取文档中含有href的属性的标签。
	for(var i =0; i< links.length; i++){
		links[i].href = "http://www.baidu.com";
	}
}