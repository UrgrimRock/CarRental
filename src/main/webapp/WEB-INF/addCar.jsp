<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>Dodaj Auto</h1>
    <form method="post" action="${pageContext.request.contextPath}/addCar">
        Brand <input name="brand" /><br/>
        Model <input name="model" /><br/>
<%--        Baza <input name="base_id" value="${base.id}"/><br/>--%>
        Baza <select name="base">
                    <c:forEach items="${basesList}" var="base">
                        <option value="${base.id}">${base.name}</option>
                    </c:forEach>
    </select>
        <br/>

        <input type="submit" value="Zapisz">
    </form>
</body>
<button >
    <a href="/">
        OD NOWA
    </a>
</button>
</html>
