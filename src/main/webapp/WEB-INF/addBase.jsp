<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>Dodaj Bazę</h1>
    <form method="post" action="${pageContext.request.contextPath}/addBase">
        Adres <input name="adres" /><br/>
        <input type="submit" value="Zapisz">
    </form>
</body>
</html>
