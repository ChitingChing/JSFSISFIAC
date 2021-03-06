package Pojo;
// Generated 16-may-2016 9:34:07 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Sustentacion generated by hbm2java
 */
public class Sustentacion  implements java.io.Serializable {


     private int id;
     private Acta acta;
     private Proyecto proyecto;
     private Date fecha;
     private BigDecimal nota;
     private Set tribunals = new HashSet(0);

    public Sustentacion() {
    }

	
    public Sustentacion(int id) {
        this.id = id;
    }
    public Sustentacion(int id, Acta acta, Proyecto proyecto, Date fecha, BigDecimal nota, Set tribunals) {
       this.id = id;
       this.acta = acta;
       this.proyecto = proyecto;
       this.fecha = fecha;
       this.nota = nota;
       this.tribunals = tribunals;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Acta getActa() {
        return this.acta;
    }
    
    public void setActa(Acta acta) {
        this.acta = acta;
    }
    public Proyecto getProyecto() {
        return this.proyecto;
    }
    
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public BigDecimal getNota() {
        return this.nota;
    }
    
    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }
    public Set getTribunals() {
        return this.tribunals;
    }
    
    public void setTribunals(Set tribunals) {
        this.tribunals = tribunals;
    }




}


