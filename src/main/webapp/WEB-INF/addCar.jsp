<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style><%@include file="style.css" %></style>

</head>
<body>
<h1>Dodaj Auto</h1>
    <form method="post" action="${pageContext.request.contextPath}/addCar">
        Marka <input name="brand" /><br/>
        Model <input name="model" /><br/>
        Baza <select name="baseId">
                    <option selected disabled >Wybierz adres</option>
                    <c:forEach items="${basesList}" var="base">
                        <option value="${base.id}">${base.adres}</option>
                    </c:forEach>
                </select>
        <br/>
        Typ Nadwozia<select name="bodyType">
                        <option>Kompakt</option>
                        <option>Sedan</option>
                        <option>Kombi</option>
                        <option>Miejskie</option>
                        <option>Coupe</option>
                    </select>
        <br/>
        Rok Produkcji <select name="productionYear" id="year">
                            <option selected disabled >Select Year</option>
                            <option value="2020">2020</option>
                            <option value="2019">2019</option>
                            <option value="2018">2018</option>
                            <option value="2017">2017</option>
                            <option value="2016">2016</option>
                            <option value="2015">2015</option>
                            <option value="2014">2014</option>
                            <option value="2013">2013</option>
                            <option value="2012">2012</option>
                            <option value="2011">2011</option>
                            <option value="2010">2010</option>
                            <option value="2009">2009</option>
                            <option value="2008">2008</option>
                            <option value="2007">2007</option>
                            <option value="2006">2006</option>
                            <option value="2005">2005</option>
                            <option value="2004">2004</option>
                            <option value="2003">2003</option>
                            <option value="2002">2002</option>
                            <option value="2001">2001</option>
                            <option value="2000">2000</option>
                            <option value="1999">1999</option>
                            <option value="1998">1998</option>
                            <option value="1997">1997</option>
                            <option value="1996">1996</option>
                            <option value="1995">1995</option>
                            <option value="1994">1994</option>
                            <option value="1993">1993</option>
                            <option value="1992">1992</option>
                            <option value="1991">1991</option>
                            <option value="1990">1990</option>
                            <option value="1989">1989</option>
                            <option value="1988">1988</option>
                            <option value="1987">1987</option>
                            <option value="1986">1986</option>
                            <option value="1985">1985</option>
                            <option value="1984">1984</option>
                            <option value="1983">1983</option>
                            <option value="1982">1982</option>
                            <option value="1981">1981</option>
                            <option value="1980">1980</option>
                        </select>
        <br/>
        Kolor <input name="color" /><br/>
        Przeieg <input type="number" name="course" /><br/>
        Status <select name="status/">
                        <option>Wolny</option>
                        <option>Zajęty</option>
                    </select><br/>
        Zł na dzień <input type="number" name="pricePerDay" /><br/>


        <input type="submit" value="Zapisz">
    </form>
</body>
<button >
    <a href="/">
        OD NOWA
    </a>
</button>
</html>
