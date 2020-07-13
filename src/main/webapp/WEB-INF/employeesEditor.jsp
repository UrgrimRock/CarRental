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

    <h1>Lista Pracowników</h1>

    <a href="/addEmployee">Zatrudnij nowego pracownika!</a>
    <table>
        <tr>
            <th>Imię</th>
            <th>Nazwisko</th>
            <th>Menadzer</th>
            <th></th>
            <th></th>
        </tr>

        <c:forEach var="employee" items="${employeesList}">
            <tr>
                <td>${employee.name}</td>
                <td>${employee.surname}</td>
<%--                <td>${employee.isManager}</td>--%>
                <td><br/></td>
                <td><a href="/deleteEmployee?id=${employee.id}">Usuń</a></td>
                <td><a href="/editEmployee?id=${employee.id}">Edytuj</a></td>

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