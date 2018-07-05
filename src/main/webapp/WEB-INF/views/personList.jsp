<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page language="java"  pageEncoding="UTF-8" %>
<%--
  Created by IntelliJ IDEA.
  User: yildiza
  Date: 7/3/2018
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Person List Page</title>
</head>
<body>


<div>
    <h2>List of Person</h2>


    <a href="${pageContext.request.contextPath}/personList/addPerson"> Add Person </a>
</div>
<div>
    <table>

        <tr>

            <th>Person ID </th>
            <th>Person Name </th>
            <th>Person Surname </th>
            <th>Person age </th>
        </tr>
        <c:forEach var="person" items="${persons}">
            <tr>


            <td>${person.personID}</td>
            <td>${person.name}</td>
            <td>${person.surname}</td>
            <td>${person.age}</td>
                <td><a href="<spring:url value="/personList/viewPerson?personID=${person.personID}"/>"
                > View</a>
                    <a href="<spring:url value="/personList/deletePerson?personID=${person.personID}" />"
                    >Delete</a>
                    <a href="<spring:url value="/personList/editPerson?personID=${person.personID}" />"
                    >Edit</a>

                    <a class="button" href="${pageContext.request.contextPath}/personList?deletePerson=${person.personID}" Sil />
                </td>
            </tr>

        </c:forEach>

    </table>

</div>



</body>
</html>
