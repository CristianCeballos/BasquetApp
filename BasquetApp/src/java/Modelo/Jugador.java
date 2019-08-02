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
public class Jugador {
        private int id_jugador;
        private String nombre;
        private int equipo;

    public Jugador(int id_jugador, String nombre, int equipo) {
        this.id_jugador = id_jugador;
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public Jugador() {
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
        this.id_jugador = id_jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEquipo() {
        return equipo;
    }

    public void setEquipo(int equipo) {
        this.equipo = equipo;
    }
       
    
        
}
