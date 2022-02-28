<html>
    <body>
        <form action="insertService" method="post">
        <h1>Add Service</h1>  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="id" /></td>
         </tr> 
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Cost :</td>  
          <td><form:input path="salary" /></td>
         </tr> 
         <tr>  
          <td>Time :</td>  
          <td><form:input path="designation" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Add Save" /></td>  
         </tr>  
        </table>  
        </form>
    </body>
</html>