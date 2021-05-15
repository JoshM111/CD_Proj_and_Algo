<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recipe Details</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<body>
<div class="container">
<h1>${ recipe.name }</h1>

<p>chef: ${ recipe.creator.firstName }</p>
<p></p>
<p></p>
<p></p>
<h4>Ingredients:</h4>
<p>${ recipe.ing1 } : ${ recipe.qty1 } ${ recipe.mm1 }</p>
<c:if test="${ recipe.ing2 != null }">
<p>${ recipe.ing2 } : ${ recipe.qty2 } ${ recipe.mm2 }</p>
</c:if>
<c:if test="${ recipe.ing3 != null }">
<p>${ recipe.ing3 } : ${ recipe.qty3 } ${ recipe.mm3 }</p>
</c:if>
<c:if test="${ recipe.ing4 != null }">
<p>${ recipe.ing4 } : ${ recipe.qty4 } ${ recipe.mm4 }</p>
</c:if>
<c:if test="${ recipe.ing5 != null }">
<p>${ recipe.ing5 } : ${ recipe.qty5 } ${ recipe.mm5 }</p>
</c:if>
<c:if test="${ recipe.ing6 != null }">
<p>${ recipe.ing6 } : ${ recipe.qty6 } ${ recipe.mm6 }</p>
</c:if>
<c:if test="${ recipe.ing7 != null }">
<p>${ recipe.ing7 } : ${ recipe.qty7 } ${ recipe.mm7 }</p>
</c:if>
<c:if test="${ recipe.ing8 != null }">
<p>${ recipe.ing8 } : ${ recipe.qty8 } ${ recipe.mm8 }</p>
</c:if>
<c:if test="${ recipe.ing9 != null }">
<p>${ recipe.ing9 } : ${ recipe.qty9 } ${ recipe.mm9 }</p>
</c:if>
<c:if test="${ recipe.ing0 != null }">
<p>${ recipe.ing0 } : ${ recipe.qty0 } ${ recipe.mm0 }</p>
</c:if>
<h4>Directions:</h4>
<p>${ recipe.step1 }</p>
<p>${ recipe.step2 }</p>
<p>${ recipe.step3 }</p>
<p>${ recipe.step4 }</p>
<p>${ recipe.step5 }</p>
<p>${ recipe.step6 }</p>
<p>${ recipe.step7 }</p>
<p>${ recipe.step8 }</p>
<p>${ recipe.step9 }</p>
<p>${ recipe.step0 }</p>
<a href="/recipes/${ recipe.id }/edit" class="btn btn-danger">Edit</a>

</div>
</body>
</html>