<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>Dodaj studenta</h1>
    <form method="post" action="/addStudent">
        Imie: <input name="name" /><br/>
        Nazwisko: <input name="lastName"><br/>
        Klasa: <input name="className"><br/>
        Wiek: <input name="age"><br/>
        <input type="submit" value="Zapisz">
    </form>
</body>
</html>
