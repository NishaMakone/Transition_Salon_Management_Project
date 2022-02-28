<%@page import="java.util.*,com.java.entity.*" %>
List Of All Services With Cost : -
<table border=1>
<tr><td>Service Name</td><td>Service Cost</td></tr>
<%

List<ServicesPojo> list = (List<ServicesPojo>)request.getAttribute("allservices"); 

for(ServicesPojo be : list ){
	
%>

<tr><td><%=be.getService_name() %></td><td><%=be.getService_cost() %></td></tr>

<% }//end of for %>
</table>