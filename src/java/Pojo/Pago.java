package Pojo;
// Generated 16-may-2016 9:34:07 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Pago generated by hbm2java
 */
public class Pago  implements java.io.Serializable {


     private int id;
     private Matricula matricula;
     private TipoPago tipoPago;
     private BigDecimal valor;
     private Date fecha;
     private String idComprobante;
     private String rutaComprobante;
     private Character estado;

    public Pago() {
    }

	
    public Pago(int id, Matricula matricula, TipoPago tipoPago) {
        this.id = id;
        this.matricula = matricula;
        this.tipoPago = tipoPago;
    }
    public Pago(int id, Matricula matricula, TipoPago tipoPago, BigDecimal valor, Date fecha, String idComprobante, String rutaComprobante, Character estado) {
       this.id = id;
       this.matricula = matricula;
       this.tipoPago = tipoPago;
       this.valor = valor;
       this.fecha = fecha;
       this.idComprobante = idComprobante;
       this.rutaComprobante = rutaComprobante;
       this.estado = estado;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Matricula getMatricula() {
        return this.matricula;
    }
    
    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    public TipoPago getTipoPago() {
        return this.tipoPago;
    }
    
    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }
    public BigDecimal getValor() {
        return this.valor;
    }
    
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getIdComprobante() {
        return this.idComprobante;
    }
    
    public void setIdComprobante(String idComprobante) {
        this.idComprobante = idComprobante;
    }
    public String getRutaComprobante() {
        return this.rutaComprobante;
    }
    
    public void setRutaComprobante(String rutaComprobante) {
        this.rutaComprobante = rutaComprobante;
    }




}


