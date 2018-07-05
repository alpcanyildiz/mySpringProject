<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yildiza
  Date: 7/3/2018
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h1>Welcome to the edit page</h1>


<form:form action="${pageContext.request.contextPath}/personList/editPerson" method="post" modelAttribute="editpersonPost">

    <form:hidden path="personID" id="personID" value="${editpersonPost.personID}" />

<div class="form-group">
    <label for="name">Name</label>
    <form:input path="name" id="name"  value="${editpersonPost.name}"  placeholder="Name"></form:input>
</div>


<div class="form-group">
    <label for="surname">Surname</label>
    <form:input path="surname" id="surname"  value="${editpersonPost.surname}" placeholder="Surname"></form:input>
</div>


<div class="form-group">
    <label for="age">Age</label>
    <form:input path="age" id="age"  value="${editperson.personID}" class="form-Control" placeholder="Age"></form:input>
</div>

    <input type="submit" value="Edit"/>
</form:form>

</body>
</html>
