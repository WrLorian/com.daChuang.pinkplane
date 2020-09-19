<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap.min.css" rel="stylesheet"/>
	<link rel="stylesheet" type="text/css" href="css/1.css">
	<link href="css/dashboard.css" rel="stylesheet">
	<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet" />
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
	<script src="https://cdn.bootcss.com/sql.js/0.5.0/js/sql-optimized.js"></script>
	
	<style type="text/css">
		.bdbg{
			padding: 9px 15px;
			margin: 6px 0px;
			display: inline-block;
			border: 1px solid #ccc;
			border-radius: 1px;
			box-sizing: border-box;
			border-radius: 5px;
			box-shadow: 2px 2px 5px #CCCCCC;
		}
	</style>
	<script src="js/ie-emulation-modes-warning.js"></script>
	<body>
		<nav class="navbar navbar-inverse navbar-fixed-top" >
			<div class="container-fluid" >
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">绑定设备</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="zy.html">取消绑定</a></li>
					</ul>
				</div>
			</div>
		</nav>
			<div class="container-fluid">
<!-- 				<div class="row">
					<div class="col-sm-3 col-md-2 sidebar">
						<ul class="nav nav-sidebar">
							<li><a href="#top"><span class="sr-only">(current)</span></a></li>
							<li><a href="#cen"><span class="sr-only">(current)</span></a></li>
							<li><a href="#"></a></li>
						</ul>
					</div>
				</div> -->
				<div class="col-sm-8 col-sm-offset-3 col-md-10 col-md-offset-2 main ">
					<form action=".php" method="post">
						<h2 class="form-signin-heading">请按照提示输入设备信息</h2>
						<input class="bdbg form-control" type="text" name="SbBh" placeholder="请输入设备编号" required="" oninvalid="setCustomValidity('设备编号不能为空')" oninput="setCustomValidity('')">
						<input class="bdbg form-control" type="text" name="SbWz" placeholder="请输入设备位置" required="" oninvalid="setCustomValidity('设备位置不能为空')" oninput="setCustomValidity('')">
						<input class="bdbg form-control" type="number" name="SbDh" placeholder="请输入当前设备要绑定的手机号" required="" oninvalid="setCustomValidity('绑定的手机号不能为空')" oninput="setCustomValidity('')">
						<input class="btn btn-lg btn-primary btn-block" id="queren1" type="submit" value="确认"></input>
					</form>
				</div>
			</div>
		
			<!-- Bootstrap core JavaScript
			================================================== -->
			<!-- Placed at the end of the document so the pages load faster -->
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
			<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
			<script src="../../dist/js/bootstrap.min.js"></script>
			<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
			<script src="../../assets/js/vendor/holder.min.js"></script>
			<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
			<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
	</body>
</html>
