/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estampate.corteI.DAO;

import com.estampate.corteI.hibernate.Artista;
import com.estampate.corteI.hibernate.Comprador;
import com.estampate.corteI.hibernate.EstampaCamiseta;
import com.estampate.corteI.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author AndresV
 */
public class guardarRegistroDAO {

  private Session session = null;
  private Transaction tx = null;

  public guardarRegistroDAO() {
    this.session = HibernateUtil.getSessionFactory().getCurrentSession();
  }

  public void guardar(String nombre, String apellido, String direccion, String cedula, String celular, String usuario, String password, String tipo) {
    try {
      this.tx = this.session.beginTransaction();
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
        this.session.save(com);
        //Commit the transaction
        this.session.getTransaction().commit();

      } else if (tipo.equals("A")) {
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
    } catch (RuntimeException e) {
      try {
        tx.rollback();
      } catch (RuntimeException rbe) {
        //log.error("Couldn’t roll back transaction", rbe);
      }
      throw e;
    } 
  }

  public void guardaEstampa(EstampaCamiseta estampa) {
    this.tx = this.session.beginTransaction();
    //Guardar la estampa
    this.session.save(estampa);
    //Commit the transaction
    this.session.getTransaction().commit();
  }

}
