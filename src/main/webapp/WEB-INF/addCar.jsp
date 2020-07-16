
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>Dodaj Auto</h1>
    <form method="post" action="${pageContext.request.contextPath}/addCar">
        Brand <input name="brand" /><br/>
        Model <input name="model" /><br/>
        Baza <input name="base_id" value="${base.id}"/><br/>
        <br/>

        <input type="submit" value="Zapisz">
    </form>
</body>
<button >
    <a href="/">
        OD NOWA
    </a>
</button>
</html>
