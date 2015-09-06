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
    <script type="text/javascript" src="../js/libs/jquery.js"></script>
    <script type="text/javascript" src="../js/funciones.js"></script>
    <link rel="stylesheet" href="../js/libs/bootstrap-3.3.5-dist/css/bootstrap.min.css" />
    <title>Estampate!!!!</title>
    <style type="text/css">
      li:hover{
        background:#81F7D8;
        border-left-style:  solid;
        border-right-style:  solid;
        border-left-width: 1px;
        border-right-width: 1px;
      }
    </style>
  </head>
  <body>
    <nav class="navbar navbar-default">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">Estampate</a>
        </div>
        <div class="collapse navbar-collapse" >
          <button type="button" class="btn btn-default navbar-btn" id="btnSession">Volver</button>
          <button type="button" class="btn btn-default navbar-btn" id="btnSession">Cerrar Sesion</button>
        </div>
      </div>
    </nav>
    <!--FORMULARIO DE REGISTRO-->
    <div class="container-fluid" id="registro" >
      <div class="row">
        <div class="col-xs-4"></div>
        <div class="col-xs-4">
          <div class="row">
            <div class="col-xs-4"><button type="button" class="btn btn-default navbar-btn" id="btnSession">Ver Catalogo</button></div>
            <div class="col-xs-4"><button type="button" class="btn btn-default navbar-btn" id="btnSession">Subir nuevo diseño</button></div>
            <div class="col-xs-4"><button type="button" class="btn btn-default navbar-btn" id="btnSession">Administrar Diseños</button></div>
          </div>
        </div>
        <div class="col-xs-4"></div>
      </div>
    </div>
  </body>
</html>
