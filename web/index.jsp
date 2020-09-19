<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap.min.css" rel="stylesheet"/>
	<link href="css/dashboard.css" rel="stylesheet">
	<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet" />
	<!-- <script src="js/ie-emulation-modes-warning.js"></script> -->
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
	<script src="https://cdn.bootcss.com/sql.js/0.5.0/js/sql-optimized.js"></script>
	<script>	
		// function add() {  
		// var trObj = document.createElement("tr");  
		// trObj.id = new Date().getTime();  
		// trObj.innerHTML = "<td><p></p></td><td><p></p></td><td><p></p></td>";  
		// document.getElementById("tb").appendChild(trObj);  
		//     }
	</script>
	</head>

	<body>

	<nav class="navbar navbar-inverse navbar-fixed-top" >
		<div class="container-fluid" >
			<div class="navbar-header">
				<a class="navbar-brand" href="#">云端监控平台</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse ">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="mine.html">我的资料</a></li>
					<li><a href="dr.html">登入</a></li>
				</ul>
			</div>
		</div>
	</nav>

		<div class="container-fluid">
			<div class="row">
				<div class="col-sm-3 col-md-2 sidebar">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
									我的设备
								</a>
							</h4>
						</div>
					<div id="collapseOne" class="panel-collapse collapse">
						<div class="panel-body">
							<ul class="nav nav-sidebar">
								<li><a href="#">设备信息<span class="sr-only"></span></a></li>
								<li><a href="bd.html">添加设备<span class="sr-only"></span></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-sm-8 col-sm-offset-3 col-md-10 col-md-offset-2 main">
			<h2 class="sub-header">设备情况</h2>
			
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>设备号</th>
								<th>地点</th>
								<th>状况</th>
						</thead>
						<tbody id="tb">
							<!-- php -->
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
		<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
		<script src="../../dist/js/bootstrap.min.js"></script>
		<script src="../../assets/js/vendor/holder.min.js"></script>
		<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
	  </body>
</html>
