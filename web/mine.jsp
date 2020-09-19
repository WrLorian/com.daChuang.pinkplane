<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="bootstrap.min.css" rel="stylesheet"/>
	<link href="1.css" rel="stylesheet"/>
	<link href="css/dashboard.css" rel="stylesheet">
	<link href="css/ie10-viewport-bug-workaround.css" rel="stylesheet" />
	<!-- <script src="js/ie-emulation-modes-warning.js"></script> -->
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
		<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
		<script src="https://cdn.bootcss.com/sql.js/0.5.0/js/sql-optimized.js"></script>
	
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
					<a class="navbar-brand" href="#">我的资料</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-right">
						<li><a href="zy.html">返回主页</a></li>
					</ul>
				</div>
			</div>
		</nav>
			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-3 col-md-2 sidebar">
						<ul class="nav nav-sidebar">
							<li><a href="#top">基本信息<span class="sr-only">(current)</span></a></li>

							<!-- <li><a href="#cen">我的设备<span class="sr-only">(current)</span></a></li> -->
							<li><a href="#">登入状态</a></li>
						</ul>
					</div>
				</div>
				<div class="col-sm-8 col-sm-offset-3 col-md-10 col-md-offset-2 main ">
					<a name="top"></a>
					<h2 class="sub-header">基本信息</h2>	
					<table>
						<tbody id="tb1">
						
						</tbody>
					</table>
					<a name="cen"></a>
					<h2 class="sub-header">我的设备</h2>
					<table>
						<tbody id="tb2">
							
						</tbody>
					</table>
					<button type="button" class="btn btn-block" onclick="">退出登入</button>
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
