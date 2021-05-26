<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Etudiant Registration</title>
</head>
<body>
 <div align="center">
  <h1>Etudiant Register Form</h1>
  <form action="EtudiantServlet" method="post">
   <table style="with: 80%">
    <tr>
     <td>First Name</td>
     <td><input type="text" name="Nom" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="Prenom" /></td>
    </tr>
    <tr>
     <td>UserName</td>
     <td><input type="text" name="Email" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="Password" /></td>
    </tr>
    <tr>
     <td>Address</td>
     <td><input type="text" name="Contact" /></td>
    </tr>
    <tr>
     <td>Contact</td>
     <td><input type="text" name="Address" /></td>
    </tr>
    <tr><td></td><td><input type="submit" value="register" /></td></tr>
   </table>
  </form>
  <p>Etudiant registré aveb succée</p>
  <h1>Etudiant Login Form</h1>
  <form action="LoginServlet" method="post">
   <table style="with: 80%">
    <tr>
     <td> Username </td>
     <td><input type="text" name="Username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="Password" /></td>
    </tr>
    
    <tr><td></td><td><input type="submit" value="register" /></td></tr>
   </table>
  </form>
 </div>
</body>
</html>