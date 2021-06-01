<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Serge
  Date: 30.05.2021
  Time: 23:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Ask details</h2>

<%--<form action = "showDetails" method="get">--%>
<%--    <input type="text" name="employeeName" placeholder="Enter your name"/>--%>
<%--    <input type="submit"/>--%>
<%--</form>--%>

<form:form action="showDetails" modelAttribute="employee">
    <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    <form:select path="department">
<%--        <form:option value="Information technology" label="IT"/>--%>
<%--        <form:option value="Human resources" label="HR"/>--%>
<%--        <form:option value="Sales" label="Sales"/>--%>
        <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Which car do you want?
    <br>
    <form:radiobuttons path="carBand" items="${employee.carBrands}"/>
<%--    BMW<form:radiobutton path="carBand" value="BMW"/>--%>
<%--    MB<form:radiobutton path="carBand" value="MB"/>--%>
<%--    Audi<form:radiobutton path="carBand" value="Audi"/>--%>
    <br>
    Foreign language(s)
    <form:checkboxes path="languages" items="${employee.languageList}"/>
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Dauchland"/>--%>
<%--    FR <form:checkbox path="languages" value="Franch"/>--%>
    <br>
    Phone number:<form:input path="phoneNumber"/>
    <from:errors path="phoneNumber"/>
    <br>
   Email:<form:input path="email"/>
    <form:errors path="email"/>
    <input type="submit" value="OK">


</form:form>

</body>
</html>
