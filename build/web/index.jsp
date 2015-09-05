<%-- 
    Document   : index
    Created on : 27/08/2015, 11:10:50 PM
    Author     : AndresV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!--LLAMOloooo LOS SCRIPT DE JS QUE NECESITO EN ESTE CASO FUNCIONES Y LA LIBRERIA DE JQUERY-->
    <script type="text/javascript" src="js/libs/jquery.js"></script>
    <script type="text/javascript" src="js/funciones.js"></script>
    <link rel="stylesheet" href="js/libs/bootstrap-3.3.5-dist/css/bootstrap.min.css" />
    <title>Estampate!!!!</title>
    <style type="text/css">
      a{
        text-decoration: none;
        color: black;
      }
    </style>
    <%
      String resultado = (String) request.getAttribute("resultado");
      if (resultado == "ok") {
        out.println("<script>alert('Registro Guardado con exito');</script>");
      } else if (resultado == "registrado") {
        out.println("<script>alert('El nombre de usuario ya esta registrado');</script>");

      }
      //out.println(resultado);
    %>
  </head>
  <body>
    <nav class="navbar navbar-default">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">Bienvenido a Estampate</a>
        </div>
      </div>
    </nav>
    <div class="row">
      <div class="col-xs-4">
      </div>
      <div class="col-xs-4">
        <div class="row">
          <div class="col-xs-4">
            <a href="loginUser.jsp"><button class="btn btn-primary" >Comprador</button></a>
          </div>
          <div class="col-xs-4">
            <a href="loginArtis.jsp"> <button class="btn btn-default" >Artista</button></a>
          </div>
          <div class="col-xs-4">
            <a href="loginAdmin.jsp"> <button class="btn btn-danger" >Administrador</button></a>
          </div>
        </div>
      </div>
      <div class="col-xs-4">
      </div>
    </div>
  </body>
</html>
