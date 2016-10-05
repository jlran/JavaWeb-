// JavaScript Document
/*
 创建字节入插入节点、设置节点的属性。
	document.createElement("标签名")		创建新元素节点
	elt.setAttribute("属性名", "属性值")	设置属性
	elt.appendChild(e)					添加元素到elt中最后的位置	
	
插入目标元素的位置	 
	elt.insertBefore(newNode, oldNode);	添加到elt中，child之前。
	注意： elt必须是oldNode的直接父节点。
					               
	elt.removeChild(child)		删除指定的子节点
	
	注意： elt必须是child的直接父节点。
	
	
	<input type="button"  onclick="add()" value="添加"  />
<table>
	<tr>
    	<td><input type="file" /></td><td ><input type="button" onclick="remove(this)" value="删除" /></td>
    </tr>
    <tr id="lastTr">
    	<td > <input type="button" onclick="addFile()" value="添加"/></td>
    </tr>
</table>
*/

var num = 0;
function add(){
	var inputNode = document.createElement("input");
	//创建一个input
	//setAttribute:设置节点的属性
	inputNode.setAttribute("type", "button");
	inputNode.setAttribute("value", "按钮" + num);
	num++;
	var bodyNode = document.getElementsByTagName("body")[0];
	bodyNode.appendChild(inputNode);
}

function addFile(){
	var trNode = document.createElement("tr");
	var tdNode1 = document.createElement("td");
	var tdNode2 = document.createElement("td");
	
	tdNode1.innerHTML = "<input type='file'/>";
	tdNode2.innerHTML = "<input type='button' onclick='remove(this)' value='删除'/>";
	
	trNode.appendChild(tdNode1);
	trNode.appendChild(tdNode2);
	
	var tbodyNode = document.getElementsByTagName("tbody")[0];
	var lastTr =document.getElementById("lastTr");
	tbodyNode.insertBefore(trNode, lastTr);
}

function remove(node){
	var trNode = node.parentNode.parentNode;
	var tbodyNode = document.getElementsByTagName("tbody")[0];
	tbodyNode.removeChild(trNode);
}