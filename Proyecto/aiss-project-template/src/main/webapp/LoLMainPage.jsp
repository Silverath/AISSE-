<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./css/LoLMainPage.css">
<link rel="stylesheet" type="text/css" href="./css/whiteBackground.css">
<title>Summoner's Search</title>
</head>
<body>
	<div class="white-background">
		<div class="LoLlogo">
			<img class="logo" src=/Images/logo-lol-smaller.png>
		</div>
		<div class="search">
			<form class="summonerSearch" method="get" action="/SummonerInfo">
				<input type="text" name="summonername" class="searchBox"
					placeholder="Type you summoner name here!" required><br>
				<input type="submit" class="search" value="Go!">
			</form>
		</div>
		<div class="division">
			<table>
<<<<<<< HEAD
				<tr height="500px">
					<td align="center" width="70%" height="310px"><iframe
							src="http://player.twitch.tv/?channel=<c:out value="${requestScope.nombreCanal}"></c:out>&muted=true"
							height="100%" width="100%" scrolling="no" allowfullscreen="true">
=======
				<tr>
					<td align="center" width="50%"><iframe
							src="http://player.twitch.tv/?channel=<c:out value="${requestScope.nombreCanal}"></c:out>&muted=true"
							height="100%" width="70%" scrolling="no" allowfullscreen="true">
<<<<<<< HEAD
=======
>>>>>>> master
>>>>>>> Figueroa
						</iframe></td>
					<td>
						<h1>How does this works?</h1>
						<p>This search will use your summoner's name from League of
							Legends to show you the information about your profile, like your
							last games, your most played champions, your runes, masteries,
							etc. Once you enter your summoner's name, you will be redirected
							to that page with the information got directly from Riot Games
							official API.</p>
					</td>
				</tr>
			</table>
			<div class="division">
				<h1>How does this works?</h1>
				<p>This search will use your summoner's name from League of
					Legends to show you the information about your profile, like your
					last games, your most played champions, your runes, masteries, etc.
					Once you enter your summoner's name, you will be redirected to that
					page with the information got directly from Riot Games official
					API.</p>
			</div>
		</div>
	</div>
</body>
</html>