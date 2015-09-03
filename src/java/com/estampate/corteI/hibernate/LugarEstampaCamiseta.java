package com.estampate.corteI.hibernate;
// Generated 2/09/2015 08:09:47 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * LugarEstampaCamiseta generated by hbm2java
 */
public class LugarEstampaCamiseta  implements java.io.Serializable {


     private Integer idLugarEstampaCamiseta;
     private String especificacionLugar;
     private Set<Camiseta> camisetas = new HashSet<Camiseta>(0);
     private Set<FacturaDetalle> facturaDetalles = new HashSet<FacturaDetalle>(0);

    public LugarEstampaCamiseta() {
    }

	
    public LugarEstampaCamiseta(String especificacionLugar) {
        this.especificacionLugar = especificacionLugar;
    }
    public LugarEstampaCamiseta(String especificacionLugar, Set<Camiseta> camisetas, Set<FacturaDetalle> facturaDetalles) {
       this.especificacionLugar = especificacionLugar;
       this.camisetas = camisetas;
       this.facturaDetalles = facturaDetalles;
    }
   
    public Integer getIdLugarEstampaCamiseta() {
        return this.idLugarEstampaCamiseta;
    }
    
    public void setIdLugarEstampaCamiseta(Integer idLugarEstampaCamiseta) {
        this.idLugarEstampaCamiseta = idLugarEstampaCamiseta;
    }
    public String getEspecificacionLugar() {
        return this.especificacionLugar;
    }
    
    public void setEspecificacionLugar(String especificacionLugar) {
        this.especificacionLugar = especificacionLugar;
    }
    public Set<Camiseta> getCamisetas() {
        return this.camisetas;
    }
    
    public void setCamisetas(Set<Camiseta> camisetas) {
        this.camisetas = camisetas;
    }
    public Set<FacturaDetalle> getFacturaDetalles() {
        return this.facturaDetalles;
    }
    
    public void setFacturaDetalles(Set<FacturaDetalle> facturaDetalles) {
        this.facturaDetalles = facturaDetalles;
    }




}


