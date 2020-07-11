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

    <h1>Lista studentów</h1>

    <a href="/addStudent">Dopisz nowego</a>
    <table>
        <tr>
            <th>Imie</th>
            <th>Naziwsko</th>
            <th>Klasa</th>
            <th>Wiek</th>
            <th></th>
            <th></th>
        </tr>

        <c:forEach var="student" items="${studentsList}">
            <tr>
                <td>${student.name}</td>
                <td>${student.lastName}</td>
                <td>${student.className}</td>
                <td>${student.age}</td>
                <td><a href="/deleteStudent?id=${student.id}">Usuń</a></td>
                <td><a href="/editStudent?id=${student.id}">Edytuj</a></td>
            </tr>
        </c:forEach>
    </table>
    <hr/>
    <br>

    <h2>Wyszukiwanie po imieniu</h2>
    <form method="post" action="/findStudentByName">
        Wpisz imie: <input name="nameToFind"><br/>
        <input type="submit" value="Wyszukaj" />
    </form>
    <hr/>
    <br>


    <h2>Wyszukiwanie po fragmencie nazwiska</h2>
    <form method="post" action="/findStudentByLastName">
        Wpisz fragment nazwiska: <input name="lastNameToFind"><br/>
        <input type="submit" value="Wyszukaj" />
    </form>
    <hr/>
    <br>

    <h2>Wyszukiwanie po zakresie wieku</h2>
    <form method="post" action="/findStudentByAgeRange">
        Od: <input name="from"><br/>
        Do: <input name="to"><br/>
        <input type="submit" value="Wyszukaj" />
    </form>
    <hr/>
    <br>

</body>
</html>