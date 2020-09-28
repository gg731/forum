<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Forum</title>

    <script>
        function create() {
            window.location.replace("http://localhost:8080/create")
        }

        function posts() {
            window.location.replace("http://localhost:8080/")
        }
    </script>
</head>
<body style="background-color: whitesmoke">
<div>
    <nav class="navbar navbar-dark bg-dark">
        <h4 style="color: whitesmoke">Forum</h4>
        <button type="button" class="btn btn-light" style="margin-right:7% " onclick="posts()">Posts</button>
    </nav>
</div>

<div>
    <form action="<c:url value="/create" />" method="post" style="width: 30%; margin-left: 5%">
        <h2>New post</h2>
        <input type="number" hidden class="form-control" id="id" name="id" value="0">
        <div class="form-group">
            <label for="nameInput">Name</label>
            <input type="text" class="form-control" id="nameInput" name="name">
        </div>
        <div class="form-group">
            <label for="descInput">Description</label>
            <input type="text" class="form-control" id="descInput" name="desc">
        </div>
        <button type="submit" class="btn btn-success" style="float: right">Create</button>
    </form>
</div>

</body>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
</html>
