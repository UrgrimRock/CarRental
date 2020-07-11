<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>Edycja studenta</h1>
    <form method="post" action="/editStudent">
        Imie: <input name="name" value="${student.name}" /><br/>
        Nazwisko: <input name="lastName" value="${student.lastName}"><br/>
        Klasa: <input name="className" value="${student.className}"><br/>
        Wiek: <input name="age" value="${student.age}"><br/>
        <input type="hidden" name="id" value="${student.id}">
        <input type="submit" value="Zapisz">
    </form>
</body>
</html>
