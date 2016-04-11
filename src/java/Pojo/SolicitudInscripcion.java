package Pojo;
// Generated 11/04/2016 15:34:25 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SolicitudInscripcion generated by hbm2java
 */
public class SolicitudInscripcion  implements java.io.Serializable {


     private int id;
     private Estudiante estudiante;
     private Promocion promocion;
     private Date fechaRealizacion;
     private Date fechaRevision;
     private Character estado;
     private Integer idUsuario;
     private String lugarEntrevista;
     private String observacion;
     private Date fechaEntrevista;
     private Set matriculas = new HashSet(0);
     private Set archivoses = new HashSet(0);

    public SolicitudInscripcion() {
    }

	
    public SolicitudInscripcion(int id, Estudiante estudiante, Promocion promocion) {
        this.id = id;
        this.estudiante = estudiante;
        this.promocion = promocion;
    }
    public SolicitudInscripcion(int id, Estudiante estudiante, Promocion promocion, Date fechaRealizacion, Date fechaRevision, Character estado, Integer idUsuario, String lugarEntrevista, String observacion, Date fechaEntrevista, Set matriculas, Set archivoses) {
       this.id = id;
       this.estudiante = estudiante;
       this.promocion = promocion;
       this.fechaRealizacion = fechaRealizacion;
       this.fechaRevision = fechaRevision;
       this.estado = estado;
       this.idUsuario = idUsuario;
       this.lugarEntrevista = lugarEntrevista;
       this.observacion = observacion;
       this.fechaEntrevista = fechaEntrevista;
       this.matriculas = matriculas;
       this.archivoses = archivoses;
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
    public Promocion getPromocion() {
        return this.promocion;
    }
    
    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }
    public Date getFechaRealizacion() {
        return this.fechaRealizacion;
    }
    
    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
    public Date getFechaRevision() {
        return this.fechaRevision;
    }
    
    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
    }
    public Character getEstado() {
        return this.estado;
    }
    
    public void setEstado(Character estado) {
        this.estado = estado;
    }
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getLugarEntrevista() {
        return this.lugarEntrevista;
    }
    
    public void setLugarEntrevista(String lugarEntrevista) {
        this.lugarEntrevista = lugarEntrevista;
    }
    public String getObservacion() {
        return this.observacion;
    }
    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    public Date getFechaEntrevista() {
        return this.fechaEntrevista;
    }
    
    public void setFechaEntrevista(Date fechaEntrevista) {
        this.fechaEntrevista = fechaEntrevista;
    }
    public Set getMatriculas() {
        return this.matriculas;
    }
    
    public void setMatriculas(Set matriculas) {
        this.matriculas = matriculas;
    }
    public Set getArchivoses() {
        return this.archivoses;
    }
    
    public void setArchivoses(Set archivoses) {
        this.archivoses = archivoses;
    }




}


