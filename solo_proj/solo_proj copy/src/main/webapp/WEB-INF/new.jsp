<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	var regex = /^(.+?)(\d+)$/i;
	var cloneIndex = $(".clonedInput").length;
	function clone(){
	    $(this).parents(".clonedInput").clone()
	        .appendTo(".appendhere")
	        .attr("id", "clonedInput" +  cloneIndex)
	        .find("*")
	        .each(function() {
	            var id = this.id || "";
	            var match = id.match(regex) || [];
	            if (match.length == 3) {
	                this.id = match[1] + (cloneIndex);
	            }
	        })
	        .on('click', 'button.clone', clone)
	        .on('click', 'button.remove', remove);
	    cloneIndex++;
	}
	function remove(){
	    $(this).parents(".clonedInput").remove();
	}
	$("button.clone").on("click", clone);
	
	$("button.remove").on("click", remove);
</script>
<body>
<div class ="container">
	<div class="form-group">
		<form:form action="/recipes/new/post" method="POST" modelAttribute="recipe">
			<table>
			    <tr>
			      	<td>
				      	<form:label path="name"> Title: 
						<form:errors path="name"/>
						<form:input path="name"/></form:label>
					</td>
			    </tr>
<%-- 				<form:form action="/recipes/new" method="POST" mdoelAttribute="ingredient">
		    	<tr class="cloned input">
			    	<td>Ingredients: </td>
			      	<td>
				      	<form:label path="name">Name: 
						<form:errors path="name"/>
						<form:input path="name"/></form:label>
					</td>
					<td>
				      	<form:label path="amount">Amount
						<form:errors path="amount"/>
						<form:input path="amount"/></form:label>
					</td>
					<td>
				      	<form:label path="measurement">Measurement: 
						<form:errors path="measurement"/>
						<form:input path="measurement"/></form:label>
					</td>
				</tr> --%>
				<!-- <tr>
				<div class="appendhere">
				
				</div>
				</tr>
				<tr>
					<button class="add">Add Ingredient</button>
				    <button class="remove">Remove Ingredient</button>
				</tr> -->
<%-- 			</form:form> --%>
			    <tr>
<!-- 			      	<td>Directions:  </td> -->
			      	<td>
				      	<form:label path="directions">Directions: 
						<form:errors path="directions"/>
						<form:input path="directions"/></form:label>
					</td>
			    </tr>
			    <tr>
			      	<td></td>
			      	<td><button type="submit">Submit</button></td>
			    </tr>
		  	</table>
		</form:form>
	</div>
    
</div>
</body>

</html>