<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>Edycja pracownika</h1>
    <form method="post" action="/editStudent">
        Imie: <input name="name" value="${employee.name}" /><br/>
        Nazwisko: <input name="surname" value="${employee.surname}"><br/>
        Menadzer: <input value="${employee.isManager}" name="isManager"><br/>
        <input type="hidden" name="id" value="${employee.id}">
        <input type="submit" value="Zapisz">
    </form>
</body>
</html>
