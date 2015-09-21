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

  Session session = null;
  Transaction tx = null;

  public guardarRegistroDAO() {
    session = HibernateUtil.getSessionFactory().getCurrentSession();
  }

  public void guardar(Comprador comprador,Artista artista,String tipo) {
    try {
      this.tx = this.session.beginTransaction();
      if (tipo.equals("C")) {
        //Guardar el comprador
        this.session.save(comprador);
        //Commit the transaction
        this.session.getTransaction().commit();
        if (!tx.wasCommitted()) {
          tx.commit();
        }
      } else if (tipo.equals("A")) {
        session.save(artista);
        //Commit the transaction
        session.getTransaction().commit();
        if (!tx.wasCommitted()) {
          tx.commit();
        }
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
  /*
   GUARDO UNA ESTAMPA
   */

  public void guardaEstampa(EstampaCamiseta estampa) {

    session = HibernateUtil.getSessionFactory().getCurrentSession();
    tx = session.beginTransaction();
    //Guardar la estampa
    this.session.save(estampa);
    //Commit the transaction
    this.session.getTransaction().commit();
  }

  /*
   ACTUALIZAR PERFIL DE ARTISTA
   */
  public void actualizaArtista(Artista artista) {
    session = HibernateUtil.getSessionFactory().getCurrentSession();
    tx = session.beginTransaction();
    //Guardar la estampa
    this.session.update(artista);
    //Commit the transaction
    this.session.getTransaction().commit();
  }
   /*
   ACTUALIZAR PERFIL DE COMPRADOR
   */
  public void actualizaComprador(Comprador comprador) {
    session = HibernateUtil.getSessionFactory().getCurrentSession();
    tx = session.beginTransaction();
    //Guardar la estampa
    this.session.update(comprador);
    //Commit the transaction
    this.session.getTransaction().commit();
  }

}
