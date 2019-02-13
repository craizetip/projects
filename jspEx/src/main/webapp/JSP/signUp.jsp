<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.ranu.models.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Title</title>
    <link href="css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="form-style-9">

    <div class="form-style-9">
        Ples SignUp
    </div>
    <form method="post" action="http://localhost:8080/jspEx_war/signUp">
        <label for="name">User name
            <input class="field-full" type="text" id="name" name="name">
        </label>
        <label for="birthDate">Birth date
            <input class="field-full" type="text" id="birthDate" name="birthDate">
        </label>
        <label for="password">Password
            <input class="field-full" type="password" id="password" name="password">
        </label>
        <input type="submit" value="Sign Up">
    </form>

</div>

<table>
    <tr>
        <th>User name</th>
        <th>Birth Date</th>
    </tr>
    <c:forEach items="${usersFromServer}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.birthDate}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>