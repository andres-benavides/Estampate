/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estampate.corteI.servlet;

import com.estampate.corteI.DAO.validarLoginDAO;
import com.estampate.corteI.hibernate.Artista;
import com.estampate.corteI.hibernate.Comprador;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author AndresV
 */
@WebServlet(name = "LogIn", urlPatterns = {"/LogIn"})
public class LogIn extends HttpServlet {

  private boolean ingresoArtista = false;
  private boolean ingresoComprad = false;
  List<Artista> artista = new ArrayList<Artista>();
  List<Comprador> comprador = new ArrayList();
  

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
      HttpSession objSesion = request.getSession(true); 
      /*
       SI ingreso ES VERDADERO ES POR QUE LOS DATOS ESTAN BIEN ENTONCES DA LA BIENVENIDA SI NO ERROR EN LOS DATOS
       */

      /*
       LE DOY EL NOMBRE "resultado" Y EL VALOR DEL STRING respuesta A UNA VARIABLE QUE VOY A PODER USAR EN EL .jsp QUE VOY A CARGAR
       */
     // request.setAttribute("resultado", artista);
      /*
       POR ULTIMO LLAMO EL NUEVO .jsp PARA MOSTRAR LOS RESULTADOS DEL SERVLET. EL NUEVO .jsp QUE VOY A CARGAR SE LLAMA INICIO.
       TAMBIEN LE ENVÍON LA VARIBLE resultado QUE ACABO DE CREAR
       */
      //request.getRequestDispatcher("inicio.jsp").forward(request, response);
      //out.println("<h1>El nombre que ingreo es: Hago for</h1>");

      if (ingresoArtista) {
        if (artista.size() > 0) {
          for (Artista ar : artista) {
            int idUser = ar.getIdArtista(); //aqui tu identificador de usuario
            String idString = Integer.toString(idUser);
            objSesion.setAttribute("idUsuaio", idString );
            response.sendRedirect("artista/index.jsp");
          }
        } else {
          out.println("<h1>Usuario no registrado</h1>");
        }
      } else if (ingresoComprad) {
        if (comprador.size() > 0) {
          for (Comprador ar : comprador) {
            request.getRequestDispatcher("comprador/index.jsp").forward(request, response);
            out.println("<h1> Bienvenido Comprador: " + ar.getUsuario() + "</h1>");
          }
        } else {
          out.println("<h1>Usuario no registrado</h1>");
        }
      }

      out.println("</body>");
      out.println("</html>");
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
    String tipo = request.getParameter("tipo");
    String user = request.getParameter("user");
    String passwrd = request.getParameter("passwrd");
    validarLoginDAO valid = new validarLoginDAO();
    if (tipo.equals("C")) {
      ingresoComprad = true;
      comprador = valid.getComprador(user, passwrd);
    } else if (tipo.equals("A")) {
      ingresoArtista = true;
      artista = valid.getArtista(user, passwrd);
    }
    /*
     ACA LE DIGO QUE SI EL CAMPO USUARIO DEL FORMULARIO ES IGUAL A ADMIN Y EL CAMPO PASSWRD ES IGUAL A 123 LA VARIABLE
     ingreso VA HACER VERDADERA
     */
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
