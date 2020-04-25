<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!-- SITE TITLE -->
	<title>방동현 포트폴리오입니다.</title>

	<!-- FAV ICONS and WEBFONT -->
<%--	<link rel="icon" href="images/favicons/favicon.ico">--%>
	<link rel="apple-touch-icon-precomposed" sizes="152x152" href="images/favicons/favicon-152.png">
	<link rel="apple-touch-icon-precomposed" sizes="120x120" href="images/favicons/favicon-120.png">
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/favicons/ favicon-72.png">
	<link rel="apple-touch-icon-precomposed" href="images/favicons/favicon-57.png">
	<link href='https://fonts.googleapis.com/css?family=Libre+Baskerville:400,600|Poppins:400,500,700' rel='stylesheet' type='text/css'>

	<!-- ICON FONT -->
	<link rel="stylesheet" href="assets/icons/styles.css">

	<!-- Third Party CSS including Bootstrap -->
	<link rel="stylesheet" href="css/third-party.css">

	<!-- STYLESHEETS -->
	<link rel="stylesheet" href="css/styles.css">
	<link rel="stylesheet" href="css/responsive.css">

	<!--[if lt IE 9]>
	<script defer src="js/html5shiv.js"></script>
    <![endif]-->

	<!-- =========================
 	JS SCRIPTS
	============================== -->
	<script defer src="js/jquery-1.11.3.min.js"></script>
	<script defer src="js/third-party-scripts.js"></script>
	<script defer src="js/custom.js"></script>

	<style>
		.portfolio-items img {
			width: 400px;
			height: 320px;
		}
	</style>

</head>

<body>

	<!-- =========================
     PRE LOADER
	============================== -->
	<div class="preloader">
  	<div class="status">
			<div class="loader">
				<svg class="circular" viewbox="25 25 50 50">
					<circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
				</svg>
			</div>
		</div>
	</div>


	<!-- =========================
     SECTION: HOME / HOMEPAGE
    ============================== -->
	<section class="home fixed-bg" id="home">

		<div class="color-overlay">
			<!-- COLOR OVERLAY -->

			<!-- NAVIGATION -->
			<div class="navbar navbar-inverse bs-docs-nav navbar-fixed-top sticky-navigation" role="navigation">
				<div class="container">
					<div class="navbar-header">

						<!-- NAVBAR EXPAND COLLAPSE ON MOBILE -->
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#alexis-navigation">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon icon-menu"></span>
						</button>

						<!-- LOGO -->
						<a class="navbar-brand" href="#">
							<img src="images/profile/logo.png" alt="LOGO">
						</a>

					</div>

					<div class="navbar-collapse collapse" id="alexis-navigation">
						<!-- NAVIGATION LINK -->
						<ul class="nav navbar-nav navbar-right main-navigation" id="internal-scroll">
							<li><a href="#home">Home</a>
							</li>
							<li><a href="#section1">About</a>
							</li>
							<li><a href="#section2">Skils</a>
							</li>
							<li><a href="#section3">Portfolio</a>
							</li>
						</ul>
					</div>

				</div>
				<!-- /END CONTAINER -->
			</div>
			<!-- /END NAIVATION -->

			<div class="container">
				<div class="row">
					<div class="col-lg-10 col-lg-offset-1 col-md-12">

						<!-- INTRO HEADING -->
						<h1 class="intro white-text text-center">함께하는 개발자<br> 방동현의 포트폴리오입니다.</h1>

					</div>
				</div>

				<div class="row text-center">

					<!-- 3 FEATURES ON HOMEPAGE -->
					<div class="home-features">

					</div>
				</div>
				<!-- END OF 3 FEATURES -->

			</div>
		</div>
	</section>

	<!-- =========================
     SECTION: ABOUT US
    ============================== -->
	<section class="about-us" id="section1">

		<div class="container">
			<div class="row">

				<!-- FEATURED IMAGE AREA -->
				<div class="col-lg-6 visible-lg">
					<div class="featured-image red-gradient-overlay">
						<img src="images/profile/london.jpg" alt="">
						<!-- ABOUT US FEATURED IMAGE -->
						<div class="image-border">
						</div>
					</div>
				</div>

				<!-- ABOUT US BOX -->
				<div class="col-lg-7 col-sm-12 overflow-box pull-right">
					<div class="about-box diffuse-shadow wow fadeInRight" data-wow-offset="30" data-wow-duration="1.5s" data-wow-delay="0.15s">

						<div class="about-content">

							<!-- SECTION HEADING -->
							<h2 class="section-heading text-left">개발자 소개</h2>

							<!-- PARAGRAPH -->
							<p class="text-left">
								2020년 1월, 6개월간 국비지원 학원 교육을 마치고 개발자의 길을 걷기 시작했습니다.
								요구사항, 업무분석, 문제점 인식, 해결을 통해 성장하고 있으며
								항상 스스로 의심하며 적극적인 피드백을 통해 새로움에 도전합니다.
								<br><br>
								한번에 다양한 문제를 해결할 수 있는 개발자보다,
								한 가지의 문제를 다양한 관점에서 해석해 나가는 개발자를 추구합니다.
							</p>
						</div>

						<div class="four-lines">
							<div class="line red-line-bottom">
							</div>
							<div class="line green-line-bottom">
							</div>
							<div class="line purple-line-bottom">
							</div>
							<div class="line yellow-line-bottom">
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</section>

	<!-- =========================
     SECTION: SERVICES
    ============================== -->
	<section class="our-focus bgcolor-2" id="section2">
		<div class="container">

			<!-- SECTION HEADER -->
			<div class="section-header">
				<h2>Skils</h2>
				<div class="sub-heading">
					웹 개발 파트별 간략한 기술 스택입니다.
				</div>
			</div>

			<div class="row focuses">

				<!-- SINGLE FOCUS COLUMN -->
				<div class="col-lg-3 col-sm-6 col-xs-12">
					<div class="single-focus white-bg diffuse-shadow red-line-bottom wow fadeInLeft" data-wow-offset="30" data-wow-duration="1.5s" data-wow-delay="0.15s">
						<!-- ICON -->
						<div class="icon red-text">
							<span class="icon icon-monitor"></span>
						</div>
						<!-- HEADING -->
						<h5>Frontend</h5>
						<!-- DETAILS -->
						<p>
							HTML·CSS·JavaScript<br>
							Jquery 라이브러리
						</p>
					</div>
				</div>

				<!-- SINGLE FOCUS COLUMN -->
				<div class="col-lg-3 col-sm-6 col-xs-12">
					<div class="single-focus white-bg diffuse-shadow green-line-bottom wow fadeInUp" data-wow-offset="30" data-wow-duration="1.5s" data-wow-delay="0.15s">
						<!-- ICON -->
						<div class="icon green-text">
							<span class="icon icon-database-regular"></span>
						</div>
						<!-- HEADING -->
						<h5>Backend</h5>
						<!-- DETAILS -->
						<p>
							SpringBoot API 서버 구축
							MySQL 스키마 설계
						</p>
					</div>
				</div>

				<!-- SINGLE FOCUS COLUMN -->
				<div class="col-lg-3 col-sm-6 col-xs-12">
					<div class="single-focus white-bg diffuse-shadow purple-line-bottom wow fadeInDown" data-wow-offset="30" data-wow-duration="1.5s" data-wow-delay="0.15s">
						<!-- ICON -->
						<div class="icon purple-text">
							<span class="icon icon-share"></span>
						</div>
						<!-- HEADING -->
						<h5>Devops</h5>
						<!-- DETAILS -->
						<p>
							SVN, Git 형상관리
						</p>
					</div>
				</div>

				<!-- SINGLE FOCUS COLUMN -->
				<div class="col-lg-3 col-sm-6 col-xs-12">
					<div class="single-focus white-bg diffuse-shadow purple-line-bottom wow fadeInDown" data-wow-offset="30" data-wow-duration="1.5s" data-wow-delay="0.15s">
						<!-- ICON -->
						<div class="icon purple-text">
							<span class="icon icon-basic-tablet"></span>
						</div>
						<!-- HEADING -->
						<h5>ETC</h5>
						<!-- DETAILS -->
						<p>
							Android 네이티브 앱
						</p>
					</div>
				</div>

			</div>
		</div>
	</section>

	<!-- =========================
     SECTION: PORTFOLIO
    ============================== -->
	<section class="portfolio white-bg" id="section3">

		<div class="container">

			<!-- SECTION HEADER -->
			<div class="section-header">
				<h2>Portfolio.</h2>
				<div class="sub-heading">
					학원 및 회사에서 진행한 프로젝트입니다.
				</div>
			</div>

			<div class="row">

				<!-- PROJECT LOADING ICON -->
				<div id="loader">
					<div class="loader-icon">
						<div class="loader">
							<svg class="circular" viewbox="25 25 50 50">
								<circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
							</svg>
						</div>
					</div>
				</div>

				<!-- PROJECTS -->
				<div class="col-lg-12" id="portfolio-list">
					<div class="portfolio-items grid">

						<!-- SINGLE PROJECT -->
						<figure class="effect-zoe wow fadeInLeft" data-wow-offset="30" data-wow-duration="1.5s" data-wow-delay="0.15s">

							<!-- PROJECT IMAGE and LINK -->
							<a href="/project1" title="Click to view details" class="more"><img src="images/projects/socketChat.png" alt="">
								<p class="description">
									<span class="icon icon-plus"></span>
								</p>
							</a>

							<figcaption>
								<div class="four-lines">
									<div class="line red-line-bottom">
									</div>
									<div class="line green-line-bottom">
									</div>
									<div class="line purple-line-bottom">
									</div>
									<div class="line yellow-line-bottom">
									</div>
								</div>

								<div class="caption-text">
									<h6 class="dark-text">1차 개인 프로젝트</h6>	<!-- PROJECT TITLE -->
								</div>

							</figcaption>
						</figure>

						<!-- SINGLE PROJECT -->
						<figure class="effect-zoe wow fadeInDown" data-wow-offset="30" data-wow-duration="1.5s" data-wow-delay="0.15s">

							<!-- PROJECT IMAGE and LINK -->
							<a href="/project2" title="Click to view details" class="more"><img src="images/projects/board.png" alt="">
								<p class="description">
									<span class="icon icon-plus"></span>
								</p>
							</a>

							<figcaption>
								<div class="four-lines">
									<div class="line red-line-bottom">
									</div>
									<div class="line green-line-bottom">
									</div>
									<div class="line purple-line-bottom">
									</div>
									<div class="line yellow-line-bottom">
									</div>
								</div>

								<div class="caption-text">
									<h6 class="dark-text">2차 개인 프로젝트</h6>	<!-- PROJECT TITLE -->
								</div>

							</figcaption>
						</figure>

						<!-- SINGLE PROJECT -->
						<figure class="effect-zoe wow fadeInRight" data-wow-offset="30" data-wow-duration="1.5s" data-wow-delay="0.15s">

							<!-- PROJECT IMAGE and LINK -->
							<a href="/project3" title="Click to view details" class="more"><img src="images/projects/dog2.png" alt="">
								<p class="description">
									<span class="icon icon-plus"></span>
								</p>
							</a>

							<figcaption>
								<div class="four-lines">
									<div class="line red-line-bottom">
									</div>
									<div class="line green-line-bottom">
									</div>
									<div class="line purple-line-bottom">
									</div>
									<div class="line yellow-line-bottom">
									</div>
								</div>

								<div class="caption-text">
									<h6 class="dark-text">팀 프로젝트</h6>	<!-- PROJECT TITLE -->
								</div>

							</figcaption>
						</figure>

						<!-- SINGLE PROJECT -->
						<figure class="effect-zoe wow fadeInLeft" data-wow-offset="30" data-wow-duration="1.5s" data-wow-delay="0.30s">

							<!-- PROJECT IMAGE and LINK -->
							<a href="/project4" title="Click to view details" class="more"><img src="images/projects/mailab.png" alt="">
								<p class="description">
									<span class="icon icon-plus"></span>
								</p>
							</a>

							<figcaption>
								<div class="four-lines">
									<div class="line red-line-bottom">
									</div>
									<div class="line green-line-bottom">
									</div>
									<div class="line purple-line-bottom">
									</div>
									<div class="line yellow-line-bottom">
									</div>
								</div>

								<div class="caption-text">
									<h6 class="dark-text">회사 프로젝트</h6>	<!-- PROJECT TITLE -->
								</div>

							</figcaption>
						</figure>

					</div>
				</div>

				<!-- LOADED PROJECT WILL SHOW HERE -->
				<div id="loaded-content">
				</div>

				<!-- BACK TO PORTFOLIO BUTTON ON LOADED PROJECT -->
				<a id="back-button" class="back-button btn btn-default standard-button red-button" href="#"><span class="icon icon-arrow-left"></span> Go Back</a>
			</div>
		</div>
	</section>

	<section class="get-in-touch" id="section10" style="padding-bottom: 0;">
		<div class="container" style="margin-left: 0; margin-right: 0; width: 100%;">

			<!-- FOOTER -->
			<div class="row no-gutters">
				<div class="footer clearfix">

					<div class="col-lg-3 col-md-3 col-lg-offset-2 col-md-offset-2">
						<div class="footer-col">
							<h6 class="green-text">Address</h6>
							<p class="white-text">
								경기도 부천시 오정구 원종동
							</p>
						</div>
					</div>

					<div class="col-lg-3 col-md-3">
						<div class="footer-col">
							<h6 class="purple-text">E-Mail</h6>
							<p class="white-text">
								gusehdqkd@naver.com
							</p>
						</div>
					</div>

					<div class="col-lg-3 col-md-3">
						<div class="footer-col">
							<div class="social-icons">
								<a href="https://www.facebook.com/gusehdqkd"><span class="icon icon-sb-facebook"></span></a>
								<a href="https://www.instagram.com/gusehdkd"><span class="icon icon-sb-instagram"></span></a>
							</div>
						</div>
					</div>
				</div>

				<div class="four-lines">
					<div class="line red-line-bottom">
					</div>
					<div class="line green-line-bottom">
					</div>
					<div class="line purple-line-bottom">
					</div>
					<div class="line yellow-line-bottom">
					</div>
				</div>

			</div>
		</div>
	</section>

</body>

</html>
