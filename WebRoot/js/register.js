//用户注册
function SubmitInfo(){
				var username=document.getElementById("username").value;
				var password=document.getElementById("password").value;
				var sex=document.getElementById("sex").value;
				var number=document.getElementById("number").value;
				var name=document.getElementById("name").value;
				var card=document.getElementById("card").value;
				var usertype=document.getElementById("usertype").value;
				var unitname=document.getElementById("unitname").value;
				var unitnumber=document.getElementById("unitnumber").value;
				var unitaddress=document.getElementById("unitaddress").value;
				var unitphone=document.getElementById("unitphone").value;
				var email=document.getElementById("email").value;
				var phone=document.getElementById("phone").value;
				$.post("z",{
					action:"register",
					username:username,
					password:password,
					sex:sex,
					number:number,
					name:name,
					card:card,
					usertype:usertype,
					unitname:unitname,
					unitnumber:unitnumber,
					unitaddress:unitaddress,
					unitphone:unitphone,
					email:email,
					phone:phone,
				},function(result){
					if(result>0)
						{
							window.location.href="Login.jsp";
						}else{
							window.location.href="Register.jsp";
						}
				});
		}