<%@page import="java.util.*,com.java.entity.*" %>
List Of All Services With Cost : -
<table border=1>
<tr><td>Customer Name</td><td>Customer Pnone No.</td><td>Customer Email</td><td>Customer City</td></tr>
<%

List<CustomerPojo> list = (List<CustomerPojo>)request.getAttribute("allcust"); 

for(CustomerPojo cp : list ){
	
%>

<tr><td><%=cp.getCust_name() %></td><td><%=cp.getCust_phone()%></td><td><%=cp.getCust_email()%></td><td><%=cp.getCust_city()%></td></tr>

<% }//end of for %>
</table>