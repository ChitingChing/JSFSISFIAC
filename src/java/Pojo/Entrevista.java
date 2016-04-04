package Pojo;
// Generated 29/02/2016 10:09:00 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Entrevista generated by hbm2java
 */
public class Entrevista  implements java.io.Serializable {


     private int id;
     private Estudiante estudiante;
     private String lugar;
     private Date fecha;
     private Date hora;
     private Character estado;
     private int idUsuario;

    public Entrevista() {
    }

	
    public Entrevista(int id, Estudiante estudiante, int idUsuario) {
        this.id = id;
        this.estudiante = estudiante;
        this.idUsuario = idUsuario;
    }
    public Entrevista(int id, Estudiante estudiante, String lugar, Date fecha, Date hora, Character estado, int idUsuario) {
       this.id = id;
       this.estudiante = estudiante;
       this.lugar = lugar;
       this.fecha = fecha;
       this.hora = hora;
       this.estado = estado;
       this.idUsuario = idUsuario;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Estudiante getEstudiante() {
        return this.estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getHora() {
        return this.hora;
    }
    
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public Character getEstado() {
        return this.estado;
    }
    
    public void setEstado(Character estado) {
        this.estado = estado;
    }
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }




}


