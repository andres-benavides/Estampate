/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estampate.corteI.servlet;

import com.estampate.corteI.DAO.datosGeneralesDAO;
import com.estampate.corteI.DAO.guardarRegistroDAO;
import com.estampate.corteI.DAO.validarLoginDAO;
import com.estampate.corteI.hibernate.Artista;
import com.estampate.corteI.hibernate.Comprador;
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
@WebServlet(name = "guardarRegistro", urlPatterns = {"/guardarRegistro"})
public class guardarRegistro extends HttpServlet {

  private boolean registrado = false;

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
      /* SI EL USUARIO YA ESSTA REGISTRADO DEVUELVO "registrado" SI EL REGISTRO SE HIZO 
       *  CORRECTAMENTE DEVUELVO "ok"
       */
      if (request.getParameter("modifica") == null) {
        if (!registrado) {
          request.setAttribute("resultado", "ok");
          request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
          request.setAttribute("resultado", "registrado");
          request.getRequestDispatcher("index.jsp").forward(request, response);
        }
      }else if (request.getParameter("modifica") != null) {
        response.sendRedirect("artista/modificarPerfil.jsp");
      }
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
    //RESIBO EL TIPO PARA SABER SI ES REGISTRO DE ARTISTA "A" O DE COMPRADOR "C"
    String tipo = request.getParameter("tipo");
    //HAGO EL REQUEST DE LOS CAMPOS DEL FORMULARIO
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String direccion = request.getParameter("direccion");
    String cedula = (request.getParameter("cedula"));
    String celular = (request.getParameter("celular"));
    String usuario = request.getParameter("usuario");
    String password = request.getParameter("password");

    //CREO EL DAO QUE ME VALIDA SI EL USUARIO YA ESTA REGISTRADO
    if (request.getParameter("modifica") == null) {
      validarLoginDAO validaUser = new validarLoginDAO();
      if (tipo.equals("C")) {
        registrado = validaUser.userRegistrado(usuario, "Comprador");
      } else if (tipo.equals("A")) {
        registrado = validaUser.userRegistrado(usuario, "Artista");
      }
      //CREO EL DAO PARA GUARDAR UN USUARIO O UN ARTISTA SEGUN EL "tipo"
      guardarRegistroDAO registro = new guardarRegistroDAO();
      //SI EL USUARIO NO ESTA REGISTRADO GUARDO EL REGISTRO
      if (!registrado) {
        registro.guardar(nombre, apellido, direccion, cedula, celular, usuario, password, tipo);
      }
    } else if (request.getParameter("modifica").equals("S")) {
      guardarRegistroDAO registro = new guardarRegistroDAO();
      if (tipo.equals("A")) {
        //Artista artista = new Artista();
        datosGeneralesDAO infoUser = new datosGeneralesDAO();
        int id = Integer.parseInt(request.getParameter("id"));
        Artista artista = infoUser.getArtista(id);
        artista.setNombre(nombre);
        artista.setApellido(apellido);
        artista.setDireccion(direccion);
        artista.setCedula(cedula);
        artista.setCelular(celular);
        artista.setUsuario(usuario);
        artista.setPassword(password);
        registro.actualizaArtista(artista);
      } else if (tipo.equals("C")) {
        Comprador comprador = new Comprador(nombre, apellido, direccion, cedula, celular, usuario, password, null);
        registro.actualizaComprador(comprador);
      }
    }
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
