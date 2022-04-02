<%@page import="java.util.*,com.java.entity.*" %>
List Of All Services With Cost : -
<table border=1>
<tr><td>Service Name</td><td>Service Address</td><td>Service Phone No.</td><td>Service Email</td></tr>
<%

List<SalonPojo> list = (List<SalonPojo>)request.getAttribute("allsalon"); 

for(SalonPojo sp : list ){
	
%>

<tr><td><%=sp.getSal_name() %></td><td><%=sp.getSal_address()%></td><td><%=sp.getSal_phone()%></td><td><%=sp.getSal_email()%></td></tr>

<% }//end of for %>
</table>