package Pojo;
// Generated 29/02/2016 10:09:00 by Hibernate Tools 4.3.1



/**
 * PalabrasClave generated by hbm2java
 */
public class PalabrasClave  implements java.io.Serializable {


     private int id;
     private Tesis tesis;
     private String descripcion;

    public PalabrasClave() {
    }

	
    public PalabrasClave(int id, Tesis tesis) {
        this.id = id;
        this.tesis = tesis;
    }
    public PalabrasClave(int id, Tesis tesis, String descripcion) {
       this.id = id;
       this.tesis = tesis;
       this.descripcion = descripcion;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Tesis getTesis() {
        return this.tesis;
    }
    
    public void setTesis(Tesis tesis) {
        this.tesis = tesis;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


