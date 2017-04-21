//注册
function Register(){
	window.location.href="Register.jsp";
}
//登录
function UserLogin(){
	var username=$("#username").val();
	var password=$("#password").val();
	$.post("z",{
		action:"login",
		username:username,
		password:password,
	},function(result){
		resultJson = $.parseJSON(result);
		$.each(resultJson,function(index,json){
			html = '<tr><td>'+json.id+'</td><td>'+json.logname+'</td><td>'+json.logpwd+'</td><td><a onclick="xiangqing(\''+json.id+'\',\''+json.logname+'\')" href="#">详情</a></td></tr>';
			$("#table1").append(html);
		});
	});
}
