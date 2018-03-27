<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Head Page</title>
    <style>
        <%@include file="/WEB-INF/pages/css/style-page-all.css"%>
    </style>
    <link href="<c:url value="/WEB-INF/pages/css/style-page-all.css"/>" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8   ">
</head>
<body>

    <table>
        <tr>
            <td><b>ID</b></td>
            <td><b>Name</b></td>
            <td><b>Sure Name</b></td>
            <td><b>Date</b></td>
            <td><b>Number</b></td>
            <td><b>Course</b></td>
            <td><b>Gender</b></td>
            <td><b>Pay skin</b></td>
        </tr>
        <c:forEach var="student" items="${student}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.surename}</td>
            <td>${student.date}</td>
            <td>${student.number}</td>
            <td>${student.course}</td>
            <td>${student.gender}</td>
            <td>${student.payskin}</td>
            <td><a href="/edit?id=${student.id}">Edit</a> | <a href="/delete?id=${student.id}">Delete</a> </td>
        </tr>
        </c:forEach>
        <tr>
            <td colspan="4">
                <a href="/add" onclick="CSS" >Add Note</a>
            </td>
        </tr>
    </table>

</body>
</html>
