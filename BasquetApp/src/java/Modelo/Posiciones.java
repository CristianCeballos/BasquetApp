/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author marx_
 */
public class Posiciones {
    
    private int id_equipo;
    private String logo;
    private int cantidad_partidos;
    private int ganados;
    private int perdidos;
    private int diferencia;

    public Posiciones(int id_equipo, String logo, int cantidad_partidos, int ganados, int perdidos, int diferencia) {
        this.id_equipo = id_equipo;
        this.logo = logo;
        this.cantidad_partidos = cantidad_partidos;
        this.ganados = ganados;
        this.perdidos = perdidos;
        this.diferencia = diferencia;
    }

    public Posiciones() {
    }

    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getCantidad_partidos() {
        return cantidad_partidos;
    }

    public void setCantidad_partidos(int cantidad_partidos) {
        this.cantidad_partidos = cantidad_partidos;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    @Override
    public String toString() {
        return "Posiciones{" + "id_equipo=" + id_equipo + ", logo=" + logo + ", cantidad_partidos=" + cantidad_partidos + ", ganados=" + ganados + ", perdidos=" + perdidos + ", diferencia=" + diferencia + '}';
    }
    
    
    
}
