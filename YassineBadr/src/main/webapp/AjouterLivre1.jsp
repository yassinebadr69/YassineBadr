<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter Livre</title>
</head>
<body>
 <div align="center">
  <h1>Ajouter Livre</h1>
  <form action="AjouterLivreServlet" method="post">
   <table style="with: 80%">
    <tr>
     <td> Categorie</td>
     <td><input type="text" name="Categorie" /></td>
    </tr>
    <tr>
     <td>Livre</td>
     <td><input type="text" name="Nom" /></td>
    </tr>
    <tr>
     <td>Auteur</td>
     <td><input type="text" name="Auteur" /></td>
    </tr>
    <tr><td></td><td><input type="submit" value="register" /></td></tr>
    <tr>
     <td><a href="http://localhost:8080/YassineBadr/Acceuil.jsp">PAGE D'ACCEUIL</a></td>
    </tr>
   </table> <h1>livre ajouter avec succée</h1>
   	
  </form>
 </div>
</body>
</html>