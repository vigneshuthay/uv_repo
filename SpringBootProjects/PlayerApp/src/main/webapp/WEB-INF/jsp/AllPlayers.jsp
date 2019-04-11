<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="com.PlayerApp.springboot.model.Player1"%>
<!DOCTYPE html>
<html>
<head>
<%
	@SuppressWarnings("unchecked")
	ArrayList playerList = new ArrayList<>(Arrays.asList(request.getAttribute("AllPlayers"))); 
	playerList = (ArrayList)playerList.get(0);
	//out.println(playerList);
	//playerList = new ArrayList();
%>
<meta charset="ISO-8859-1">
<title>Sample</title>
</head>
<body>
	<table border="1">
		<tr>
			<td><b>PLAYER ID</b></td>
			<td><b>PLAYER NAME</b></td>
			<td><b>GET INFO</b></td>
			<td><b>PLAYER MATCHES</b></td>
		</tr>
		<%
			for (int i = 0; i < playerList.size(); i++) {
				Player1 player = (Player1)playerList.get(i);
		%>
		<tr>
			<td><%=player.getPlayerId()%></td>
			<td><a href="#" onClick="javascript:getPlayerInfo('<%=player.getPlayerName()%>');"><%=player.getPlayerName()%></a></td>
			<td><a href="getPlayerInfo/<%=player.getPlayerName()%>">Click Here</a></td>
			<td><%=player.getPlayerMatches()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>

<script>
	function getPlayerInfo(value) {
		const Http = new XMLHttpRequest();
		const url = 'http://localhost:1001/controller/getPlayerInfo/' + value;
		alert(url);
		Http.open("GET", url, true);
		Http.send();
		Http.onreadystatechange = function() {
			//console.log(Http.responseText);
			alert(Http.responseText);
		};

	}
</script>

</html>
