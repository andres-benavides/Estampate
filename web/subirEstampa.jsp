<%-- 
    Document   : subirEstampa
    Created on : 1/09/2015, 11:34:57 PM
    Author     : AndresV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!--LLAMO LOS SCRIPT DE JS QUE NECESITO EN ESTE CASO FUNCIONES Y LA LIBRERIA DE JQUERY-->
    <script type="text/javascript" src="js/libs/jquery.js"></script>
    <script type="text/javascript" src="js/funciones.js"></script>
    <link rel="stylesheet" href="js/libs/bootstrap-3.3.5-dist/css/bootstrap.min.css" />
    <title>Estampate!!!!</title>
  </head>
  <body>
    <nav class="navbar navbar-default">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="index.jsp">Estampate</a>
        </div>
        <div class="collapse navbar-collapse" >
          <button type="button" class="btn btn-warning navbar-btn" id="btnSession">Subir Estampa</button>
        </div>
      </div>
    </nav>

    <form action="guardarEstampa" method="post" enctype="multipart/form-data"> 
      <input type="file" name="file"/> 
      <br /> 
      <input type="submit" value="Subir archivo" /> 
    </form> 
  </body>
</html>
