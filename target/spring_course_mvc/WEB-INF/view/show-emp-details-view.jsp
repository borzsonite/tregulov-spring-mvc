<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Show details</h2>
<%--<h3>Welcome, ${param.employeeName}!</h3>--%> <%--параметр берется из view--%>
<%--<h3>Welcome, ${empName}! ${descripiton}</h3> &lt;%&ndash;параметр прописан в контроллере стр. 31&ndash;%&gt;--%>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department ${employee.department}
<br>
Your car is: ${employee.carBand}
<br>
Foreign language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>

</body>
</html>
