<%-- 
    Document   : index
    Created on : 27/08/2015, 11:10:50 PM
    Author     : AndresV
--%>

<%@page import="com.estampate.corteI.hibernate.MaterialCamiseta"%>
<%@page import="com.estampate.corteI.hibernate.TallaCamiseta"%>
<%@page import="com.estampate.corteI.hibernate.ColorCamiseta"%>
<%@page import="com.estampate.corteI.hibernate.Artista"%>
<%@page import="com.estampate.corteI.hibernate.EstampaCamiseta"%>
<%@page import="com.estampate.corteI.hibernate.LugarEstampaCamiseta"%>
<%@page import="com.estampate.corteI.hibernate.TamanoEstampa"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.estampate.corteI.hibernate.TemaEstampa"%>
<%@page import="java.util.List"%>
<%@page import="com.estampate.corteI.DAO.datosGeneralesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  HttpSession objSesion = request.getSession(false);
  String usuario = (String) (objSesion.getAttribute("idUsuaio"));
  //TRAIGO EL ARTISTA DEL QUE VOY A BUSCAR LAS ESTAMPAS
  int idArtista = Integer.parseInt(usuario);
  datosGeneralesDAO infoUser = new datosGeneralesDAO();
  Artista ar = infoUser.getArtista(idArtista);
  //BUSCO LAS ESTAMPAS
  datosGeneralesDAO color = new datosGeneralesDAO();
  List<ColorCamiseta> colores = new ArrayList<ColorCamiseta>();
  colores = color.getColores();

  //TALLAS
  datosGeneralesDAO talla = new datosGeneralesDAO();
  List<TallaCamiseta> tallas = new ArrayList<TallaCamiseta>();
  tallas = talla.getTalla();
  String deServlet = (String) objSesion.getAttribute("servlet");
  //MATERIAL
  datosGeneralesDAO material = new datosGeneralesDAO();
  List<MaterialCamiseta> materiales = new ArrayList<MaterialCamiseta>();
  materiales = material.getMaterial();
  //String deServlet = (String) objSesion.getAttribute("servlet");
//  boolean servlet;
//  servlet = deServlet != null;
//  if (servlet) {
//    out.println("<script>alert('Estampa Guardada con exito');</script>");
//    objSesion.setAttribute("servlet", null);
//  }
%>
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
      img{
        margin: 5px 5px 5px 5px;
      }
      .contenedor{
        display: block;
        width: 181px;
        float: left;
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
          <a href="index.jsp"><button type="button" class="btn btn-primary navbar-btn" id="btnSession">Volver</button></a>
          <a href="../index.jsp"><button type="button" class="btn btn-primary navbar-btn" id="btnSession">Cerrar Sesion</button></a>
        </div>
      </div>
    </nav>
    <!--FORMULARIO DE REGISTRO-->
    <div class="container-fluid" id="registro" >
      <div class="row">
        <div class="col-xs-4"></div>
        <div class="col-xs-4"></div>
      </div>
      <div class="row">
        <div class="col xs 8" id="adminDisenio">

        </div>
        <div class="col xs 8" id="subirEstampa" style="display:block">
          <form class="form-horizontal" action="../guardarEstampa" method="post" role="form" enctype="multipart/form-data" >
            <div class="form-group">
              <div class="col-lg-4">
                <input type="hidden" value="<%out.print(usuario);%>" name="idArtista" />
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="temaEstampa">Color camisa :</label>
              <div class="col-lg-4">
                <select class="form-control" name="Color" required>
                  <%

                    for (ColorCamiseta clr : colores) {
                      out.println("<option value='" + clr.getIdColor() + "'>" + clr.getColor() + "</option>");
                    }
                  %>
                </select>
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="temaEstampa">Talla camisa :</label>
              <div class="col-lg-4">
                <select class="form-control" name="talla" required>
                  <%
                    for (TallaCamiseta tll : tallas) {
                      out.println("<option value='" + tll.getIdTalla() + "'>" + tll.getTalla() + "</option>");
                    }
                  %>
                </select>
              </div>
            </div>
            <div class="form-group">
              <label class="col-lg-2 control-label"  for="temaEstampa">Material camisa :</label>
              <div class="col-lg-4">
                <select class="form-control" name="Color" required>
                  <%
                    for (MaterialCamiseta mtr : materiales) {
                      out.println("<option value='" + mtr.getIdMaterial() + "'>" + mtr.getMaterial() + "</option>");
                    }
                  %>
                </select>
              </div>
            </div>

        </div>


        <div class="form-group">
          <div class="col-lg-7">
            <button class="btn btn-success">Siguiente</button>
            <!--<input type="submit" name="Guardar" id="guardar" class="btn btn-success" />-->
          </div>
        </div>
        </form>
      </div>

    </div>
  </div>
</body>
</html>
