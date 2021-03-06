package Pojo;
// Generated 16-may-2016 9:34:07 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Acta generated by hbm2java
 */
public class Acta  implements java.io.Serializable {


     private int id;
     private String descripcion;
     private Maestria maestria;
     private TipoActa tipoActa;
     private String numeracion;
     private Set sustentacions = new HashSet(0);

    public Acta() {
    }

	
    public Acta(int id) {
        this.id = id;
    }
    public Acta(int id, Maestria maestria, TipoActa tipoActa,String descripcion, String numeracion, Set sustentacions) {
       this.id = id;
       this.maestria = maestria;
       this.tipoActa = tipoActa;
       this.numeracion = numeracion;
       this.sustentacions = sustentacions;
       this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Maestria getMaestria() {
        return this.maestria;
    }
    
    public void setMaestria(Maestria maestria) {
        this.maestria = maestria;
    }
    public TipoActa getTipoActa() {
        return this.tipoActa;
    }
    
    public void setTipoActa(TipoActa tipoActa) {
        this.tipoActa = tipoActa;
    }
    public String getNumeracion() {
        return this.numeracion;
    }
    
    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }
    public Set getSustentacions() {
        return this.sustentacions;
    }
    
    public void setSustentacions(Set sustentacions) {
        this.sustentacions = sustentacions;
    }




}


