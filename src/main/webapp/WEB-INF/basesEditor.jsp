<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <style>
        table, td, th {
            border: 3px solid blueviolet;
            border-collapse: collapse;
            background-color: green;
        }
        body{
            background-color: aqua;
        }
    </style>
</head>

<body>

    <h1>Lista Baz</h1>

    <a href="/addBase">Dopisz Nową Bazę</a>
    <table>
        <tr>
            <th>Nazwa</th>
            <th>Adres</th>
            <th></th>
            <th></th>
        </tr>

        <c:forEach var="base" items="${basesList}">
            <tr>
                <td>${base.name}</td>
                <td>${base.adres}</td>
                <td><a href="/deleteBase?id=${base.id}">Usuń</a></td>
                <td><a href="/editBase?id=${base.id}">Edytuj</a></td>
            </tr>
        </c:forEach>
    </table>
    <hr/>
    <br>

    <h2>Wyszukiwanie po adresie</h2>
    <form method="post" action="/findBaseByName">
        Wpisz adres: <input name="adresToFind"><br/>
        <input type="submit" value="Wyszukaj" />
    </form>
    <hr/>
    <br>
    <button >
        <a href="/">
            OD NOWA
        </a>
    </button>

</body>
</html>