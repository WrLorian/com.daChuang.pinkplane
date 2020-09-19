<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
		<title>云端监控平台</title>
		<link rel="stylesheet" type="text/css" href="css/1.css">
		<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
		<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
		<script src="https://cdn.bootcss.com/sql.js/0.5.0/js/sql-optimized.js"></script>
	</head>

	<body class="body2">
		<div class="body1"></div>
		<div class="heigth1"></div>
		<div class="drym">
			<div class="ym3">
				<font class="zt1">欢迎使用云端监控平台</font>
			</div>
			<div class="drym2">
				<form action=".php" method="post">
					<input class="inputtext1" type="text" id="id" name="UserIdDr" required="" oninvalid="setCustomValidity('账号不能为空')" oninput="setCustomValidity('')" placeholder="请输入电话号码">
					<input class="inputpassword1" type="password" id="PsdDr" name="PwdDr" placeholder="请输入密码" required="" oninvalid="setCustomValidity('密码不能为空')" oninput="setCustomValidity('')">
					<input class="submit1" id="sub1" type="submit" alue="Submit" value="登入">
				</form>
			</div>
			<div class="drzcdiv1">
				&nbsp;<a href="zc.html">注册</a>
				<a href="zy.html">取消</a>
			</div>
		</div>
	</body>
</html>
