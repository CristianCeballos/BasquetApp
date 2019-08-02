/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

import Controlador.Operaciones;
import Modelo.Equipo;
import Modelo.Partido;
import Modelo.PartidoString;
import Modelo.PartidosVer;
import Modelo.Posiciones;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marx_
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Operaciones o = new Operaciones();

        ArrayList<PartidoString> partidos = o.listaPartidos();
           int contador=0;
           for (PartidoString partido : partidos) {
            contador++;
               System.out.println(partido.toString());
        }
   

        ArrayList<Equipo> eq = o.listaEquipos();
        Equipo[] equipos = new Equipo[9];

        for (Equipo equipo : eq) {
            int nro = equipo.getId_equipo() - 1;
            equipos[nro] = (Equipo) equipo;
        }


        Posiciones[] pos = new Posiciones[9];
        for (int i = 0; i < pos.length; i++) {
            pos[i] = new Posiciones(0, "", 0, 0, 0, 0);
        }
        
     
        

        for (PartidoString partido : partidos) {

            int parJugados = 0;
            int ganados = 0;
            int perdidos = 0;
            int puntosFavor = 0;
            int puntosContra = 0;

            for (int i = 0; i < contador; i++) {

                if (partido.getEquipoLocal() == equipos[i].getId_equipo()) {
                    pos[i].setId_equipo(equipos[i].getId_equipo());
                    pos[i].setLogo(equipos[i].getLogo());
                    parJugados++;
                    pos[i].setCantidad_partidos(parJugados);

                    if (partido.getPuntosLocal() > partido.getPuntosVisitate()) {
                        ganados++;
                        pos[i].setGanados(ganados);
                        puntosFavor += partido.getPuntosLocal();
                    } else if (partido.getPuntosLocal() < partido.getPuntosVisitate()) {
                        perdidos++;
                        pos[i].setPerdidos(perdidos);
                        puntosContra += partido.getPuntosVisitate();
                    }
                }

                if (partido.getEquipoVisitante() == equipos[i].getId_equipo()) {
                    pos[i].setId_equipo(equipos[i].getId_equipo());
                    pos[i].setLogo(equipos[i].getLogo());
                    parJugados++;
                    pos[i].setCantidad_partidos(parJugados);

                    if (partido.getPuntosLocal() < partido.getPuntosVisitate()) {
                        ganados++;
                        pos[i].setGanados(ganados);
                        puntosFavor += partido.getPuntosLocal();
                    } else if (partido.getPuntosLocal() > partido.getPuntosVisitate()) {
                        perdidos++;
                        pos[i].setPerdidos(perdidos);
                        puntosContra += partido.getPuntosVisitate();
                    }
                    
                   
                }
                 
            }
            
            
        }
        
        for (Posiciones po : pos) {
            System.out.println(po.toString());
        }
        
        System.out.println(contador);
        
        

        
        
        
    }
    
}
