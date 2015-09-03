package com.estampate.corteI.hibernate;
// Generated 2/09/2015 08:09:47 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * FacturaDetalle generated by hbm2java
 */
public class FacturaDetalle  implements java.io.Serializable {


     private Integer idFacturaDetalle;
     private Camiseta camiseta;
     private ColorCamiseta colorCamiseta;
     private EstampaCamiseta estampaCamiseta;
     private Factura factura;
     private FormaPago formaPago;
     private LugarEstampaCamiseta lugarEstampaCamiseta;
     private MaterialCamiseta materialCamiseta;
     private PrecioCamiseta precioCamiseta;
     private PrecioEstampa precioEstampa;
     private PrecioTexto precioTexto;
     private Stock stock;
     private TallaCamiseta tallaCamiseta;
     private TamanoEstampa tamanoEstampa;
     private TamanoTexto tamanoTexto;
     private TemaEstampa temaEstampa;
     private TextoCamiseta textoCamiseta;
     private String fecha;
     private int precioTotal;
     private Set<Factura> facturas = new HashSet<Factura>(0);

    public FacturaDetalle() {
    }

	
    public FacturaDetalle(Camiseta camiseta, ColorCamiseta colorCamiseta, EstampaCamiseta estampaCamiseta, Factura factura, FormaPago formaPago, LugarEstampaCamiseta lugarEstampaCamiseta, MaterialCamiseta materialCamiseta, PrecioCamiseta precioCamiseta, PrecioEstampa precioEstampa, PrecioTexto precioTexto, Stock stock, TallaCamiseta tallaCamiseta, TamanoEstampa tamanoEstampa, TamanoTexto tamanoTexto, TemaEstampa temaEstampa, TextoCamiseta textoCamiseta, String fecha, int precioTotal) {
        this.camiseta = camiseta;
        this.colorCamiseta = colorCamiseta;
        this.estampaCamiseta = estampaCamiseta;
        this.factura = factura;
        this.formaPago = formaPago;
        this.lugarEstampaCamiseta = lugarEstampaCamiseta;
        this.materialCamiseta = materialCamiseta;
        this.precioCamiseta = precioCamiseta;
        this.precioEstampa = precioEstampa;
        this.precioTexto = precioTexto;
        this.stock = stock;
        this.tallaCamiseta = tallaCamiseta;
        this.tamanoEstampa = tamanoEstampa;
        this.tamanoTexto = tamanoTexto;
        this.temaEstampa = temaEstampa;
        this.textoCamiseta = textoCamiseta;
        this.fecha = fecha;
        this.precioTotal = precioTotal;
    }
    public FacturaDetalle(Camiseta camiseta, ColorCamiseta colorCamiseta, EstampaCamiseta estampaCamiseta, Factura factura, FormaPago formaPago, LugarEstampaCamiseta lugarEstampaCamiseta, MaterialCamiseta materialCamiseta, PrecioCamiseta precioCamiseta, PrecioEstampa precioEstampa, PrecioTexto precioTexto, Stock stock, TallaCamiseta tallaCamiseta, TamanoEstampa tamanoEstampa, TamanoTexto tamanoTexto, TemaEstampa temaEstampa, TextoCamiseta textoCamiseta, String fecha, int precioTotal, Set<Factura> facturas) {
       this.camiseta = camiseta;
       this.colorCamiseta = colorCamiseta;
       this.estampaCamiseta = estampaCamiseta;
       this.factura = factura;
       this.formaPago = formaPago;
       this.lugarEstampaCamiseta = lugarEstampaCamiseta;
       this.materialCamiseta = materialCamiseta;
       this.precioCamiseta = precioCamiseta;
       this.precioEstampa = precioEstampa;
       this.precioTexto = precioTexto;
       this.stock = stock;
       this.tallaCamiseta = tallaCamiseta;
       this.tamanoEstampa = tamanoEstampa;
       this.tamanoTexto = tamanoTexto;
       this.temaEstampa = temaEstampa;
       this.textoCamiseta = textoCamiseta;
       this.fecha = fecha;
       this.precioTotal = precioTotal;
       this.facturas = facturas;
    }
   
    public Integer getIdFacturaDetalle() {
        return this.idFacturaDetalle;
    }
    
    public void setIdFacturaDetalle(Integer idFacturaDetalle) {
        this.idFacturaDetalle = idFacturaDetalle;
    }
    public Camiseta getCamiseta() {
        return this.camiseta;
    }
    
    public void setCamiseta(Camiseta camiseta) {
        this.camiseta = camiseta;
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
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public FormaPago getFormaPago() {
        return this.formaPago;
    }
    
    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
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
    public PrecioEstampa getPrecioEstampa() {
        return this.precioEstampa;
    }
    
    public void setPrecioEstampa(PrecioEstampa precioEstampa) {
        this.precioEstampa = precioEstampa;
    }
    public PrecioTexto getPrecioTexto() {
        return this.precioTexto;
    }
    
    public void setPrecioTexto(PrecioTexto precioTexto) {
        this.precioTexto = precioTexto;
    }
    public Stock getStock() {
        return this.stock;
    }
    
    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public TallaCamiseta getTallaCamiseta() {
        return this.tallaCamiseta;
    }
    
    public void setTallaCamiseta(TallaCamiseta tallaCamiseta) {
        this.tallaCamiseta = tallaCamiseta;
    }
    public TamanoEstampa getTamanoEstampa() {
        return this.tamanoEstampa;
    }
    
    public void setTamanoEstampa(TamanoEstampa tamanoEstampa) {
        this.tamanoEstampa = tamanoEstampa;
    }
    public TamanoTexto getTamanoTexto() {
        return this.tamanoTexto;
    }
    
    public void setTamanoTexto(TamanoTexto tamanoTexto) {
        this.tamanoTexto = tamanoTexto;
    }
    public TemaEstampa getTemaEstampa() {
        return this.temaEstampa;
    }
    
    public void setTemaEstampa(TemaEstampa temaEstampa) {
        this.temaEstampa = temaEstampa;
    }
    public TextoCamiseta getTextoCamiseta() {
        return this.textoCamiseta;
    }
    
    public void setTextoCamiseta(TextoCamiseta textoCamiseta) {
        this.textoCamiseta = textoCamiseta;
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
    public Set<Factura> getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set<Factura> facturas) {
        this.facturas = facturas;
    }




}


