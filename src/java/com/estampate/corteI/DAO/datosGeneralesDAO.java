/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estampate.corteI.DAO;

import com.estampate.corteI.hibernate.Artista;
import com.estampate.corteI.hibernate.HibernateUtil;
import com.estampate.corteI.hibernate.LugarEstampaCamiseta;
import com.estampate.corteI.hibernate.RatingEstampa;
import com.estampate.corteI.hibernate.TamanoEstampa;
import com.estampate.corteI.hibernate.TemaEstampa;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author AndresV
 */
public class datosGeneralesDAO {

   Session session = null;
   Transaction tx = null;

  public datosGeneralesDAO() {
    this.session = HibernateUtil.getSessionFactory().getCurrentSession();
  }
  /*
   BUSCO LOS TEMAS DE LAS ESTAMPAS Y DEVUELVO UN ARRAY
   */

  public List<TemaEstampa> getTemasEstampas() {
    List<TemaEstampa> temasEstampas = new ArrayList<TemaEstampa>();
    try {
      tx = session.beginTransaction();
      String hql = "from TemaEstampa";
      Query q = session.createQuery(hql);
      temasEstampas = (List<TemaEstampa>) q.list();
      this.session.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return temasEstampas;
  }
  /*
   BUSCO LOS TAMAÑOS DE LAS ESTAMPAS Y DEVUELVO UN ARRAY
   */

  public List<TamanoEstampa> getTamanios() {
    List<TamanoEstampa> tamanosEstampa = new ArrayList<TamanoEstampa>();
    try {
      tx = session.beginTransaction();
      String hql = "from TamanoEstampa";
      Query q = session.createQuery(hql);
      tamanosEstampa = (List<TamanoEstampa>) q.list();
      this.session.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return tamanosEstampa;
  }
  /*
   BUSCO LOS LUGARAES DE LAS ESTAMPAS Y DEVUELVO UN ARRAY
   */

  public List<LugarEstampaCamiseta> getLugares() {
    List<LugarEstampaCamiseta> lugaresEstampa = new ArrayList<LugarEstampaCamiseta>();
    try {
      tx = session.beginTransaction();
      String hql = "from LugarEstampaCamiseta";
      Query q = session.createQuery(hql);
      lugaresEstampa = (List<LugarEstampaCamiseta>) q.list();
      this.session.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return lugaresEstampa;
  }
  /*
   BUSCO UN ARTISTA POR ID Y LO RETORNO
   */

  public Artista getArtista(int idArtista) {
    Artista artista = new Artista();
    try {
      tx = session.beginTransaction();
      String hql = "from Artista where idArtista = :idArtista";
      Query q = session.createQuery(hql);
      q.setParameter("idArtista", idArtista);
      artista = (Artista) q.list();
      if (!tx.wasCommitted())
        tx.commit();

    } catch (Exception e) {
      e.printStackTrace();
    }
    return artista;
  }
  /*
   BUSCO UN LUGAR POR ID Y LO RETORNO
   */

  public LugarEstampaCamiseta getLugar(int id) {
    LugarEstampaCamiseta lugar = new LugarEstampaCamiseta();
    try {
      tx = session.beginTransaction();
      String hql = "from LugarEstampaCamiseta where idLugarEstampaCamiseta = :id";
      Query q = session.createQuery(hql);
      q.setParameter("id", id);
      lugar = (LugarEstampaCamiseta) q.list();
      if (!tx.wasCommitted())
        tx.commit();

    } catch (Exception e) {
      e.printStackTrace();
    }
    return lugar;
  }
  /*
   BUSCO UN TAMAÑO POR ID Y LO RETORNO
   */

  public TamanoEstampa getTamano(int id) {
    TamanoEstampa tamano = new TamanoEstampa();
    try {
      tx = session.beginTransaction();
      String hql = "from TamanoEstampa where idTamanoEstampa = :id";
      Query q = session.createQuery(hql);
      q.setParameter("id", id);
      tamano = (TamanoEstampa) q.list();
      if (!tx.wasCommitted())
        tx.commit();

    } catch (Exception e) {
      e.printStackTrace();
    }
    return tamano;
  }
  /*
   BUSCO UN TEMA POR ID Y LO RETORNO
   */

  public TemaEstampa getTema(int id) {
    TemaEstampa tema = new TemaEstampa();
    try {
      tx = session.beginTransaction();
      String hql = "from TemaEstampa where idTemaEstampa = :id";
      Query q = session.createQuery(hql);
      q.setParameter("id", id);
      tema = (TemaEstampa) q.list();
      if (!tx.wasCommitted())
        tx.commit();
 
    } catch (Exception e) {
      e.printStackTrace();
    }
    return tema;
  }
  /*
   BUSCO UN TEMA POR ID Y LO RETORNO
   */

  public RatingEstampa getRating(int id) {
    RatingEstampa rating = new RatingEstampa();
    try {
      tx = session.beginTransaction();
      String hql = "from RatingEstampa where idRatingEstampa = :id";
      Query q = session.createQuery(hql);
      q.setParameter("id", id);
      rating = (RatingEstampa) q.list();
      if (!tx.wasCommitted())
        tx.commit();

    } catch (Exception e) {
      e.printStackTrace();
    }
    return rating;
  }

}
