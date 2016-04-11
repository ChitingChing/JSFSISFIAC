package Pojo;
// Generated 11/04/2016 15:34:25 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoUsuario generated by hbm2java
 */
public class TipoUsuario  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private Set usuarios = new HashSet(0);

    public TipoUsuario() {
    }

	
    public TipoUsuario(int id) {
        this.id = id;
    }
    public TipoUsuario(int id, String descripcion, Set usuarios) {
       this.id = id;
       this.descripcion = descripcion;
       this.usuarios = usuarios;
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
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


