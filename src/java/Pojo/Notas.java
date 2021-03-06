package Pojo;
// Generated 16-may-2016 9:34:07 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Notas generated by hbm2java
 */
public class Notas  implements java.io.Serializable {


     private int id;
     private Matricula matricula;
     private Modulo modulo;
     private BigDecimal nota;
     private String observacion;
     private Character estado;
     private String notaTexto;
     private Date fecha;
     private String usuario;
     private String responsable;

    public Notas() {
    }

	
    public Notas(int id, Matricula matricula, Modulo modulo) {
        this.id = id;
        this.matricula = matricula;
        this.modulo = modulo;
    }
    public Notas(int id, Matricula matricula, Modulo modulo, BigDecimal nota, String observacion, Character estado, String notaTexto, Date fecha, String usuario, String responsable) {
       this.id = id;
       this.matricula = matricula;
       this.modulo = modulo;
       this.nota = nota;
       this.observacion = observacion;
       this.estado = estado;
       this.notaTexto = notaTexto;
       this.fecha = fecha;
       this.usuario = usuario;
       this.responsable = responsable;
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
    public Modulo getModulo() {
        return this.modulo;
    }
    
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    public BigDecimal getNota() {
        return this.nota;
    }
    
    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public Character getEstado() {
        return this.estado;
    }
    
    public void setEstado(Character estado) {
        this.estado = estado;
    }
    public String getNotaTexto() {
        return this.notaTexto;
    }
    
    public void setNotaTexto(String notaTexto) {
        this.notaTexto = notaTexto;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getResponsable() {
        return this.responsable;
    }
    
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }




}


