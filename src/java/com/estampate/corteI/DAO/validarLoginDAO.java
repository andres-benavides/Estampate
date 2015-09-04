/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estampate.corteI.DAO;

import com.estampate.corteI.hibernate.Artista;
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

  Session session = null;
  Transaction tx = null;

  public validarLoginDAO() {
    this.session = HibernateUtil.getSessionFactory().getCurrentSession();
  }

  public List<Artista> getArtista(String usario,String password) {
    List<Artista> misPersonas = new ArrayList<Artista>();
//    try {
//      
//    } catch (Exception e) {
//      e.printStackTrace();
//      misPersonas.add(null);
//    }
    tx = session.beginTransaction();
      String hql = "from artista where usuario = 'perro'";
      Query q = session.createQuery(hql);
//      q.setParameter("usuario",usario);
//      q.setParameter("password",password);
      misPersonas=q.list();
    return misPersonas;
  }

}
