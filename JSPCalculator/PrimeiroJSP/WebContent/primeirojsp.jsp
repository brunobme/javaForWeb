<%@ page language="java" import="java.util.Date" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Primeiro JSP</title>
</head>
<body>
	<%
		String msg = "Olá Mundo!";
		out.println(msg);
	%> <br>
	<%= "Outra mensagem!" %> <br> Data e hora:
	<%= new Date() %>
    <!-- comentário em html -->
    <%-- comentário em jsp --%>

</body>
</html>