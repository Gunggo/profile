<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- SITE TITLE -->
	<title>Alexis - Portfolio Template</title>

	<!-- FAV ICONS and WEBFONT -->
	<link rel="icon" href="../../../resources/static/images/favicons/favicon.ico">
	<link rel="apple-touch-icon-precomposed" sizes="152x152" href="../../../resources/static/images/favicons/favicon-152.png">
	<link rel="apple-touch-icon-precomposed" sizes="120x120" href="../../../resources/static/images/favicons/favicon-120.png">
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/favicons/ favicon-72.png">
	<link rel="apple-touch-icon-precomposed" href="../../../resources/static/images/favicons/favicon-57.png">

	<link href='https://fonts.googleapis.com/css?family=Libre+Baskerville:400,600|Poppins:400,500,700' rel='stylesheet' type='text/css'>

	<!-- ICON FONT -->
	<link rel="stylesheet" href="../../../resources/static/assets/icons/styles.css">

	<!-- STYLESHEETS -->
	<link rel="stylesheet" href="../../../resources/static/css/third-party.css">
	<!-- Third Party CSS including Bootstrap -->

	<link rel="stylesheet" href="../../../resources/static/css/styles.css">

	<link rel="stylesheet" href="../../../resources/static/css/responsive.css">

	<!--[if lt IE 9]>
			<script src="js/html5shiv.js"></script>
    <![endif]-->

	<link href="headsupgrid/hugrid.css" type="text/css" rel="stylesheet" />
	<script defer src="headsupgrid/jquery-1.6.2.min.js"></script>
	<script defer src="headsupgrid/hugrid.js"></script>
	<script type="text/javascript">
		$(document).ready(function () {
			pageUnits = 'px';
			colUnits = 'px';
			pagewidth = 1140;
			columns = 12;
			columnwidth = 67.5;
			gutterwidth = 30;
			pagetopmargin = 0;
			rowheight = 25;
			gridonload = 'off';
			makehugrid();
			setgridonload();
		});
	</script>

	<script defer src="js/jquery-1.11.3.min.js"></script>
	<script defer src="js/bootstrap.min.js"></script>
	<script defer src="js/owl.carousel.min.js"></script>
	<script defer src="js/scrollReveal.min.js"></script>
	<script defer src="js/parallax.min.js"></script>
	<script defer src="js/third-party-scripts.js"></script>
	<script defer src="js/custom.js"></script>

</head>
<body>

	<div class="container">
		<div class="single-project">

			<!-- START EDITING FROM HERE -->
			<div class="row">
				<div class="col-lg-6 col-md-6">
					<div class="project-image"><img src="images/projects/board.png" alt=""></div>
					</div>
					<div class="col-lg-6 col-md-6 text-left">
						<h5>Simple Board</h5>
						<p>
							학원에서 진행한 2차 개인프로젝트이며 순수 JSP로 게시판, 로그인을 구현한 게시판입니다.
							게시판 페이징, 카카오 로그인 API, 댓글 구현을 하며 REST API, AJAX에 대한 이해도를 높일 수 있었던
							프로젝트였습니다.
						</p>
						<ul class="project-details-list">
						<li><span class="dark-text">Date: </span> <span class="extra-small-text">2019-10</span></li>
						<li><span class="dark-text">Skils: </span> <span class="extra-small-text">Java, HTML, CSS, JavaScript, AJAX, Orcale DB, KaKao API</span></li>
					</ul>
					</div>
				</div>

		</div>

	</div>

</body>

</html>
