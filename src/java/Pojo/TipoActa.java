package Pojo;
// Generated 16-may-2016 9:34:07 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoActa generated by hbm2java
 */
public class TipoActa  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private Character estado;
     private Set actas = new HashSet(0);

    public TipoActa() {
    }

	
    public TipoActa(int id) {
        this.id = id;
    }
    public TipoActa(int id, String descripcion, Character estado, Set actas) {
       this.id = id;
       this.descripcion = descripcion;
       this.estado = estado;
       this.actas = actas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Character getEstado() {
        return this.estado;
    }
    
    public void setEstado(Character estado) {
        this.estado = estado;
    }
    public Set getActas() {
        return this.actas;
    }
    
    public void setActas(Set actas) {
        this.actas = actas;
    }




}


