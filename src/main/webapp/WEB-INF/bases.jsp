<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <style><%@include file="style.css" %></style>
</head>

<body>

    <h1>Wybierz adres</h1>

    <table>
        <tr>
            <th>Nazwa</th>
            <th>Adres</th>
            <th></th>
        </tr>

        <c:forEach var="base" items="${basesList}">
            <tr>
                <td>${base.name}</td>
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
    <button >
        <a href="/">
            OD NOWA
        </a>
    </button>

</body>
</html>