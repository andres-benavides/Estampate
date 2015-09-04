package com.estampate.corteI.hibernate;
// Generated 3/09/2015 11:13:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TallaCamiseta generated by hbm2java
 */
public class TallaCamiseta  implements java.io.Serializable {


     private Integer idTalla;
     private String talla;
     private Set<FacturaDetalle> facturaDetalles = new HashSet<FacturaDetalle>(0);
     private Set<Camiseta> camisetas = new HashSet<Camiseta>(0);

    public TallaCamiseta() {
    }

	
    public TallaCamiseta(String talla) {
        this.talla = talla;
    }
    public TallaCamiseta(String talla, Set<FacturaDetalle> facturaDetalles, Set<Camiseta> camisetas) {
       this.talla = talla;
       this.facturaDetalles = facturaDetalles;
       this.camisetas = camisetas;
    }
   
    public Integer getIdTalla() {
        return this.idTalla;
    }
    
    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }
    public String getTalla() {
        return this.talla;
    }
    
    public void setTalla(String talla) {
        this.talla = talla;
    }
    public Set<FacturaDetalle> getFacturaDetalles() {
        return this.facturaDetalles;
    }
    
    public void setFacturaDetalles(Set<FacturaDetalle> facturaDetalles) {
        this.facturaDetalles = facturaDetalles;
    }
    public Set<Camiseta> getCamisetas() {
        return this.camisetas;
    }
    
    public void setCamisetas(Set<Camiseta> camisetas) {
        this.camisetas = camisetas;
    }




}


