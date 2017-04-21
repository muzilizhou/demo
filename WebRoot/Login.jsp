<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png" />
	<link rel="icon" type="image/png" href="assets/img/favicon.png" />
	<title></title>

	<meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />

	<!-- CSS Files -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
	<link href="assets/css/paper-bootstrap-wizard.css" rel="stylesheet" />

	<!-- CSS Just for demo purpose, don't include it in your project -->
	<link href="assets/css/demo.css" rel="stylesheet" />

	<!-- Fonts and Icons -->
	<link href="assets/css/themify-icons.css" rel="stylesheet">
	<script src="js/jquery.js"></script>
	<script src="js/login.js"></script>
</head>

<body>
	<div class="image-container set-full-height" style="background-image: url('assets/img/paper-2.jpeg')">
	    <!--   Creative Tim Branding   -->
	    <a href="#">
	         <div class="logo-container">
	            <div class="logo">
	                <img src="assets/img/new_logo.png">
	            </div>
	            <div class="brand">
	                Login User
	            </div>
	        </div>
	    </a>
	    <!--   Big container   -->
	    <div class="container">
	        <div class="row">
		        <div class="col-sm-8 col-sm-offset-2">
		            <div class="wizard-container">
		                <div class="card wizard-card" data-color="green" id="wizard">
		                <form action="" method="">
		                    	<div class="wizard-header">
		                        	<h3 class="wizard-title">用户登录</h3>
		                        	<p class="category">user Login.</p>
		                    	</div>
								<div>
								<label style="margin-left:25%">用户名称</label>
				<input type="text" class="form-control" placeholder="Please enter your user name!" id="username" name="username" style="width: 50%;margin-left: 25%;margin-top: 2%"/>
			</div>
			<div>
				<label style="margin-left:25% ;margin-top: 2%">用户密码</label>
				<input type="password" class="form-control"  placeholder="Please enter your user password!" id="password" name="password" style="width: 50%;margin-left: 25%;margin-top: 2%"/>
			</div>
			 <div class="">
				<span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span></div> 
				${msg}
			<div>
				<input type="submit" value="登录" class="btn btn-primary" id="js-btn-login" style="margin-left: 30%;width:15%" onclick="UserLogin()"/>
				<input type="reset" value="注册" class="btn btn-primary" id="js-btn-login" style="margin-left: 10%;width:15%" onclick="Register()"/>
			</div>
		                    </form>
		                </div>
		            </div> 
		        </div>
	        </div> 
	    </div> 
	</div>

</body>

	<!--   Core JS Files   -->
	<script src="assets/js/jquery-2.2.4.min.js" type="text/javascript"></script>
	<script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="assets/js/jquery.bootstrap.wizard.js" type="text/javascript"></script>

	<!--  Plugin for the Wizard -->
	<script src="assets/js/paper-bootstrap-wizard.js" type="text/javascript"></script>

	<!--  More information about jquery.validate here: http://jqueryvalidation.org/	 -->
	<script src="assets/js/jquery.validate.min.js" type="text/javascript"></script>

</html>