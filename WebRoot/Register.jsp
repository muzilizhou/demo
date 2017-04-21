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
	<script type="text/javascript" src="js/register.js"></script>
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
	                Creative User
	            </div>
	        </div>
	    </a>
	    <!--   Big container   -->
	    <div class="container">
	        <div class="row">
		        <div class="col-sm-8 col-sm-offset-2">

		            <!--      Wizard container        -->
		            <div class="wizard-container">
		                <div class="card wizard-card" data-color="green" id="wizard">
		                <form action="" method="">
		                <!--        You can switch " data-color="green" "  with one of the next bright colors: "blue", "azure", "orange", "red"       -->

		                    	<div class="wizard-header">
		                        	<h3 class="wizard-title">用户注册</h3>
		                        	<p class="category">user registration.</p>
		                    	</div>
								<div class="wizard-navigation">
									<div class="progress-with-circle">
									    <div class="progress-bar" role="progressbar" aria-valuenow="1" aria-valuemin="1" aria-valuemax="4" style="width: 15%;"></div>
									</div>
									<ul>
			                            <li>
											<a href="#location" data-toggle="tab">
												<div class="icon-circle">
													<i class="ti-map"></i>
												</div>
												基本信息
											</a>
										</li>
			                            <li>
											<a href="#type" data-toggle="tab">
												<div class="icon-circle">
													<i class="ti-direction-alt"></i>
												</div>
												身份验证
											</a>
										</li>
			                            <li>
											<a href="#facilities" data-toggle="tab">
												<div class="icon-circle">
													<i class="ti-panel"></i>
												</div>
												单位信息
											</a>
										</li>
			                            <li>
											<a href="#description" data-toggle="tab">
												<div class="icon-circle">
													<i class="ti-comments"></i>
												</div>
												信息绑定
											</a>
										</li>
			                        </ul>
								</div>
		                        <div class="tab-content">
		                            <div class="tab-pane" id="location">
		                            	<div class="row">
		                                	<div class="col-sm-12">
		                                    	<h5 class="info-text"> Please fill in your basic information!</h5>
		                            		</div>
		                                	<div class="col-sm-5 col-sm-offset-1">
		                                    	<div class="form-group">
		                                        	<label>用户名称</label>
		                                        	<input type="text" class="form-control" id="username" placeholder="Please enter your user name!">
		                                    	</div>
		                                	</div>
		                                	<div class="col-sm-5">
		                                    	<div class="form-group">
		                                        	<label>用户密码 </label>
		                                        	<input type="text" class="form-control" id="password" placeholder="Please enter your user password!">
		                                    	</div>
		                                	</div>
		                                	<div class="col-sm-5 col-sm-offset-1">
		                                    	<div class="form-group">
		                                        	<label>性别</label>
		                                        	<select class="form-control" id="sex">
			                                            <option disabled="" selected="">- Please -</option>
			                                            <option value="1">男</option>
			                                            <option value="2">女</option>
		                                        	</select>
		                                    	</div>
		                                	</div>
		                                	<div class="col-sm-5">
		                                    		<div class="form-group">
		                                        	<label>用户编号 </label>
		                                        	<input type="text" class="form-control" id="number" placeholder="Please enter your user id!">
		                                    	</div>
		                                	</div>
		                            	</div>
		                            </div>
		                            <div class="tab-pane" id="type">
		                                <h5 class="info-text">Please enter the true identity information! </h5>
		                                <div class="row">
		                                  <div class="col-sm-5 col-sm-offset-1">
		                                    	<div class="form-group">
		                                        	<label>真实姓名</label>
		                                        	<input type="text" class="form-control" id="name" placeholder="Please enter the real name!">
		                                    	</div>
		                                	</div>
		                                	<div class="col-sm-5">
		                                    	<div class="form-group">
		                                        	<label>身份证号</label>
		                                        	<input type="text" class="form-control" id="card" placeholder="Please enter the correct id number!">
		                                    	</div>
		                                	</div>
		                                	<div class="col-sm-5 col-sm-offset-1" style="margin-left: 30%">
		                                    	<div class="form-group">
		                                        	<label>身份类别</label>
		                                        	<select class="form-control" id="usertype">
			                                            <option disabled="" selected="">- Please -</option>
			                                            <option value="1">学员</option>
			                                            <option value="2">教员</option>
		                                        	</select>
		                                    	</div>
		                                	</div>
		                                </div>
		                            </div>
		                            <div class="tab-pane" id="facilities">
		                                <h5 class="info-text">Please enter the basic information. </h5>
		                                <div class="row">
		                                    <div class="col-sm-5 col-sm-offset-1">
		                                    	<div class="form-group">
		                                        	<label>单位名称</label>
		                                        	<input type="text" class="form-control" id="unitname" placeholder="Please enter the name of the entity!">
		                                    	</div>
		                                	</div>
		                                	<div class="col-sm-5">
		                                    	<div class="form-group">
		                                        	<label>单位编号</label>
		                                        	<input type="text" class="form-control" id="unitnumber" placeholder="Please input unit number!">
		                                    	</div>
		                                	</div>
		                                    	<div class="col-sm-5" style="margin-left:8.5%">
		                                    		<div class="form-group">
		                                        	<label>单位地址 </label>
		                                        	<input type="text" class="form-control" id="unitaddress" placeholder="Please enter the unit address!">
		                                    	</div>
		                                	</div>
		                                	<div class="col-sm-5">
		                                    		<div class="form-group">
		                                        	<label>单位电话 </label>
		                                        	<input type="text" class="form-control" id="unitphone" placeholder="Please enter the unit power consumption!">
		                                    	</div>
		                                	</div>
		                                </div>
		                            </div>
		                            <div class="tab-pane" id="description">
		                                <div class="row">
		                                    <h5 class="info-text"> The binding information. </h5>
		                                     <div class="col-sm-5 col-sm-offset-1">
		                                    	<div class="form-group">
		                                        	<label>Email邮箱</label>
		                                        	<input type="text" class="form-control" id="email" placeholder="Please enter the commonly used E-mail!">
		                                    	</div>
		                                	</div>
		                                	<div class="col-sm-5">
		                                    	<div class="form-group">
		                                        	<label>手机号</label>
		                                        	<input type="text" class="form-control" id="phone" placeholder="Please enter the commonly used mobile phone number!">
		                                    	</div>
		                                	</div>
		                                </div>
		                            </div>
		                        </div>
		                        <div class="wizard-footer">
	                            	<div class="pull-right">
	                                    <input type='button' class='btn btn-next btn-fill btn-success btn-wd' name='next' value='Next' />
	                                    <input type='button' class='btn btn-finish btn-fill btn-success btn-wd' name='finish' value='Finish' onclick="SubmitInfo()"/>
									</div>

	                                <div class="pull-left">
	                                    <input type='button' class='btn btn-previous btn-default btn-wd' name='previous' value='Previous' />
	                                </div>
	                                <div class="clearfix"></div>
		                        </div>
		                    </form>
		                </div>
		            </div> <!-- wizard container -->
		        </div>
	        </div> <!-- row -->
	    </div> <!--  big container -->

	  
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