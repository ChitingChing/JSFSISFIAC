package Pojo;
// Generated 11/04/2016 15:34:25 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Maestria generated by hbm2java
 */
public class Maestria  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private Character estado;
     private Set tesises = new HashSet(0);
     private Set promocions = new HashSet(0);

    public Maestria() {
    }

	
    public Maestria(int id) {
        this.id = id;
    }
    public Maestria(int id, String descripcion, Character estado, Set tesises, Set promocions) {
       this.id = id;
       this.descripcion = descripcion;
       this.estado = estado;
       this.tesises = tesises;
       this.promocions = promocions;
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
    public Set getTesises() {
        return this.tesises;
    }
    
    public void setTesises(Set tesises) {
        this.tesises = tesises;
    }
    public Set getPromocions() {
        return this.promocions;
    }
    
    public void setPromocions(Set promocions) {
        this.promocions = promocions;
    }




}


