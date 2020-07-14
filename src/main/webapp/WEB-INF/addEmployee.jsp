<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>Dodaj Pracownika</h1>
    <form method="post" action="${pageContext.request.contextPath}/addEmployee">
        Imie: <input name="name"  /><br/>
        Nazwisko: <input name="surname"><br/>
        Menadzer: <select name="isManager" >
                        <option>Tak</option>
                        <option>Nie</option>
                </select>
        <br/>
        <input type="submit" value="Zapisz">
    </form>
<button >
    <a href="/">
        OD NOWA
    </a>
</button>
</body>
</html>
