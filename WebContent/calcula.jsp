<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora Struts</title>

</head>
<body>
	<html:form action="/calcula">


			Número 1
			<html:text property="calculadora.numero1"/>
			Número 2
			<html:text property="calculadora.numero2"/>


			<c:if test="${calculo != null }">
				<label> O calculo é: ${calculo} </label>
			</c:if>
			
			<input type="submit" name="soma" value="Somar" /> 
			<input type="submit" name="subtrair" value="Subtrair" />


	</html:form>
</body>
</html>