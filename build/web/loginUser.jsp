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
  </head>
  <body>
    <nav class="navbar navbar-default">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">Estampate</a>
        </div>
        <div class="collapse navbar-collapse" >
          <button type="button" class="btn btn-primary navbar-btn" id="btnSession">Iniciar Sesion</button>
          <button type="button" class="btn btn-primary navbar-btn btn-registro" >Registrarse</button>

          <!--FORMULARIO PARA INICIAR SESSION-->
          <div id="iniSession" style="display: none">
            <form class="navbar-form navbar-left" method="POST" action="LogIn" role="search" autocomplete="off">
              <div class="form-group">
                <input type="hidden" name="tipo" value="C" />
                <input type="text" class="form-control" name="user" placeholder="Usuario" required>
              </div>
              <div class="form-group">
                <input type="password" class="form-control" name="passwrd" placeholder="Contraseña" required>
              </div>
              <button type="submit" class="btn btn-success">Ingresar</button>
            </form>
          </div>
        </div>
      </div>
    </nav>
    <!--FORMULARIO DE REGISTRO-->
    <div class="container-fluid" id="registro" style="display: none" >
      <div class="row">
        <div class="col-lg-6 col-ms-6 col-xs-6">
          <form class="form-horizontal" id="registro" action="guardarRegistro" method="post" role="form"  >
            <div class="form-group">
              <label class="col-lg-2 control-label"  class="col-lg-2 control-label" for="nombre" >Nombre:</label>
              <div class="col-lg-7">
                <input type="hidden" name="tipo" value="C" />
                <input type="text" name="nombre" id="nombre" class="form-control" required />
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="apellido">Apellido:</label>
              <div class="col-lg-7">
                <input type="text" name="apellido" id="apellido" class="form-control" required />
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="direccion">Direccion:</label>
              <div class="col-lg-7">
                <input type="text" name="direccion" id="direccion" class="form-control" required />
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="cedula">Cedula:</label>
              <div class="col-lg-7">
                <input type="number" name="cedula" id="cedula" class="form-control" required min="1" max="9999999999"/>
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="celular">Celular:</label>
              <div class="col-lg-7">
                <input type="number" name="celular" id="celular" class="form-control" required min="1" max="9999999999"/>
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="usuario">Usuario:</label>
              <div class="col-lg-7">
                <input type="text" name="usuario" id="usuario" class="form-control" required />
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="password">Contraseña:</label>
              <div class="col-lg-7">
                <input type="password" name="password" id="password" class="form-control" required/>
              </div>
            </div>
            <div class="form-group">
              <div class="col-lg-7">
                <input type="submit" name="registrar" id="registrar" class="btn btn-success" />
              </div>
            </div>
          </form>
        </div>
      </div>
    </div>
  </body>
</html>
