<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<%
	@SuppressWarnings("unchecked")
	List<HashMap> list = new ArrayList<HashMap>();
	list = (List<HashMap>) request.getAttribute("AllPlayers");
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
			for (int i = 0; i < list.size(); i++) {
				HashMap player = (HashMap) list.get(i);
		%>
		<tr>
			<td><%=player.get("id")%></td>
			<td><a href="#" onClick="javascript:getPlayerInfo('<%=player.get("playerName")%>');"><%=player.get("playerName")%></a></td>
			<td><a href="getPlayerInfo/<%=player.get("playerName")%>">Click Here</a></td>
			<td><%=player.get("playerMatches")%></td>
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
