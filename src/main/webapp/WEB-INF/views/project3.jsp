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
					<div class="project-image">
						<img src="images/projects/dog2.png" alt="">
						<img src="images/projects/dog3.png" alt="">
					</div>
					</div>
					<div class="col-lg-6 col-md-6 text-left">
						<h5>Android Project</h5>
						<p>
							학원에서 진행한 최종 프로젝트입니다.
							반려견을 일정 비용을 지불하고 맡기는 펫시팅 서비스이며 웹,앱을 모두 서비스했습니다.
							네이티브 앱을 제작하였으며, 전반적인 앱 UI, 리뷰,예약,결제 페이지를 담당했습니다.
							SQLite나 Firestore가 아닌 OracleDB와의 연동을 구현하였으며
							일반적인 URL Connection이 아닌 RetroFit2 라이브러리를 이용하여 서비스를 구현하였습니다.
						</p>
						<ul class="project-details-list">
						<li><span class="dark-text">Date: </span> <span class="extra-small-text">2019-12</span></li>
						<li><span class="dark-text">Skils: </span> <span class="extra-small-text">Java, Android, KakaoMap API</span></li>
						<li><span class="dark-text">URL: </span><a href="https://github.com/gikimirane/kosmo54-2" target="_blank"><span class="extra-small-text">https://github.com/gikimirane/kosmo54-2</span></a></li>
					</ul>
					</div>
				</div>

		</div>

	</div>

</body>

</html>
