<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="com.MicroService1.springboot.model.Player"%>
<!DOCTYPE html>
<html>
<head>
<%
	@SuppressWarnings("unchecked")
	List<Player> list = new ArrayList<Player>();
	list = (List<Player>) request.getAttribute("AllPlayers");
%>
<meta charset="ISO-8859-1">
<title>Sample</title>
</head>
<body>
	<table border="1">
		<tr>
			<td><b>PLAYER ID</b></td>
			<td><b>PLAYER NAME</b></td>
			<td><b>PLAYER MATCHES</b></td>
		</tr>
		<%
			for (int i = 0; i < list.size(); i++) {
				Player player = list.get(i);
		%>
		<tr>
			<td><%=player.getPlayerId()%></td>
			<td><%=player.getPlayerName()%></td>
			<td><%=player.getPlayerMatches()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
