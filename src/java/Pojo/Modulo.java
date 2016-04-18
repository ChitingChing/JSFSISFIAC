package Pojo;
// Generated 11/04/2016 15:34:25 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Modulo generated by hbm2java
 */
public class Modulo  implements java.io.Serializable {


     private int id;
     private Promocion promocion;
     private Usuario usuario;
     private BigDecimal creditos;
     private String descripcion;
     private Set asistencias = new HashSet(0);
     private Set notases = new HashSet(0);
     private Date fechaInicio;
     private Date fechaFin;
     private String n_modulo;
     

    public Modulo() {
    }

	
    public Modulo(int id, Promocion promocion, Usuario usuario) {
        this.id = id;
        this.promocion = promocion;
        this.usuario = usuario;
    }
    public Modulo(int id, Promocion promocion, Usuario usuario, BigDecimal creditos, String descripcion, Set asistencias, Set notases, Date fechaInicio, Date fechaFin, String n_modulo) {
       this.id = id;
       this.promocion = promocion;
       this.usuario = usuario;
       this.creditos = creditos;
       this.descripcion = descripcion;
       this.asistencias = asistencias;
       this.notases = notases;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.n_modulo = n_modulo;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Promocion getPromocion() {
        return this.promocion;
    }
    
    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public BigDecimal getCreditos() {
        return this.creditos;
    }
    
    public void setCreditos(BigDecimal creditos) {
        this.creditos = creditos;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getAsistencias() {
        return this.asistencias;
    }
    
    public void setAsistencias(Set asistencias) {
        this.asistencias = asistencias;
    }
    public Set getNotases() {
        return this.notases;
    }
    
    public void setNotases(Set notases) {
        this.notases = notases;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getN_modulo() {
        return n_modulo;
    }

    public void setN_modulo(String n_modulo) {
        this.n_modulo = n_modulo;
    }
    



}


