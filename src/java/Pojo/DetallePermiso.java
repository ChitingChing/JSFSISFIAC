package Pojo;
// Generated 29/02/2016 10:09:00 by Hibernate Tools 4.3.1



/**
 * DetallePermiso generated by hbm2java
 */
public class DetallePermiso  implements java.io.Serializable {


     private int id;
     private Permiso permiso;
     private Usuario usuario;
     private Character estado;

    public DetallePermiso() {
    }

	
    public DetallePermiso(int id) {
        this.id = id;
    }
    public DetallePermiso(int id, Permiso permiso, Usuario usuario, Character estado) {
       this.id = id;
       this.permiso = permiso;
       this.usuario = usuario;
       this.estado = estado;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Permiso getPermiso() {
        return this.permiso;
    }
    
    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Character getEstado() {
        return this.estado;
    }
    
    public void setEstado(Character estado) {
        this.estado = estado;
    }




}


