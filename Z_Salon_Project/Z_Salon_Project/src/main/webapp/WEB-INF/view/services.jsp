<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>login</title>
    <%@page import="java.util.*,com.java.entity.*" %>
    <script
      src="https://kit.fontawesome.com/b6b9586b26.js"
      crossorigin="anonymous"
    ></script>
   <link rel="stylesheet" href="signin.css" />


   <style>
      table, th, td {
  border: 1px solid white;
  border-radius: 2px;
}
th, td {
  background-color: #96D4D4;
}
   </style>

  </head>
  <body>
<table border=1>
<tr><td>Service Name</td><td>Service Cost</td></tr>
<%

List<ServicesPojo> list = (List<ServicesPojo>)request.getAttribute("services"); 

for(ServicesPojo be : list ){
	
%>

<tr><td><%=be.getService_name() %></td><td><%=be.getService_cost() %></td></tr> 
    

<% }//end of for %>
</table>
    </body>
</html>