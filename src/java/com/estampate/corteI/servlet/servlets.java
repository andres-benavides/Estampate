/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estampate.corteI.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.List;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author AndresV
 */
public class servlets extends HttpServlet {

  private String dirUploadFiles;

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
    dirUploadFiles = getServletContext().getRealPath(getServletContext().getInitParameter("dirUploadFiles"));
    HttpSession sesion = request.getSession(true);
    if (ServletFileUpload.isMultipartContent(request)) {
      FileItemFactory factory = new DiskFileItemFactory();
      ServletFileUpload upload = new ServletFileUpload(factory);
      upload.setSizeMax(new Long(getServletContext().getInitParameter("maxFileSize")).longValue());
      List listUploadFiles = null;
      FileItem item = null;
      try {
        listUploadFiles = upload.parseRequest(request);
        Iterator it = listUploadFiles.iterator();
        while (it.hasNext()) {
          item = (FileItem) it.next();
          if (!item.isFormField()) {
            if (item.getSize() > 0) {
              String nombre = item.getName();
              String tipo = item.getContentType();
              long tamanio = item.getSize();
              String extension = nombre.substring(nombre.lastIndexOf("."));

              sesion.setAttribute("sArNombre", String.valueOf(nombre));
              sesion.setAttribute("sArTipo", String.valueOf(tipo));
              sesion.setAttribute("sArExtension", String.valueOf(extension));

              File archivo = new File(dirUploadFiles, "nombreRequest"+extension);
              item.write(archivo);
              if (archivo.exists()) {
                response.sendRedirect("uploadsave.jsp");
              } else {
                sesion.setAttribute("sArError", "Ocurrio un error al subir el archiv o");
                response.sendRedirect("uploaderror.jsp");
              }
            }
          }
        }
      } catch (FileUploadException e) {
        sesion.setAttribute("sArError", String.valueOf(e.getMessage()));
        response.sendRedirect("uploaderror.jsp");
      } catch (Exception e) {
        sesion.setAttribute("sArError", String.valueOf(e.getMessage()));
        response.sendRedirect("uploaderror.jsp");
      }
    }
    out.close();

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
