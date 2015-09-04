/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estampate.corteI.DAO;

import com.estampate.corteI.hibernate.Artista;
import com.estampate.corteI.hibernate.Comprador;
import com.estampate.corteI.hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author AndresV
 */
public class guardarRegistroDAO {

  Session session = null;

  public guardarRegistroDAO() {
    this.session = HibernateUtil.getSessionFactory().getCurrentSession();
  }

  public void guardar(String nombre, String apellido, String direccion, String cedula, String celular, String usuario, String password, String tipo) {
    session.beginTransaction();
    if (tipo.equals("C")) {
      Comprador com = new Comprador();
      com.setNombre(nombre);
      com.setApellido(apellido);
      com.setDireccion(direccion);
      com.setCedula(cedula);
      com.setCelular(celular);
      com.setUsuario(usuario);
      com.setPassword(password);
      //Guardar el comprador
      session.save(com);

      //Commit the transaction
      session.getTransaction().commit();
    } else if(tipo.equals("A")) {
      Artista art = new Artista();
      art.setNombre(nombre);
      art.setApellido(apellido);
      art.setDireccion(direccion);
      art.setCedula(cedula);
      art.setCelular(celular);
      art.setUsuario(usuario);
      art.setPassword(password);
      //Guardar el Artista
      session.save(art);
      //Commit the transaction
      session.getTransaction().commit();
    }

  }

}
