<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Add Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8   ">
</head>
<body>
<form:form method="POST" action="/add" modelAttribute="student">
    <form:hidden path="id"/>
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Sure name:</td>
            <td><form:input path="surename"/></td>
        </tr>
        <tr>
            <td>Date:</td>
            <td><form:input path="date"/></td>
        </tr>
        <tr>
            <td>Number phone:</td>
            <td><form:input path="number"/></td>
        </tr>
        <tr>
            <td>Course number:</td>
            <td><form:input path="course"/></td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td><form:input path="gender"/></td>
        </tr>
        <tr>
            <td>Payskin:</td>
            <td><form:input path="payskin"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
