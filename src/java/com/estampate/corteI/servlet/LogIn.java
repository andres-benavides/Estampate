/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estampate.corteI.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AndresV
 */
@WebServlet(name = "LogIn", urlPatterns = {"/LogIn"})
public class LogIn extends HttpServlet {

  private boolean ingreso;
  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    try {
      /*
      CREO UNA VARIABLE STRING (respuesta) EN LA CUAL VOY A DEVOLVER UN VALOR AL .JSP QUE VOY A CARGAR PARA VERLO EN EL NAVEGADOR
      */
      String respuesta;
      /*
      SI ingreso ES VERDADERO ES POR QUE LOS DATOS ESTAN BIEN ENTONCES DA LA BIENVENIDA SI NO ERROR EN LOS DATOS
      */
      if(ingreso){
         respuesta = "Bienvenido Administrador";
      }else{
        respuesta = "Error en los datos de ingreso";
      }
      /*
      LE DOY EL NOMBRE "resultado" Y EL VALOR DEL STRING respuesta A UNA VARIABLE QUE VOY A PODER USAR EN EL .jsp QUE VOY A CARGAR
      */
      request.setAttribute("resultado", respuesta);
      /*
      POR ULTIMO LLAMO EL NUEVO .jsp PARA MOSTRAR LOS RESULTADOS DEL SERVLET. EL NUEVO .jsp QUE VOY A CARGAR SE LLAMA INICIO.
      TAMBIEN LE ENVÍON LA VARIBLE resultado QUE ACABO DE CREAR
      */
      request.getRequestDispatcher("inicio.jsp").forward(request, response);
    } finally {
      out.close();
    }
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    /*
    RECIBO LOS PARAMETROS QUE VIENEN DEL FORMULARIO PARA HACER LA VALIDACION
    */
    String user = request.getParameter("user");
    String passwrd = request.getParameter("passwrd");
    /*
    ACA LE DIGO QUE SI EL CAMPO USUARIO DEL FORMULARIO ES IGUAL A ADMIN Y EL CAMPO PASSWRD ES IGUAL A 123 LA VARIABLE
    ingreso VA HACER VERDADERA
    */
    ingreso = user.equals("admin") && passwrd.equals("123");
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
