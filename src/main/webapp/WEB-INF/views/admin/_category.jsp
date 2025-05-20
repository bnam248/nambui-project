<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 10/19/2023
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container mt-4">
    <form action="<c:url value="/category"/>" method="post">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Category id</label>
            <input type="text" name="id" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
            <label for="name" class="form-label">Category name</label>
            <input type="text" name="name" class="form-control" id="name">
        </div>
        <div class="mb-3">
            <label for="description" class="form-label">Description</label>
            <input type="text" name="description" class="form-control" id="description">
        </div>


        <button type="submit" class="btn btn-primary">create</button>
    </form>
    <table class="table">
            <thead>
            <tr>
                <th scope="col">Category id</th>
                <th scope="col">Category name</th>
                <th scope="col">Description</th>
            </tr>
            </thead>
            <tbody>
        <c:forEach var="c" items="${category}">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td>${c.description}</td>
            </tr>
        </c:forEach>
            </tbody>
    </table>
</div>
</body>
</html>
