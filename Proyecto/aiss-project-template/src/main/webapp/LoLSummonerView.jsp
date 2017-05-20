<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/css/LolSummonerView.css">
<link rel="stylesheet" type="text/css" href="./css/whiteBackground.css">
<%
	String name = request.getParameter("summonername");
%>
<title><%=name%> Stats Page</title>
</head>
<body>
	<div class=white-background>
		<table class="searchAgain">
			<tr>
				<td class="logo"><img
					src="/Images/Logo PAAAM sin fondo blanco.png"></td>
				<td class="search">
					<form class="summonerSearch" method="get" action="/SummonerInfo">
						<input type="text" class="searchBox" name="summonername"
							placeholder="Type your summoner's name here!"> <br>
						<input type="submit" class="searchButton" value="Go!">
					</form>
				</td>
			</tr>
		</table>
		<div class="division"></div>
		<div class="profile">
			<div class="profileInfo">
				<span><%=name%></span> <img class="playerIcon"
					src="http://avatar.leagueoflegends.com/euw/<%=name%>.png">
			</div>
			<div class="buttons">
				<button class="updateButton">Update</button>
				<button class="liveGameButton">Live Game</button>
			</div>
		</div>
		<div class="division"></div>
		<div class="buttonMenu">
			<button id="summary">Summary</button>
			<button id="champions">Champions</button>
			<button id="playerStats">Player Stats</button>
			<button id="runes">Runes</button>
			<button id="masteries">Masteries</button>
		</div>
		<div class="division"></div>
		<div class="prueba">
			<p>
				<c:out value="${requestScope.id}"></c:out>
			</p>
			<br>
			<p>
				<a href="/EditPost.jsp">Crear post en Facebook</a>
			</p>
			<br>
		</div>
	</div>
</body>
</html>