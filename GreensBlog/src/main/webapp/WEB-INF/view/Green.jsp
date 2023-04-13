<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
</head>
<style>
body {
	width: 1000px;
	display: flex;
	flex-direction: column;
	margin: 0 AUTO;
}

.material-symbols-outlined {
	font-variation-settings: 'FILL' 0, 'wght' 400, 'GRAD' 0, 'opsz' 48
}

.material-symbols-outlined {
	display: flex;
	font-variation-settings: 'FILL' 0, 'wght' 400, 'GRAD' 0, 'opsz' 48
}

.material-symbols-outlined {
	font-variation-settings: 'FILL' 0, 'wght' 400, 'GRAD' 0, 'opsz' 48
}

h1 .material-symbols-outlined {
	display: flex;
	text-indent: -200px;
	font-variation-settings: 'FILL' 0, 'wght' 400, 'GRAD' 0, 'opsz' 48
}

#header {
	display: flex;
	border: 1px solid black;
	margin: 20px;
	background-color: #D6E4FF;
	border-style: none;
	flex: 1;
}

#header h1 {
	display: flex;
	flex: 5;
}

#header pr {
	display: flex;
	width: 300px;
}

#side {
	border: 1px solid black;
	display: flex;
	flex-direction: column;
	width: 170px;
	height: 270px;
	border-radius: 20px;
	margin: -30px 20px;
	border-radius: 20px;
}

#side ol {
	list-style-type: none;
}

#side ol li {
	display: flex;
	text-indent: -26px;
	font-size: 12px;
	margin-bottom: 7px;
}

a {
	text-decoration: none;
	color: black;
}

a:hover {
	color: #6690FF;
}

#header .icon {
	display: flex;
	align-items: center;
	flex: 1;
	margin-right: -50px;
}

#header .icon .material-symbols-outlined {
	display: flex;
	margin-left: 5px;
	font-size: 35px;
}

.body {
	display: flex;
}

#title {
	display: flex;
	flex-direction: row;
	align-items: center;
	justify-content: center;
	height: 30px;
	width: 700px;
	margin-left: 230px;
}

#title .title {
	display: flex;
	flex: 5;
}

#title .material-symbols-outlined {
	display: flex;
	flex: 2;
}

#icon {
	display: flex;
	flex-direction: column;
	margin-top: 30px;
	flex: 2;
}

.content {
	display: flex;
	width: 730px;
	justify-content: center;
	align-items: center;
	margin-top: 20px;
}

img {
	margin: 15px;
	height: 185px;
	width: 185px;
}

#title .material-symbols-outlined {
	display: flex;
	justify-content: flex-end;
	align-items: flex-end;
}

#title h5 {
	display: flex;
	justify-content: center;
	align-items: center;
}

.content div {
	width: 150px;
	height: 300px;
	margin-right: 40px;
	margin-bottom: 50px;
}

.content p {
	margin-left: 20px;
	width: 120px;
	height: 100px;
	width: 120px;
}

#maincontent {
	display: -webkit-box;
	word-wrap: break-word;
	-webkit-line-clamp: 3;
	-webkit-box-orient: vertical;
	overflow: hidden;
	text-overflow: ellipsis;
	line-height: 18px;
	height: 54px;
}

.fotter {
	display: flex;
	justify-content: center;
	align-items: center;
	margin-top: 30px;
}

.date {
	color: gray;
}

.blog {
	justify-content: center;
	align-items: center;
}
</style>

<body>
	<div class="blog">
		<div>
			<div id="header">
				<h1>
					<pr>Green's Blog</pr>
					<span class="material-symbols-outlined" style="margin-left: 100px;"> settings </span>
				</h1>
				<div class="icon">
					<a href=""> <span class="material-symbols-outlined"> photo_camera </span></a> <a href=""><span class="material-symbols-outlined"> youtube_activity </span></a>
				</div>
			</div>
		</div>
		<div id="title">
			<div class="title">
				<div class="t">경영전략</div>
				<div style="color: #6690FF">
					<b>20</b>
				</div>
			</div>
			<a href=""> <span class="material-symbols-outlined"> edit_square </span></a>
		</div>
		<div class="body">
			<div id="side">
				<ol>
					<li>전체보기 <span class="material-symbols-outlined" style="margin-left: 100px;"> settings </span></li>

					<li><a href="">Python(12)</a></li>
					<li><a href="">Java(2)</a></li>
					<li><a href="">Ios(80)</a></li>
					<li><a href="">소프트웨어자료(26)</a></li>
					<li><a href="">리눅스(8)</a></li>
					<li><a href="">Git(4)</a></li>
					<li><a href="">자기개발(3)</a></li>
					<li><a href="">경영전략(20)</a></li>
					<li><a href="">리더쉽(7)</a></li>
				</ol>
			</div>

			<div id="con">
				<div class="content">
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">ContentScale.Fit: 가로세로 비율(기본값)을 유지</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">공간에 맞게 이미지를 가운데를 중심으로 자릅니다.</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">경계가 대상 높이와 일치하도록 가로세로 비율을 유지하면서 소스의 크기를</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">11일 경기도 화성에서 기아 전기 PBV 전</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
				</div>
				<div class="content">
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">ContentScale.Fit: 가로세로 비율(기본값)을 유지</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">공간에 맞게 이미지를 가운데를 중심으로 자릅니다.</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">경계가 대상 높이와 일치하도록 가로세로 비율을 유지하면서 소스의 크기를</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">11일 경기도 화성에서 기아 전기 PBV 전</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
				</div>
				<div class="content">
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">ContentScale.Fit: 가로세로 비율(기본값)을 유지</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">공간에 맞게 이미지를 가운데를 중심으로 자릅니다.</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">경계가 대상 높이와 일치하도록 가로세로 비율을 유지하면서 소스의 크기를</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">11일 경기도 화성에서 기아 전기 PBV 전</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
				</div>
				<div class="content">
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">ContentScale.Fit: 가로세로 비율(기본값)을 유지</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">공간에 맞게 이미지를 가운데를 중심으로 자릅니다.</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">경계가 대상 높이와 일치하도록 가로세로 비율을 유지하면서 소스의 크기를</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">11일 경기도 화성에서 기아 전기 PBV 전</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
				</div>
				<div class="content">
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">ContentScale.Fit: 가로세로 비율(기본값)을 유지</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">공간에 맞게 이미지를 가운데를 중심으로 자릅니다.</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">경계가 대상 높이와 일치하도록 가로세로 비율을 유지하면서 소스의 크기를</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
					<div>
						<a href=""> <img alt="" src="/image/dog.png">
							<p id="maincontent">11일 경기도 화성에서 기아 전기 PBV 전</p>
							<p class="date">2022.01.03</p>
						</a>
					</div>
				</div>

				<div class="fotter">
					<pr>< <a href="">이전</a> <a href="">1</a> <a href="">2</a> <a href="">3</a> <a href="">4</a> <a href="">5</a> <a href="">6</a> <a href="">7</a> <a href="">8</a> <a href="">9</a> <a href="">다음</a>
					> </pr>
				</div>
			</div>
		</div>
	</div>
</body>
</html>