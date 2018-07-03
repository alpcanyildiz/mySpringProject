<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: yildiza
  Date: 7/3/2018
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to Add Person page</title>
</head>
<body>

<div>
    <h2>Welcome to Add Person page</h2>


    <a href="${pageContext.request.contextPath}/personList/"> Cancel </a>

</div>



<form:form action="${pageContext.request.contextPath}/personList/addPerson/" method="post" modelAttribute="person">

    <div class="form-group">
        <label for="Name">Name</label>
        <form:input path="name" id="name" class="form-Control"/>
    </div>


    <div class="form-group">
        <label for="Surname">Surname</label>
        <form:input path="surname" id="surname" class="form-Control"/>
    </div>


    <div class="form-group">
        <label for="Age">Age</label>
        <form:input path="age" id="age" class="form-Control"/>
    </div>


    <input type="submit" value="Submit"/>



</form:form>





<br>

<p>

    <a href="${pageContext.request.contextPath}/personList" </a>


</p>
</body>
</html>
