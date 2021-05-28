<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="virhe.jsp"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="model.ProListItem" %>
<%@ page import="database.database" %>
<%@ page import="database.JDBCprotila" %>
<%@ page import="java.util.List" %>

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

<title>Puun tiheyslaskuri Pro versio</title>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	
}
</style>
</head>
<body>
	

<h1>Puun tiheyslaskuri Pro versio</h1>
<table border="1">
<form action="pro">
  	<th>
   		<td>
  		</td>
  		<td>
  			Arvo  
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
  		  	
  		  	 value=""

  		  	
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
  		  	
  		  	 value=""

  		  	
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
  		  	 value=""

  			
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
  			 value=""

  			
  			
  			>
   		</td>
	</tr>		
	<tr>
	
		<tr>
   		<td>
  		</td>
  		<td>
  			Grain 
  		</td>
  		<td>
  			<input type="text"  name="grain"
  				
  			>
   		</td>
	</tr>		
	<tr>
	

   		<td>
  		</td>
  		<td>
  			  
  		</td>
  		<td>
  			<input type="submit" class="btn btn-success" name="action" value="Laske">
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
	

		

</form>
</table>
<br>
<br>
<%
List<ProListItem> items = new ArrayList<ProListItem>();
JDBCprotila tila = new JDBCprotila();
items = tila.getAllItems();
%>


<table border="1">

<tr>
<td>ID</td>
<td>Tiheys</td>
<td>Grain</td>
<td>Paksuus</td>
<td>Leveys</td>
<td>Pituus</td>
<td>Paino</td>
<td>POISTA</td>
</tr>

<%DecimalFormat desimaalit = new DecimalFormat("0.00");
for(int i=0; i < items.size(); i++) {
	out.println("<tr>");
	ProListItem ProListItem = (ProListItem)items.get(i);
	out.println("<td>" + ProListItem.getId() + "</td>");
	out.println("<td>" + desimaalit.format(ProListItem.getTiheys()) + "</td>");
	out.println("<td>" + ProListItem.getGrain() + "</td>");
	out.println("<td>" + desimaalit.format(ProListItem.getPaksuus()) + "</td>");
	out.println("<td>" + desimaalit.format(ProListItem.getLeveys()) + "</td>");
	out.println("<td>" + desimaalit.format(ProListItem.getPituus()) + "</td>");
	out.println("<td>" + desimaalit.format(ProListItem.getPaino()) + "</td>");
	out.println("<td><a href=\"pro.jsp/Deleteid?id=" + ProListItem.getId()  + "\">POISTA</a></td>");
	out.println("</tr>");	
}
%>

</table>


</body>
</html>