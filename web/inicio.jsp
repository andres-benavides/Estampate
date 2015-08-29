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
          <button type="button" class="btn btn-primary navbar-btn" id="btnSession">Iniciar Secion</button>
          <!--FORMULARIO PARA INICIAR SESSION-->
          <div id="iniSession" style="display: none">
            <form class="navbar-form navbar-left" method="POST" action="LogIn" role="search">
              <div class="form-group">
                <input type="text" class="form-control" name="user" placeholder="Usuario">
              </div>
              <div class="form-group">
                <input type="password" class="form-control" name="passwrd" placeholder="Contraseña">
              </div>
              <button type="submit" class="btn btn-success">Ingresar</button>
            </form>
          </div>
        </div>
      </div>
    </nav>
    <div class="container-fluid">
      <div class="row">
        <h2>
          <!--RECIBO LA VARIABLE QUE TRAE EL SERVLET Y PARA PODER USAR JAVA EN EL .jsp USO LOS SIMBOLOS < %-->
          <%
            String resultado = (String) request.getAttribute("resultado");
            out.println(resultado);
          %>
        </h2>
      </div>
    </div>
  </body>
</html>
