<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    

<h1>Laptops List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Color</th><th>Price</th><th>Edit</th><th>Delete</th></tr>  
<c:forEach var="lap" items="${listlap}">   
<tr>  
<td>${lap.id}</td>  
<td>${lap.name}</td>  
<td>${lap.color}</td>  
<td>${lap.price}</td>  
<td><a href="editlap/${lap.id}">Edit</a></td>  
<td><a href="deletelap/${lap.id}">Delete</a></td>  
</tr>  
</c:forEach>  
</table>  
<br/>  
<a href="lapform">Add New Laptop</a>  