<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recipes</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<body>
<h1>Welcome, ${ user.firstName } ${ user.lastName }!</h1>
<div class="container">
<h2>Check out These Recipes!</h2>
<table class="table table-dark">
<thead>
<tr>
<td>Recipe</td>
<td>Created By:</td>
<td>Likes</td>
<td>Actions</td>
</tr>
</thead>
<tbody>
<c:forEach items="${ allRecipes }" var="recipe">
<tr>
<td><a href="/recipes/${recipe.id}"> ${ recipe.name }</a></td>
<td>${ recipe.creator.firstName } ${ recipe.creator.lastName }</td>
<td>${ recipe.likedRecipes.size() }</td>
<td>
<c:choose>
<c:when test="${ recipe.likedRecipes.contains(user) }">
<a href="/unlike/${ recipe.id }">Unlike</a>
</c:when>
<c:otherwise>
<a href="/like/${ recipe.id}">Like</a>
</c:otherwise>
</c:choose>
</td>
</tr>
</c:forEach>
</tbody>
</table>
<a href="/recipe/new" class="btn btn-danger">Create an Recipe</a>
</div>
</body>
</html>