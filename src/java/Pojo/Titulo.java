package Pojo;
// Generated 11/04/2016 15:34:25 by Hibernate Tools 4.3.1



/**
 * Titulo generated by hbm2java
 */
public class Titulo  implements java.io.Serializable {


     private int id;
     private Universidad universidad;
     private String descripcion;
     private String NSenecyt;

    public Titulo() {
    }

	
    public Titulo(int id, Universidad universidad) {
        this.id = id;
        this.universidad = universidad;
    }
    public Titulo(int id, Universidad universidad, String descripcion, String NSenecyt) {
       this.id = id;
       this.universidad = universidad;
       this.descripcion = descripcion;
       this.NSenecyt = NSenecyt;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Universidad getUniversidad() {
        return this.universidad;
    }
    
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNSenecyt() {
        return this.NSenecyt;
    }
    
    public void setNSenecyt(String NSenecyt) {
        this.NSenecyt = NSenecyt;
    }




}


