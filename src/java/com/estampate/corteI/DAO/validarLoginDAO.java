/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estampate.corteI.DAO;

import com.estampate.corteI.hibernate.Artista;
import com.estampate.corteI.hibernate.Comprador;
import com.estampate.corteI.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author AndresV
 */
public class validarLoginDAO {

  private Session session = null;
  private Transaction tx = null;

  public validarLoginDAO() {
    this.session = HibernateUtil.getSessionFactory().getCurrentSession();
  }

   /*
  BUSCO EL USUARIO QUE SE ESTA LOGEANDO Y LO DEVUELVO
  */
  public List<Artista> getArtista(String usario, String password) {
    List<Artista> misPersonas = new ArrayList<Artista>();
    try {
      tx = session.beginTransaction();
      String hql = "from Artista where usuario = :usuario AND password = :password";
      Query q = session.createQuery(hql);
      q.setParameter("usuario", usario);
      q.setParameter("password", password);
      misPersonas = (List<Artista>) q.list();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (session != null) {
       // session.close();
      }

    }
    return misPersonas;
  }
  /*
  BUSCO EL COMPRADOR QUE SE ESTA LOGEANDO Y LO DEVUELVO
  */
  public List<Comprador> getComprador(String usario, String password) {
    List<Comprador> misPersonas = new ArrayList();
    try {
      tx = session.beginTransaction();
      String hql = "from Artista where usuario = :usuario AND password = :password";
      Query q = session.createQuery(hql);
      q.setParameter("usuario", usario);
      q.setParameter("password", password);
      misPersonas = (List<Comprador>) q.list();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (session != null) {
       // session.close();
      }

    }
    return misPersonas;
  }

  public boolean userRegistrado(String usario, String tabla) {
    List nombreUsuario = new ArrayList();
    try {
      this.tx = session.beginTransaction();
      String hql = "from " + tabla + " where usuario = :usuario ";
      Query q = this.session.createQuery(hql);
      q.setParameter("usuario", usario);
      nombreUsuario = q.list();
      this.tx.commit();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return nombreUsuario.size()>0;
  }

}
