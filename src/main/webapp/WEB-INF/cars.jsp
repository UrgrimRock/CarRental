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

<h1>Lista Samochodów</h1>

<table>
    <tr>
        <th>Marka</th>
        <th>Model</th>
        <th>Baza</th>

        <th></th>
    </tr>

    <c:forEach var="car" items="${carsList}">
        <tr>
            <td>${car.brand}</td>
            <td>${car.model}</td>
            <td><a href="/">Wybierz</a></td>


        </tr>
    </c:forEach>
</table>

<br>
<button >
    <a href="/">
        OD NOWA
    </a>
</button>

</body>
</html>