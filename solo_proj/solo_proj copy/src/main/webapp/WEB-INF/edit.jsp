<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Recipe</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<body>
<div class ="container">
	<div class="form-group">
		<form:form action="/recipes/${ recipe.id }/edit" method="POST" modelAttribute="recipe">
		
      	<h2>
	      	<form:label path="name"> Title: 
			<form:errors path="name"/>
			<form:input path="name"/></form:label>
		</h2>
		<h5>
	      	<form:label path="ing1">Ingredient: 
			<form:errors path="ing1"/>
			<form:input path="ing1"/></form:label>
			<form:label path="qty1">Quantity: 
			<form:errors path="qty1"/>
			<form:input path="qty1"/></form:label>
			<form:label path="mm1">Unit of Measure: 
			<form:errors path="mm1"/>
			<form:input path="mm1"/></form:label>
		</h5>
<!-- 		<div style="border:solid 1px #ddd; padding:10px; display:none;" id="cont"> 
					</div>
		<input type="button" value="+" id="bt" onclick="toggle(this)"> -->
		<h5>
	      	<form:label path="ing2">Ingredient: 
			<form:errors path="ing2"/>
			<form:input path="ing2"/></form:label>
			<form:label path="qty2">Quantity: 
			<form:errors path="qty2"/>
			<form:input path="qty2"/></form:label>
			<form:label path="mm2">Unit of Measure: 
			<form:errors path="mm2"/>
			<form:input path="mm2"/></form:label>
		</h5>
    	<h5>
	      	<form:label path="ing3">Ingredient: 
			<form:errors path="ing3"/>
			<form:input path="ing3"/></form:label>
			<form:label path="qty3">Quantity: 
			<form:errors path="qty3"/>
			<form:input path="qty3"/></form:label>
			<form:label path="mm3">Unit of Measure: 
			<form:errors path="mm3"/>
			<form:input path="mm3"/></form:label>
		</h5>
		<h5>
	      	<form:label path="ing4">Ingredient: 
			<form:errors path="ing4"/>
			<form:input path="ing4"/></form:label>
			<form:label path="qty4">Quantity: 
			<form:errors path="qty4"/>
			<form:input path="qty4"/></form:label>
			<form:label path="mm4">Unit of Measure: 
			<form:errors path="mm4"/>
			<form:input path="mm4"/></form:label>
		</h5>
		<h5>
	      	<form:label path="ing5">Ingredient: 
			<form:errors path="ing5"/>
			<form:input path="ing5"/></form:label>
			<form:label path="qty5">Quantity: 
			<form:errors path="qty5"/>
			<form:input path="qty5"/></form:label>
			<form:label path="mm5">Unit of Measure: 
			<form:errors path="mm5"/>
			<form:input path="mm5"/></form:label>
		</h5>
		<h5>
	      	<form:label path="ing6">Ingredient: 
			<form:errors path="ing6"/>
			<form:input path="ing6"/></form:label>
			<form:label path="qty6">Quantity: 
			<form:errors path="qty6"/>
			<form:input path="qty6"/></form:label>
			<form:label path="mm6">Unit of Measure: 
			<form:errors path="mm6"/>
			<form:input path="mm6"/></form:label>
		</h5>
		<h5>
	      	<form:label path="ing7">Ingredient: 
			<form:errors path="ing7"/>
			<form:input path="ing7"/></form:label>
			<form:label path="qty7">Quantity: 
			<form:errors path="qty7"/>
			<form:input path="qty7"/></form:label>
			<form:label path="mm7">Unit of Measure: 
			<form:errors path="mm7"/>
			<form:input path="mm7"/></form:label>
		</h5>	
		<h5>
	      	<form:label path="ing8">Ingredient: 
			<form:errors path="ing8"/>
			<form:input path="ing8"/></form:label>
			<form:label path="qty8">Quantity: 
			<form:errors path="qty8"/>
			<form:input path="qty8"/></form:label>
			<form:label path="mm8">Unit of Measure: 
			<form:errors path="mm8"/>
			<form:input path="mm8"/></form:label>
		</h5>	
		<h5>
	      	<form:label path="ing9">Ingredient: 
			<form:errors path="ing9"/>
			<form:input path="ing9"/></form:label>
			<form:label path="qty9">Quantity: 
			<form:errors path="qty9"/>
			<form:input path="qty9"/></form:label>
			<form:label path="mm9">Unit of Measure: 
			<form:errors path="mm9"/>
			<form:input path="mm9"/></form:label>
		</h5>	
		<h5>
	      	<form:label path="ing0">Ingredient: 
			<form:errors path="ing0"/>
			<form:input path="ing0"/></form:label>
			<form:label path="qty0">Quantity: 
			<form:errors path="qty0"/>
			<form:input path="qty0"/></form:label>
			<form:label path="mm0">Unit of Measure: 
			<form:errors path="mm0"/>
			<form:input path="mm0"/></form:label>
		</h5>	
      	<h5>
	      	<form:label path="step1">Step: 
			<form:errors path="step1"/>
			<form:input path="step1"/></form:label>
		</h5>
		<h5>
	      	<form:label path="step2">Step: 
			<form:errors path="step2"/>
			<form:input path="step2"/></form:label>
		</h5>
      	<h5>
	      	<form:label path="step3">Step: 
			<form:errors path="step3"/>
			<form:input path="step3"/></form:label>
		</h5>
      	<h5>
	      	<form:label path="step4">Step: 
			<form:errors path="step4"/>
			<form:input path="step4"/></form:label>
		</h5>
      	<h5>
	      	<form:label path="step5">Step: 
			<form:errors path="step5"/>
			<form:input path="step5"/></form:label>
		</h5>
      	<h5>
	      	<form:label path="step6">Step: 
			<form:errors path="step6"/>
			<form:input path="step6"/></form:label>
		</h5>
      	<h5>
	      	<form:label path="step7">Step: 
			<form:errors path="step7"/>
			<form:input path="step7"/></form:label>
		</h5>
      	<h5>
	      	<form:label path="step8">Step: 
			<form:errors path="step8"/>
			<form:input path="step8"/></form:label>
		</h5>
      	<h5>
	      	<form:label path="step9">Step: 
			<form:errors path="step9"/>
			<form:input path="step9"/></form:label>
		</h5>
      	<h5>
	      	<form:label path="step0">Step: 
			<form:errors path="step0"/>
			<form:input path="step0"/></form:label>
		</h5>
  		<button type="submit">Submit</button>
	</form:form>
	</div>
</div>
</body>
</html>