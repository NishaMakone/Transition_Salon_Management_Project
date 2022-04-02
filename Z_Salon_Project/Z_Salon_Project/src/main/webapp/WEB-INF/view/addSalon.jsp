<html>
    <body>
        <form action="insertService" method="post">
        <h1>Add Salon</h1>  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="id" /></td>
         </tr> 
         <tr>  
          <td>Salon Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Registeration Id.:  </td> 
          <td><form:input path="rid"  /></td>
         </tr>  
         <tr>  
          <td>Address : </td> 
          <td><form:input path="add"  /></td>
         </tr>  
         <tr>  
          <td>Contact No.:  </td> 
          <td><form:input path="phone"  /></td>
         </tr>  
         <tr>  
          <td>Email :</td>  
          <td><form:input path="email" /></td>
         </tr> 
         <tr>  
          <td>Username : </td> 
          <td><form:input path="uname"  /></td>
         </tr>  
         <tr>  
          <td>Password : </td> 
          <td><form:input path="pass"  /></td>
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