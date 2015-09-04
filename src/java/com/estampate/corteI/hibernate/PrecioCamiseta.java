package com.estampate.corteI.hibernate;
// Generated 3/09/2015 11:13:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PrecioCamiseta generated by hbm2java
 */
public class PrecioCamiseta  implements java.io.Serializable {


     private Integer idPrecioCamiseta;
     private String precio;
     private Set<FacturaDetalle> facturaDetalles = new HashSet<FacturaDetalle>(0);
     private Set<Camiseta> camisetas = new HashSet<Camiseta>(0);

    public PrecioCamiseta() {
    }

	
    public PrecioCamiseta(String precio) {
        this.precio = precio;
    }
    public PrecioCamiseta(String precio, Set<FacturaDetalle> facturaDetalles, Set<Camiseta> camisetas) {
       this.precio = precio;
       this.facturaDetalles = facturaDetalles;
       this.camisetas = camisetas;
    }
   
    public Integer getIdPrecioCamiseta() {
        return this.idPrecioCamiseta;
    }
    
    public void setIdPrecioCamiseta(Integer idPrecioCamiseta) {
        this.idPrecioCamiseta = idPrecioCamiseta;
    }
    public String getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(String precio) {
        this.precio = precio;
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


