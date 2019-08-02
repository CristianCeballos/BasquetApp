/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author marx_
 */
public class PartidoString {
    private int id_partido;
    private int equipoLocal;
    private int puntosLocal;
    private int equipoVisitante;
    private int puntosVisitate;
    private Date fecha;
    private String jugadorDelPartido;

    public PartidoString(int id_partido, int equipoLocal, int puntosLocal, int equipoVisitante, int puntosVisitate, Date fecha, String jugadorDelPartido) {
        this.id_partido = id_partido;
        this.equipoLocal = equipoLocal;
        this.puntosLocal = puntosLocal;
        this.equipoVisitante = equipoVisitante;
        this.puntosVisitate = puntosVisitate;
        this.fecha = fecha;
        this.jugadorDelPartido = jugadorDelPartido;
    }

    public PartidoString() {
    }

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public int getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(int equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public int getPuntosLocal() {
        return puntosLocal;
    }

    public void setPuntosLocal(int puntosLocal) {
        this.puntosLocal = puntosLocal;
    }

    public int getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(int equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getPuntosVisitate() {
        return puntosVisitate;
    }

    public void setPuntosVisitate(int puntosVisitate) {
        this.puntosVisitate = puntosVisitate;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getJugadorDelPartido() {
        return jugadorDelPartido;
    }

    public void setJugadorDelPartido(String jugadorDelPartido) {
        this.jugadorDelPartido = jugadorDelPartido;
    }

    @Override
    public String toString() {
        return "PartidoString{" + "id_partido=" + id_partido + ", equipoLocal=" + equipoLocal + ", puntosLocal=" + puntosLocal + ", equipoVisitante=" + equipoVisitante + ", puntosVisitate=" + puntosVisitate + ", fecha=" + fecha + ", jugadorDelPartido=" + jugadorDelPartido + '}';
    }
    
    
    
    
}
