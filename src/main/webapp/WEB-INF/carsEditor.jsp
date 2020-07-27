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

    <h1>Lista Samochodów</h1>

    <a href="/addCar">Dopisz Nowy Samochód</a>
    <table>
        <tr>
            <th>Marka</th>
            <th>Model</th>
            <th>Baza</th>
            <th>Adres</th>
            <th>Typ Nadwozia</th>
            <th>Rok Produkcji</th>
            <th>Kolor</th>
            <th>Przebieg</th>
            <th>Status</th>
            <th>Cena na dzień</th>
            <th></th>
            <th></th>
        </tr>

        <c:forEach var="car" items="${carsList}">
            <tr>
                <td>${car.brand}</td>
                <td>${car.model}</td>
                <td>${car.baseName}</td>
                <td>${car.baseAdres}</td>
                <td>${car.bodyType}</td>
                <td>${car.productionYear}</td>
                <td>${car.color}</td>
                <td>${car.course}</td>
                <td>${car.status}</td>
                <td>${car.pricePerDay}</td>

                <td><a href="/deleteCar?id=${car.id}">Usuń</a></td>
                <td><a href="/editCar?id=${car.id}">Edytuj</a></td>

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