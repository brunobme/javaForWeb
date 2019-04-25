<%@ page language="java" contentType="text/html; charset=UTF-8" errorPage="error.jsp"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculadora JSP</title>
</head>
<body>
	<jsp:include page="includes/header.jsp"></jsp:include>
	<form action="calcula.jsp" method="post">
		<label>Valor 1:</label><br>
		<input type="text" name="valor1" value="" size="25" /><br>
		<label>Valor 2:</label>
		<input type="text" name="valor2" value="" size="25" /><br>
		<label>Operação:</label>
		<select name="op">
			<option value="soma">soma</option>
			<option value="sub">subtração</option> 
			<option value="mult">multiplicação</option> 
			<option value="div">divisão</option>
		</select><br>
		<input type="submit" value="Calcular" />
	</form>
	<jsp:include page="includes/footer.jsp"></jsp:include>
</body>
</html>

