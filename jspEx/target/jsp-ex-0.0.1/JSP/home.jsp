<%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 12.02.2019
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<span style="color: ${cookie.color.value}">Hello</span>

<form method="post" action="http://localhost:8080/jspEx_war/home">
    <label for="color">
        <select name="color" id="color">
            <option value="red">Красный</option>
            <option value="black">Чёрный</option>
            <option value="white">Белый</option>
        </select>

    </label>
<input type="submit" value="Color Send">

</form>
</body>
</html>
