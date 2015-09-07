/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estampate.corteI.servlet;

import com.estampate.corteI.DAO.datosGeneralesDAO;
import com.estampate.corteI.DAO.guardarRegistroDAO;
import com.estampate.corteI.hibernate.Artista;
import com.estampate.corteI.hibernate.EstampaCamiseta;
import com.estampate.corteI.hibernate.RatingEstampa;
import com.estampate.corteI.hibernate.TamanoEstampa;
import com.estampate.corteI.hibernate.TemaEstampa;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
@WebServlet(name = "guardarEstampa", urlPatterns = {"/guardarEstampa"})
public class guardarEstampa extends HttpServlet {

  private String dirUploadFiles;
  private boolean subioImagen;
  ArrayList<String> campos = new ArrayList<String>();


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
    out.print(campos.get(1));
//    out.print(subioImagen);
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
    String rutaImg = "NN";
    /*
     SUBIR LA IMAGEN AL SERVIDOR
     */
    dirUploadFiles = getServletContext().getRealPath(getServletContext().getInitParameter("dirUploadFiles"));
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
              String extension = nombre.substring(nombre.lastIndexOf("."));
              File archivo = new File(dirUploadFiles, nombre);
              item.write(archivo);
              if (archivo.exists()) {
                subioImagen = true;
                rutaImg = "estampas/"+nombre;
//                response.sendRedirect("uploadsave.jsp");
              } else {
                subioImagen = false;
              }
            }
          }else{
            campos.add(item.getString());
          }
        }
      } catch (FileUploadException e) {
        subioImagen = false;
      } catch (Exception e) {
        subioImagen = false;
      }
    }
    /*
     FIN DE SUBIR IMAGEN
     */
    String nombreImg = campos.get(1);
    EstampaCamiseta estampa = new EstampaCamiseta();
    //estampa.setIdEstampaCamiseta(null);
    //TRAIGO EL ARTISTA PARA GUARDARLO EN LA ESTAMPA
    datosGeneralesDAO  artista = new datosGeneralesDAO();
    Artista artEstampa = artista.getArtista(Integer.parseInt(campos.get(0)));
    estampa.setArtista(artEstampa);
      //TRAIGO EL ARTISTA PARA GUARDARLO EN LA ESTAMPA
    datosGeneralesDAO  rating = new datosGeneralesDAO();
    RatingEstampa ratingEstampa = rating.getRating(1);
    estampa.setRatingEstampa(ratingEstampa);
    //TRAIGO EL TAMAÑO QUE ELIGIERON DE LA ESTAMPA
    datosGeneralesDAO  tamano = new datosGeneralesDAO();
    TamanoEstampa tamEstampa = tamano.getTamano(Integer.parseInt(campos.get(4)));
    estampa.setTamanoEstampa(tamEstampa);
    //TRAIGO EL TEMA QUE ELIGIERON DE LA ESTAMPA
    datosGeneralesDAO  tema = new datosGeneralesDAO();
    TemaEstampa temaEstampa = tema.getTema(Integer.parseInt(campos.get(2)));
    estampa.setTemaEstampa(temaEstampa);
    //ASIGNO EL NOMBRE DE LA ESTAMPA
    estampa.setDescripcion(nombreImg);
    //ASIGNO LA RUTA DE LA IMAGEN QUE CREO
    estampa.setImagenes(rutaImg);
    //ASIGNO LA UBICACION DE LA IMAGEN EN LA CAMISA
    estampa.setUbicacion(campos.get(5));
    //ASIGNO EL PRECIO DE LA IMAGEN QUE CREO
    estampa.setPrecio(campos.get(3));
    //ASIGNO EL ID DEL LUGAR 
    estampa.setIdLugarEstampa(Integer.parseInt(campos.get(5)));
    guardarRegistroDAO guardarEstampa = new guardarRegistroDAO();
    guardarEstampa.guardaEstampa(estampa);
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
