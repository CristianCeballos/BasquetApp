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
public class Partido {
    
        private int id_equipoLocal; 
        private int puntosLocal; 
        private int id_equipoVisitante; 
        private int puntosVisitate; 
        private Date fecha; 
        private int id_jugadorDelPartido; 

    public Partido(int id_equipoLocal, int puntosLocal, int id_equipoVisitante, int puntosVisitate, Date fecha, int id_jugadorDelPartido) {
        this.id_equipoLocal = id_equipoLocal;
        this.puntosLocal = puntosLocal;
        this.id_equipoVisitante = id_equipoVisitante;
        this.puntosVisitate = puntosVisitate;
        this.fecha = fecha;
        this.id_jugadorDelPartido = id_jugadorDelPartido;
    }

    public Partido() {
    }

    public int getId_equipoLocal() {
        return id_equipoLocal;
    }

    public void setId_equipoLocal(int id_equipoLocal) {
        this.id_equipoLocal = id_equipoLocal;
    }

    public int getPuntosLocal() {
        return puntosLocal;
    }

    public void setPuntosLocal(int puntosLocal) {
        this.puntosLocal = puntosLocal;
    }

    public int getId_equipoVisitante() {
        return id_equipoVisitante;
    }

    public void setId_equipoVisitante(int id_equipoVisitante) {
        this.id_equipoVisitante = id_equipoVisitante;
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

    public int getId_jugadorDelPartido() {
        return id_jugadorDelPartido;
    }

    public void setId_jugadorDelPartido(int id_jugadorDelPartido) {
        this.id_jugadorDelPartido = id_jugadorDelPartido;
    }

    @Override
    public String toString() {
        return "Partido{" + "id_equipoLocal=" + id_equipoLocal + ", puntosLocal=" + puntosLocal + ", id_equipoVisitante=" + id_equipoVisitante + ", puntosVisitate=" + puntosVisitate + ", fecha=" + fecha + ", id_jugadorDelPartido=" + id_jugadorDelPartido + '}';
    }
    
    
        
        
}
