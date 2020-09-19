<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<title></title>
		<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
			<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
			<script src="https://cdn.bootcss.com/sql.js/0.5.0/js/sql-optimized.js"></script>
		
		<link rel="stylesheet" type="text/css" href="css/1.css">
		<link rel="stylesheet" type="text/css" href="css/2.css">
		<script src="js/1.js"></script>
	</head>
	
	<body class="body2">
		<div class="body1"></div>
		<div class="heigth1"></div>
		<div class="zcdiv1">
			<div class="ym3">
				<font class="zt1">注册</font>
			</div>
			<div>
				<form action=".php" method="post">
					<div class="zcdiv2"><font class="zczt">用户名：</font></div>
					<div class="zcdiv3"><input class="inputtext2" type="text"  id="id" name="userid" required="" oninvalid="setCustomValidity('用户名/账号不能为空')" oninput="setCustomValidity('')" placeholder="请输入用户名"/></div>
					<div class="zcdiv2"><font class="zczt">密码：</font></div>
					<div class="zcdiv3"><input class="inputpassword2" type="password" id="psw1" name="PwdZc" placeholder="请输入密码" required="" oninvalid="setCustomValidity('此项必填')" oninput="setCustomValidity('')"></div>
					<div class="zcdiv2"><font class="zczt">确认密码：</font></div>
					<div class="zcdiv3"><input class="inputpassword2" type="password" id="psw2" name="PwdZcY" placeholder="请重复输入密码" required="" oninvalid="setCustomValidity('此项必填')" oninput="setCustomValidity('')" onkeyup="validate()"></div>
					<div class="zcdiv2"></div>
					<div class="zcdiv4"><span id="pswtf">请使两次密码相同</span></div>
					<div class="zcdiv2"><font class="zczt">电话号码：</font></div>
					<div class="zcdiv3"><input class="inputtext2" type="number" name="userDh" required="" oninvalid="setCustomValidity('电话号码不能为空')" oninput="setCustomValidity('')" placeholder="请输入电话号码"/></div>
					<div class="zcdiv2"><font class="zczt">邮箱：</font></div>
					<div class="zcdiv3"><input class="inputtext2" type="email" name="useremail" required="" oninvalid="setCustomValidity('电子邮箱不能为空')" oninput="setCustomValidity('')" placeholder="请输入电子邮箱"/></div>
					
					<input class="submit1" id="zcsubmit1" type="submit" alue="Submit2" value="注册" onclick="javascript:form. action='dr.html';">
				</form>
			</div>
		</div>
	</body>
</html>
