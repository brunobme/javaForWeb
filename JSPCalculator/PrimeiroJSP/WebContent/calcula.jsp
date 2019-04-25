<%@ page language="java" import="java.util.Date" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resultado</title>
</head>
<body>
	<jsp:include page="includes/header.jsp"></jsp:include>
	<%	
		Double valor1 = Double.parseDouble(request.getParameter("valor1"));
		Double valor2 = Double.parseDouble(request.getParameter("valor2"));
		String op = request.getParameter("op");
		String sin = "";
		Double res = 0.0;
		switch (op) {
		case "soma":
			res = valor1 + valor2;
			sin = " + ";
			break;
		case "sub":
			res = valor1 - valor2;
			sin = " - ";
			break;
		case "mult":
			res = valor1 * valor2;
			sin = " x ";
			break;
		case "div":
			res = valor1 / valor2;
			sin = " / ";
			break;
		default:
			System.out.println("Entrada inválida.");
			break;
	}%>
	<% if(valor2 == 0.0){ %>
		<jsp:forward page="error.jsp" />
	<%}%><br>
	<p>O resultado da operação 
	<% out.println(valor1 + sin + valor2 + " = " + res); %></p>
	<jsp:include page="includes/footer.jsp"></jsp:include>
</body>
</html>