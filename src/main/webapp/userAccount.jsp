<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="cus" items="${cusDetails}">
        ${cus.id}
        ${cus.name}
        ${cus.email}
        ${cus.phone}
        ${cus.userName}
        ${cus.password}
    </c:forEach>
</body>
</html>
