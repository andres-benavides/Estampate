package com.estampate.corteI.hibernate;
// Generated 2/09/2015 08:09:47 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TextoCamiseta generated by hbm2java
 */
public class TextoCamiseta  implements java.io.Serializable {


     private Integer idTextoCamiseta;
     private TamanoTexto tamanoTexto;
     private String descripcionTexto;
     private Set<Camiseta> camisetas = new HashSet<Camiseta>(0);
     private Set<FacturaDetalle> facturaDetalles = new HashSet<FacturaDetalle>(0);

    public TextoCamiseta() {
    }

	
    public TextoCamiseta(TamanoTexto tamanoTexto, String descripcionTexto) {
        this.tamanoTexto = tamanoTexto;
        this.descripcionTexto = descripcionTexto;
    }
    public TextoCamiseta(TamanoTexto tamanoTexto, String descripcionTexto, Set<Camiseta> camisetas, Set<FacturaDetalle> facturaDetalles) {
       this.tamanoTexto = tamanoTexto;
       this.descripcionTexto = descripcionTexto;
       this.camisetas = camisetas;
       this.facturaDetalles = facturaDetalles;
    }
   
    public Integer getIdTextoCamiseta() {
        return this.idTextoCamiseta;
    }
    
    public void setIdTextoCamiseta(Integer idTextoCamiseta) {
        this.idTextoCamiseta = idTextoCamiseta;
    }
    public TamanoTexto getTamanoTexto() {
        return this.tamanoTexto;
    }
    
    public void setTamanoTexto(TamanoTexto tamanoTexto) {
        this.tamanoTexto = tamanoTexto;
    }
    public String getDescripcionTexto() {
        return this.descripcionTexto;
    }
    
    public void setDescripcionTexto(String descripcionTexto) {
        this.descripcionTexto = descripcionTexto;
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

