// JavaScript Document
/*
验证码：<span id="span"></span><input type="text" id="check"  onchange="checkCode()"/><input type="button" onclick="createCode()" value="刷新验证码" />
*/

var code = "";
function ready(){
	createCode();
}
function createCode(){
	code = "";
	var arr = ["1","2","5", "8","9","0"];
	for(var i =0; i < 4; i++){
		var ran = Math.floor(Math.random()*arr.length);
		code += arr[ran];
	}
	var co = document.getElementById("span");
	co.innerHTML = code;
	co.style.fontSize="22px";
	co.style.color = "red";
	co.style.backgroundColor="gray";
	co.style.textDecoration="line-through";
}

function checkCode(){
	var ch = document.getElementById("check");
	var inputCode = ch.value;
	if(inputCode == code){
		alert("你输入的验证码是正确的....");
	}else{
		alert("你输入的验证码是" + inputCode + "是错误的!");
		createCode();
	}
}

