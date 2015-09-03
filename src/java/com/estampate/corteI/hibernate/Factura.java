package com.estampate.corteI.hibernate;
// Generated 2/09/2015 08:09:47 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Factura generated by hbm2java
 */
public class Factura  implements java.io.Serializable {


     private Integer idFactura;
     private Comprador comprador;
     private FacturaDetalle facturaDetalle;
     private FormaPago formaPago;
     private String fecha;
     private int precioTotal;
     private Set<FacturaDetalle> facturaDetalles = new HashSet<FacturaDetalle>(0);

    public Factura() {
    }

	
    public Factura(Comprador comprador, FacturaDetalle facturaDetalle, FormaPago formaPago, String fecha, int precioTotal) {
        this.comprador = comprador;
        this.facturaDetalle = facturaDetalle;
        this.formaPago = formaPago;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
    }
    public Factura(Comprador comprador, FacturaDetalle facturaDetalle, FormaPago formaPago, String fecha, int precioTotal, Set<FacturaDetalle> facturaDetalles) {
       this.comprador = comprador;
       this.facturaDetalle = facturaDetalle;
       this.formaPago = formaPago;
       this.fecha = fecha;
       this.precioTotal = precioTotal;
       this.facturaDetalles = facturaDetalles;
    }
   
    public Integer getIdFactura() {
        return this.idFactura;
    }
    
    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }
    public Comprador getComprador() {
        return this.comprador;
    }
    
    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }
    public FacturaDetalle getFacturaDetalle() {
        return this.facturaDetalle;
    }
    
    public void setFacturaDetalle(FacturaDetalle facturaDetalle) {
        this.facturaDetalle = facturaDetalle;
    }
    public FormaPago getFormaPago() {
        return this.formaPago;
    }
    
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }
    public String getFecha() {
        return this.fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public int getPrecioTotal() {
        return this.precioTotal;
    }
    
    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
    public Set<FacturaDetalle> getFacturaDetalles() {
        return this.facturaDetalles;
    }
    
    public void setFacturaDetalles(Set<FacturaDetalle> facturaDetalles) {
        this.facturaDetalles = facturaDetalles;
    }




}


