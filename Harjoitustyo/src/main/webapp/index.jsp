<?xml version="1.0" encoding="ISO-8859-1" ?>

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

<title>Harjoitustyö</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
</head>
<body>


<h1>Puun tiheyslaskuri</h1>
<table border="1">
<form action="laske">
  	<th>
   		<td>
  		</td>
  		<td>
  			Arvo  
  		</td>
  		<td>
   		</td>
	</th>
  	<tr>
   		<td>
  		</td>
  		<td>
  			Paksuus (mm)  
  		</td>
  		<td>
  		  	<input type="text"  name="paksuus"
  		  	
  		  	
  		  	
  		  	>
   		</td>
	</tr>
	<tr>
   		<td>
  		</td>
  		<td>
  			Pituus (mm)  
  		</td>
  		<td>
  		  	<input type="text"  name="pituus"
  		  	
  		  	
  		  	
  		  	>
   		</td>
	</tr>
	<tr>
   		<td>
  		</td>
  		<td>
  			Leveys (mm)  
  		</td>
  		<td>
  			<input type="text"  name="leveys"			
  		  	
  			
  			>
   		</td>
	</tr>	

	<tr>
   		<td>
  		</td>
  		<td>
  			Paino (g)
  		</td>
  		<td>
  			<input type="text"  name="paino"
  			
  			
  			
  			>
   		</td>
	</tr>		
	<tr>
   		<td>
  		</td>
  		<td>
  			  
  		</td>
  		<td>
  			<input type="submit"  name="action" value="Laske">
  			<a href="kirjaudu.jsp">Pro versio</a>
  			
   		</td>
	</tr>	
	<tr>
   		<td>
  		</td>
  		<td>
  			Tulos (kg/m3) 
  		</td>
  		<td> 
  			 <% out.println(request.getAttribute("tiheys"));  %> kg/m3 
   		</td>
	</tr>	
	<tr>
   		<td>
  		</td>
  		<td>
  			
  		</td>
  		<td>
  			 
   		</td>
	</tr>	
</form>
</table>


</body>
</html>