<%-- 
    Document   : index
    Created on : 27/08/2015, 11:10:50 PM
    Author     : AndresV
--%>
<%@page import="com.estampate.corteI.hibernate.Artista"%>
<%@page import="com.estampate.corteI.DAO.datosGeneralesDAO"%>
<%
  HttpSession objSesion = request.getSession(false);
  String usuario = (String) (objSesion.getAttribute("idUsuaio"));
  int idArtista = Integer.parseInt(usuario);
  datosGeneralesDAO infoUser = new datosGeneralesDAO();
  Artista ar = infoUser.getArtista(idArtista);
  out.print( ar.getNombre()+" "+idArtista);
//  for(Artista pe:ar){
//    
//  }
%>
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
  </head>
  <body>
    <nav class="navbar navbar-default">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">Estampate</a>
        </div>
        <div class="collapse navbar-collapse" >
          <button type="button" class="btn btn-default navbar-btn" id="btnSession">Cerrar Sesion</button>
        </div>
      </div>
    </nav>
    <!--FORMULARIO DE REGISTRO-->
    <div class="container-fluid" id="registro" >
      <div class="row">
        <div class="col-lg-6 col-ms-6 col-xs-6">
          <form class="form-horizontal" action="guardarRegistro" method="post" role="form"  >
            <div class="form-group">
              <label class="col-lg-2 control-label"  class="col-lg-2 control-label" for="nombre">Nombre:</label>
              <div class="col-lg-7">
                <input type="hidden" name="tipo" value="A" />
                <input type="text" name="nombre" id="nombre" value="<% out.print(ar.getNombre());%>" class="form-control" />
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="apellido">Apellido:</label>
              <div class="col-lg-7">
                <input type="text" name="apellido" id="apellido" value="<% out.print(ar.getApellido());%>" class="form-control" />
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="direccion">Direccion:</label>
              <div class="col-lg-7">
                <input type="text" name="direccion" id="direccion" class="form-control" />
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="cedula">Cedula:</label>
              <div class="col-lg-7">
                <input type="number" name="cedula" id="cedula" class="form-control" />
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="celular">Celular:</label>
              <div class="col-lg-7">
                <input type="number" name="celular" id="celular" class="form-control" />
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="usuario">Usuario:</label>
              <div class="col-lg-7">
                <input type="text" name="usuario" id="usuario" class="form-control" />
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="password">Contraseña:</label>
              <div class="col-lg-7">
                <input type="password" name="password" id="password" class="form-control" />
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
