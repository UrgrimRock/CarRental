<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link rel="stylesheet" href="style.css" type="text/css">
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

    <h1>Wybierz adres</h1>

    <table>
        <tr>
            <th>Adres</th>
            <th></th>
            <th></th>
        </tr>

        <c:forEach var="base" items="${basesList}">
            <tr>
                <td>${base.adres}</td>
                <td><a href="cars">Wybierz</a></td>
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

</body>
</html>