// JavaScript Document
/*

通过html元素的标签属性找节点。
		document.getElementById("html元素的id") 
		document.getElementsByTagName("标签名") 
		document.getElementsByName("html元素的name")

<input type="text" id="userName" value="请输入用户名..."  />
<input type="button" onclick="showText()" value="设置用户名"  />
<hr />
<img src="" />
<img src="" />
<img src="" />
<input type="button" onclick="showImg()" value="设置显示图片" />
<hr />
<div name="info" ></div>
<div name="info"></div>
<div name="info"></div>
<input type="button" onclick="showDiv()" value="设置DIV的内容" />
*/

function showText(){
	var id = document.getElementById("userName");
	id.value = "Jo Ran";
}

function showImg(){
	var imgs = document.getElementsByTagName("img");
	for(var i = 0; i < imgs.length; i++){
		imgs[i].src="../src/img/background.jpg";
		imgs[i].width="300";
		imgs[i].height="200";
	}
}

function showDiv(){
	var div = document.getElementsByName("info");
	for(var i = 0; i < div.length; i++){
		div[i].innerHTML=("这是DIV标签" + i).fontcolor("red");
	}
}

