/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.estampate.corteI.DAO;

import com.estampate.corteI.hibernate.Artista;
import com.estampate.corteI.hibernate.ColorCamiseta;
import com.estampate.corteI.hibernate.Comprador;
import com.estampate.corteI.hibernate.EstampaCamiseta;
import com.estampate.corteI.hibernate.HibernateUtil;
import com.estampate.corteI.hibernate.LugarEstampaCamiseta;
import com.estampate.corteI.hibernate.MaterialCamiseta;
import com.estampate.corteI.hibernate.RatingEstampa;
import com.estampate.corteI.hibernate.TallaCamiseta;
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
   BUSCO LOS LUGARAES DE LAS ESTAMPAS Y DEVUELVO UN ARRAY
   */

  public List<ColorCamiseta> getColores() {
    List<ColorCamiseta> colores = new ArrayList<ColorCamiseta>();
    try {
      tx = session.beginTransaction();
      String hql = "from ColorCamiseta";
      Query q = session.createQuery(hql);
      colores = (List<ColorCamiseta>) q.list();
      this.session.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return colores;
  }
      /*
   BUSCO LOS LUGARAES DE LAS ESTAMPAS Y DEVUELVO UN ARRAY
   */

  public List<TallaCamiseta> getTalla() {
    List<TallaCamiseta> talla = new ArrayList<TallaCamiseta>();
    try {
      tx = session.beginTransaction();
      String hql = "from TallaCamiseta";
      Query q = session.createQuery(hql);
      talla = (List<TallaCamiseta>) q.list();
      this.session.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return talla;
  }
  /*
  
  */
   public List<MaterialCamiseta> getMaterial() {
    List<MaterialCamiseta> material = new ArrayList<MaterialCamiseta>();
    try {
      tx = session.beginTransaction();
      String hql = "from MaterialCamiseta";
      Query q = session.createQuery(hql);
      material = (List<MaterialCamiseta>) q.list();
      this.session.getTransaction().commit();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return material;
  }
  /*
   BUSCO UN ARTISTA POR ID Y LO RETORNO
   */

  public Artista getArtista(int idArtista) {
    Artista artista = new Artista();
    tx = session.beginTransaction();
    String msg = "";
    try {
      String hql = "from Artista a where a.idArtista = :idArtista";
      Query q = session.createQuery(hql);
      q.setInteger("idArtista", idArtista);
       artista = (Artista)q.uniqueResult();
      if (!tx.wasCommitted())
        tx.commit();

    } catch (Exception e) {
      msg = e.getMessage();
      e.printStackTrace();
    }
    return artista;
  }
  
   /*
   BUSCO UN COMPRADOR POR ID Y LO RETORNO
   */

  public Comprador getComprador(int idComprador) {
    Comprador comprador = new Comprador();
    tx = session.beginTransaction();
    String msg = "";
    try {
      String hql = "from Comprador c where c.idCliente = :idCliente";
      Query q = session.createQuery(hql);
      q.setInteger("idCliente", idComprador);
       comprador = (Comprador)q.uniqueResult();
      if (!tx.wasCommitted())
        tx.commit();

    } catch (Exception e) {
      msg = e.getMessage();
      e.printStackTrace();
    }
    return comprador;
  }
  /*
   BUSCO UN LUGAR POR ID Y LO RETORNO
   */

  public LugarEstampaCamiseta getLugar(int id) {
    LugarEstampaCamiseta lugar = new LugarEstampaCamiseta();
    try {
      tx = session.beginTransaction();
      String hql = "from LugarEstampaCamiseta l where l.idLugarEstampaCamiseta = :id";
      Query q = session.createQuery(hql);
      q.setParameter("id", id);
      lugar = (LugarEstampaCamiseta) q.uniqueResult();
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
      String hql = "from TamanoEstampa t where t.idTamanoEstampa = :id";
      Query q = session.createQuery(hql);
      q.setParameter("id", id);
      tamano = (TamanoEstampa) q.uniqueResult();
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
      String hql = "from TemaEstampa e where e.idTemaEstampa = :id";
      Query q = session.createQuery(hql);
      q.setParameter("id", id);
      tema = (TemaEstampa) q.uniqueResult();
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
      String hql = "from RatingEstampa r where r.idRatingEstampa = :id";
      Query q = session.createQuery(hql);
      q.setParameter("id", id);
      rating = (RatingEstampa) q.uniqueResult();
      if (!tx.wasCommitted())
        tx.commit();

    } catch (Exception e) {
      e.printStackTrace();
    }
    return rating;
  }
  /*
  BUSCO LAS ESTAMPAS DE UN ARTISTA
  */
  public List<EstampaCamiseta> getEstampas(Artista idArtista) {
    List<EstampaCamiseta> estampas = new ArrayList<EstampaCamiseta>();
    try {
      tx = session.beginTransaction();
      String hql = "from EstampaCamiseta es where es.artista = :artista";
      Query q = session.createQuery(hql);
      q.setParameter("artista", idArtista);
      estampas = (List<EstampaCamiseta>) q.list();
      if (!tx.wasCommitted())
        tx.commit();
    } catch (Exception e) {
      e.printStackTrace();
      //System.out.println(e.getMessage());
    }
    return estampas;
  }
  /*
  TRAER LA ESTAMPAS ORDENADAS POR UN PARAMETRO
  */
  public List<EstampaCamiseta> getEstampasXTema() {
    List<EstampaCamiseta> estampas = new ArrayList<EstampaCamiseta>();
    try {
      tx = session.beginTransaction();
      String hql = "from EstampaCamiseta es ORDER BY es.temaEstampa ";
      Query q = session.createQuery(hql);
      estampas = (List<EstampaCamiseta>) q.list();
      if (!tx.wasCommitted())
        tx.commit();
    } catch (Exception e) {
      e.printStackTrace();
      //System.out.println(e.getMessage());
    }
    return estampas;
  }
  
}
