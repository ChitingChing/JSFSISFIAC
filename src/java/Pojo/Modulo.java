package Pojo;
// Generated 29/02/2016 10:09:00 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Modulo generated by hbm2java
 */
public class Modulo  implements java.io.Serializable {


     private int id;
     private Promocion promocion;
     private Usuario usuario;
     private String descripcion;
     private Integer creditos;
     private Set asistencias = new HashSet(0);
     private Set notases = new HashSet(0);

    public Modulo() {
    }

	
    public Modulo(int id, Promocion promocion, Usuario usuario) {
        this.id = id;
        this.promocion = promocion;
        this.usuario = usuario;
    }
    public Modulo(int id, Promocion promocion, Usuario usuario, String descripcion, Integer creditos, Set asistencias, Set notases) {
       this.id = id;
       this.promocion = promocion;
       this.usuario = usuario;
       this.descripcion = descripcion;
       this.creditos = creditos;
       this.asistencias = asistencias;
       this.notases = notases;
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
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getCreditos() {
        return this.creditos;
    }
    
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
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




}


