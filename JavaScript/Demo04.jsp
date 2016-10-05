// JavaScript Document

function login(){
    var userName = document.getElementById("userName").value;
	var pwd = document.getElementById("pwd").value;
    
    if(pwd == 123456 && userName == "冉江亮"){
    	alert("登录成功...");   
    }else{
        alert(userName + " " + pwd);
    }
}