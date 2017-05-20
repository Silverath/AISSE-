<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Publicar comentario</h1>
	<div class="container">

		<p class="message"></p>

		<form action="/ApiController" method="post">

			Autor:
			<textarea name="author"></textarea>
			<br>
			
			Título:
			<textarea name="title"></textarea>
			<br>
			
			comentario:
			<textarea name="body"></textarea>
			<br>
			<div class="bottom_links">
				<button type="submit" class="button">Publicar comentario</button>
				<button type="button"
					onClick="javascript:window.location.href='LoLSummonerView.jsp'"
					class="button">Cancel</button>
			</div>
		</form>
	</div>
</body>
</html>