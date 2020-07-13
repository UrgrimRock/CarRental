<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<h1>Edycja Bazy</h1>
    <form method="post" action="/editBase">
        Nazwa <input name="name" /><br/>
        Adres <input name="adres" /><br/>
        <input type="hidden" name="id" value="${base.id}">
        <input type="submit" value="Zapisz">
    </form>
</body>
<button >
    <a href="/">
        OD NOWA
    </a>
</button>
</html>
