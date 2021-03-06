package com.vpr.practicaandroid;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conciertos")
public class Concierto {
	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
	@Column
    private String grupos;
	@Column
    private Date fecha;
	@Column
    private String hora;
	@Column
    private double latitud;
	@Column
	private double longitud;
	@Column
    private float precio;
	@Column
    private int asistido;
	@Column
    private int cancelado;


    //Metodos
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGrupos() {
        return grupos;
    }

    public void setGrupos(String grupos) {
        this.grupos = grupos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public double getLatitud() {
    	return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    
    public double getLongitud() {
    	return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public boolean isAsistido() {
        return asistido == 1?true:false;
    }

    public void setAsistido(boolean asistido) {
        this.asistido = asistido?1:0;
    }

    public boolean isCancelado() {
        return cancelado == 1?true:false;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado?1:0;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String toString(){
        return grupos;
    }
}
