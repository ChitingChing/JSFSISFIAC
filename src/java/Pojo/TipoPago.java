package Pojo;
// Generated 11/04/2016 15:34:25 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoPago generated by hbm2java
 */
public class TipoPago  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private Set pagos = new HashSet(0);

    public TipoPago() {
    }

	
    public TipoPago(int id) {
        this.id = id;
    }
    public TipoPago(int id, String descripcion, Set pagos) {
       this.id = id;
       this.descripcion = descripcion;
       this.pagos = pagos;
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
    public Set getPagos() {
        return this.pagos;
    }
    
    public void setPagos(Set pagos) {
        this.pagos = pagos;
    }




}


