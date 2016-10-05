// JavaScript Document
/*
省份：<select id="prevince" onchange="showCity()">
	<option>省份</option>
    <option>广东</option>
    <option>湖南</option>
</select>
城市：<select id="city" ><option>城市</option></select>
*/

function showCity(){
	//维护一个二维数组存储省份对应得城市
	var citys  = [[], ["广州","佛山", "湛江"], ["长沙","衡阳", "岳阳"]];
	//获取省份对应得结点
	var previnceNode = document.getElementById("prevince");
	//获取省份中的选项
	var selectIndex = previnceNode.selectedIndex;
	//获取对应的城市
	var cityDatas = citys[selectIndex];
	//找到City的结点
	var cityNode = document.getElementById("city");
	//设置options的个数
	cityNode.options.length = 1;
	//遍历并添加
	for(var index = 0; index < cityDatas.length; index++){
		var option = document.createElement("option");
		option.innerHTML = cityDatas[index];
		cityNode.appendChild(option);	
	}
}