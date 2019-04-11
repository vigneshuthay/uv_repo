<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="com.PlayerApp.springboot.model.Player"%>
<!DOCTYPE html>
<html>
<head>
<%
	Player player = (Player)request.getAttribute("PlayerInfo");
%>
<meta charset="ISO-8859-1">
<title>Sample</title>
</head>
<body>
	<table border="1">
		<tr>
			<td><b>PLAYER NAME</b></td>
			<td><b>PLAYER CITY</b></td>
			<td><b>PLAYER COUNTRY</b></td>
		</tr>

		<tr>
			<td><%=player.getPlayerName()%></td>
			<td><%=player.getPlayerCity()%></td>
			<td><%=player.getPlayerCountry()%></td>
		</tr>

	</table>
</body>

</html>
