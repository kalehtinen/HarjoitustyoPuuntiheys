<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<title>Kirjaudu</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>

	<h1>Kirjaudu sisään Pro versioon</h1>
	<table border="1">
		<form action="laske" method="post">

			<tr>
				<td>Salasana <br />(salasana = 100+23)</td>
				<td><input type="password" name="salasana"></td>
				<td><input type="submit" name="action" value="Kirjaudu"></td>
			</tr>
			<tr>
				<td>Eikö sinulla ole tunnuksia?<br/>Osta tunnukset täältä!</td>
				<td><input type="submit" class="btn btn-success" name="action"
					value="Osta tunnukset Pro versiion"></td>
			</tr>
			
		</form>
	</table>


</body>
</html>