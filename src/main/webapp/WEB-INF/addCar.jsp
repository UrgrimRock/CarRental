<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>Dodaj Auto</h1>
    <form method="post" action="${pageContext.request.contextPath}/addCar">
        Brand <input name="brand" /><br/>
        Model <input name="model" /><br/>
        <input type="submit" value="Zapisz">
    </form>
</body>
</html>
