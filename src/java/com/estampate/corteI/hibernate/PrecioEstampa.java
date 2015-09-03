package com.estampate.corteI.hibernate;
// Generated 2/09/2015 08:09:47 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PrecioEstampa generated by hbm2java
 */
public class PrecioEstampa  implements java.io.Serializable {


     private Integer idPrecioEstampa;
     private int precio;
     private Set<TamanoEstampa> tamanoEstampas = new HashSet<TamanoEstampa>(0);
     private Set<FacturaDetalle> facturaDetalles = new HashSet<FacturaDetalle>(0);

    public PrecioEstampa() {
    }

	
    public PrecioEstampa(int precio) {
        this.precio = precio;
    }
    public PrecioEstampa(int precio, Set<TamanoEstampa> tamanoEstampas, Set<FacturaDetalle> facturaDetalles) {
       this.precio = precio;
       this.tamanoEstampas = tamanoEstampas;
       this.facturaDetalles = facturaDetalles;
    }
   
    public Integer getIdPrecioEstampa() {
        return this.idPrecioEstampa;
    }
    
    public void setIdPrecioEstampa(Integer idPrecioEstampa) {
        this.idPrecioEstampa = idPrecioEstampa;
    }
    public int getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Set<TamanoEstampa> getTamanoEstampas() {
        return this.tamanoEstampas;
    }
    
    public void setTamanoEstampas(Set<TamanoEstampa> tamanoEstampas) {
        this.tamanoEstampas = tamanoEstampas;
    }
    public Set<FacturaDetalle> getFacturaDetalles() {
        return this.facturaDetalles;
    }
    
    public void setFacturaDetalles(Set<FacturaDetalle> facturaDetalles) {
        this.facturaDetalles = facturaDetalles;
    }




}

