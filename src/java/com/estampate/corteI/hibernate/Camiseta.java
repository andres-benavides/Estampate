package com.estampate.corteI.hibernate;
// Generated 3/09/2015 11:13:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Camiseta generated by hbm2java
 */
public class Camiseta  implements java.io.Serializable {


     private Integer idCamiseta;
     private ColorCamiseta colorCamiseta;
     private EstampaCamiseta estampaCamiseta;
     private LugarEstampaCamiseta lugarEstampaCamiseta;
     private MaterialCamiseta materialCamiseta;
     private PrecioCamiseta precioCamiseta;
     private TallaCamiseta tallaCamiseta;
     private TextoCamiseta textoCamiseta;
     private int cantidad;
     private Set<FacturaDetalle> facturaDetalles = new HashSet<FacturaDetalle>(0);

    public Camiseta() {
    }

	
    public Camiseta(ColorCamiseta colorCamiseta, EstampaCamiseta estampaCamiseta, LugarEstampaCamiseta lugarEstampaCamiseta, MaterialCamiseta materialCamiseta, PrecioCamiseta precioCamiseta, TallaCamiseta tallaCamiseta, int cantidad) {
        this.colorCamiseta = colorCamiseta;
        this.estampaCamiseta = estampaCamiseta;
        this.lugarEstampaCamiseta = lugarEstampaCamiseta;
        this.materialCamiseta = materialCamiseta;
        this.precioCamiseta = precioCamiseta;
        this.tallaCamiseta = tallaCamiseta;
        this.cantidad = cantidad;
    }
    public Camiseta(ColorCamiseta colorCamiseta, EstampaCamiseta estampaCamiseta, LugarEstampaCamiseta lugarEstampaCamiseta, MaterialCamiseta materialCamiseta, PrecioCamiseta precioCamiseta, TallaCamiseta tallaCamiseta, TextoCamiseta textoCamiseta, int cantidad, Set<FacturaDetalle> facturaDetalles) {
       this.colorCamiseta = colorCamiseta;
       this.estampaCamiseta = estampaCamiseta;
       this.lugarEstampaCamiseta = lugarEstampaCamiseta;
       this.materialCamiseta = materialCamiseta;
       this.precioCamiseta = precioCamiseta;
       this.tallaCamiseta = tallaCamiseta;
       this.textoCamiseta = textoCamiseta;
       this.cantidad = cantidad;
       this.facturaDetalles = facturaDetalles;
    }
   
    public Integer getIdCamiseta() {
        return this.idCamiseta;
    }
    
    public void setIdCamiseta(Integer idCamiseta) {
        this.idCamiseta = idCamiseta;
    }
    public ColorCamiseta getColorCamiseta() {
        return this.colorCamiseta;
    }
    
    public void setColorCamiseta(ColorCamiseta colorCamiseta) {
        this.colorCamiseta = colorCamiseta;
    }
    public EstampaCamiseta getEstampaCamiseta() {
        return this.estampaCamiseta;
    }
    
    public void setEstampaCamiseta(EstampaCamiseta estampaCamiseta) {
        this.estampaCamiseta = estampaCamiseta;
    }
    public LugarEstampaCamiseta getLugarEstampaCamiseta() {
        return this.lugarEstampaCamiseta;
    }
    
    public void setLugarEstampaCamiseta(LugarEstampaCamiseta lugarEstampaCamiseta) {
        this.lugarEstampaCamiseta = lugarEstampaCamiseta;
    }
    public MaterialCamiseta getMaterialCamiseta() {
        return this.materialCamiseta;
    }
    
    public void setMaterialCamiseta(MaterialCamiseta materialCamiseta) {
        this.materialCamiseta = materialCamiseta;
    }
    public PrecioCamiseta getPrecioCamiseta() {
        return this.precioCamiseta;
    }
    
    public void setPrecioCamiseta(PrecioCamiseta precioCamiseta) {
        this.precioCamiseta = precioCamiseta;
    }
    public TallaCamiseta getTallaCamiseta() {
        return this.tallaCamiseta;
    }
    
    public void setTallaCamiseta(TallaCamiseta tallaCamiseta) {
        this.tallaCamiseta = tallaCamiseta;
    }
    public TextoCamiseta getTextoCamiseta() {
        return this.textoCamiseta;
    }
    
    public void setTextoCamiseta(TextoCamiseta textoCamiseta) {
        this.textoCamiseta = textoCamiseta;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public Set<FacturaDetalle> getFacturaDetalles() {
        return this.facturaDetalles;
    }
    
    public void setFacturaDetalles(Set<FacturaDetalle> facturaDetalles) {
        this.facturaDetalles = facturaDetalles;
    }




}


