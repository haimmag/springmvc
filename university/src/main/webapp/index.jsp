<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<!-- saved from url=(0039)http://getbootstrap.com/examples/theme/ -->
<HTML lang="en" ng-app="app">
<HEAD>
<META content="IE=11.0000" http-equiv="X-UA-Compatible">

<META charset="utf-8">
<META http-equiv="X-UA-Compatible" content="IE=edge">
<META name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<META name="description" content="">
<META name="author" content="">
<LINK href="../../favicon.ico" rel="icon">
<TITLE>Theme Template for Bootstrap</TITLE>
<!-- Bootstrap core CSS -->
<LINK href="resources/css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<LINK href="resources/css/bootstrap-theme.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<LINK href="resources/css/theme.css" rel="stylesheet">
<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

<SCRIPT src="resources/js/ie-emulation-modes-warning.js"></SCRIPT>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<META name="GENERATOR" content="MSHTML 11.00.9600.17924">
</HEAD>
<BODY role="document" ng-controller="AppCtrl">
	<!-- Fixed navbar -->
	<NAV class="navbar navbar-inverse navbar-fixed-top">
		<DIV class="container">
			<DIV class="navbar-header">
				<BUTTON class="navbar-toggle collapsed" aria-expanded="false"
					aria-controls="navbar" type="button" data-toggle="collapse"
					data-target="#navbar">
					<SPAN class="sr-only">Toggle navigation</SPAN> <SPAN
						class="icon-bar"></SPAN><SPAN class="icon-bar"></SPAN><SPAN
						class="icon-bar"></SPAN>
				</BUTTON>
				<A class="navbar-brand"
					href="http://getbootstrap.com/examples/theme/#">Students
					Courses</A>
			</DIV>
			<DIV class="navbar-collapse collapse" id="navbar">
				<UL class="nav navbar-nav">
					<LI ng-class="{ active: isActive('/') }"><A
						href="/University">Home</A></LI>
					<LI ng-class="{ active: isActive('/students') }"><A href="/University/#students">Students</A></LI>
					<LI ng-class="{ active: isActive('/courses') }"><A href="/University/#courses" >Corses</A></LI>
				</UL>
			</DIV>
			
			<!--/.nav-collapse -->
		</DIV>
	</NAV>
	<DIV class="container theme-showcase" role="main">
		<!-- Main jumbotron for a primary marketing message or call to action -->

		<DIV class="jumbotron">
			<H1>University Students Courses</H1>
			<P>sample app</P>
		</DIV>

		<div ng-view></div>


	</DIV>
	<!-- /container -->
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<SCRIPT src="resources/js/jquery.min.js"></SCRIPT>
	<SCRIPT src="resources/js/angular.js"></SCRIPT>
	<SCRIPT src="resources/js/angular-route.js"></SCRIPT>

	<SCRIPT src="resources/js/bootstrap.min.js"></SCRIPT>

	<SCRIPT src="resources/js/docs.min.js"></SCRIPT>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<SCRIPT src="resources/js/ie10-viewport-bug-workaround.js"></SCRIPT>

	<SCRIPT src="resources/app/app.js"></SCRIPT>
	<SCRIPT src="resources/app/controllers.js"></SCRIPT>
</BODY>
</HTML>
