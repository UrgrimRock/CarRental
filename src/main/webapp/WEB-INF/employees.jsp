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

<table>
    <tr>
        <th>Imie</th>
        <th>Nazwisko</th>
        <th>Menager</th>
        <th></th>
    </tr>

    <c:forEach var="employee" items="${employeesList}">
        <tr>
            <td>${employee.name}</td>
            <td>${employee.surname}</td>
            <td>${employee.isManager}</td>

        </tr>
    </c:forEach>
</table>
<button >
    <a href="/">
        OD NOWA
    </a>
</button>

<br>

</body>
</html>