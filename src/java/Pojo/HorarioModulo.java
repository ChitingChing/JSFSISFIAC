package Pojo;
// Generated 16-may-2016 9:34:07 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * HorarioModulo generated by hbm2java
 */
public class HorarioModulo  implements java.io.Serializable {


     private int id;
     private Date horaInicio;
     private Date horaFin;
     private Date fecha;
     private Integer mes;
     private Character dia;
     private BigDecimal hora;
     private Modulo modulo;
     private Character estado;

    public HorarioModulo() {
    }

	
    public HorarioModulo(int id, Modulo modulo) {
        this.id = id;
        this.modulo = modulo;
    }
    public HorarioModulo(int id, Date horaInicio, Date horaFin, Date fecha, Integer mes, Character dia, BigDecimal hora, Modulo modulo, Character estado) {
       this.id = id;
       this.horaInicio = horaInicio;
       this.horaFin = horaFin;
       this.fecha = fecha;
       this.mes = mes;
       this.dia = dia;
       this.hora = hora;
       this.modulo = modulo;
       this.estado = estado;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Date getHoraInicio() {
        return this.horaInicio;
    }
    
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }
    public Date getHoraFin() {
        return this.horaFin;
    }
    
    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Integer getMes() {
        return this.mes;
    }
    
    public void setMes(Integer mes) {
        this.mes = mes;
    }
    public Character getDia() {
        return this.dia;
    }
    
    public void setDia(Character dia) {
        this.dia = dia;
    }
    public BigDecimal getHora() {
        return this.hora;
    }
    
    public void setHora(BigDecimal hora) {
        this.hora = hora;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }
    
}


