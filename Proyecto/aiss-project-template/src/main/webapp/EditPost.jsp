<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post in Facebook - GameSmasher</title>
</head>
<style>
	textarea{
		height:7.7em;
		width:400px;
	}
</style>
<body>
	<h1>Publicar Post en Facebook</h1>
	<div class="container">

		<p class="message"></p>

		<form action="/FacebookController" method="post">

			Mensaje:
			<textarea name="message">Hey! I'm using GameSmasher, it's FREAKING AWESOME! http://vgsmasher-aiss.appspot.com</textarea>
			<br>
			<div class="bottom_links">
				<button type="submit" class="button">Publicar en Facebook</button>
				<button type="button"
					onClick="javascript:window.location.href='LoLSummonerView.jsp'"
					class="button">Cancel</button>
			</div>
		</form>
	</div>
</body>
</html>