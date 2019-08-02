/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Equipo;
import Modelo.Jugador;
import Modelo.Partido;
import Modelo.PartidoString;
import Modelo.PartidosVer;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author marx_
 */
public class Operaciones {

    private Connection c;
//

    public ArrayList<Equipo> listaEquipos() {
        Equipo eq;
        ArrayList<Equipo> lista = new ArrayList<>();

        try {
            c = Conexion.getConexion();
            Statement st = c.createStatement();
            ResultSet result = st.executeQuery("select * from Equipos");

            while (result.next()) {
                int cod = result.getInt(1);
                String nom = result.getString(2);
                String ciudad = result.getString(3);
                String entrenador = "";
                String foto = result.getString(5);
                String logo = result.getString(6);

                eq = new Equipo(cod, nom, ciudad, entrenador, foto, logo);
                lista.add(eq);

            }

            c.close();

        } catch (Exception e) {
        }

        return lista;
    }
//

    public Equipo MostrarEquipo(int id) {

        Equipo eq = null;

        try {
            c = Conexion.getConexion();
            Statement st = c.createStatement();
            ResultSet result = st.executeQuery("exec DatosEquipo " + id);

            while (result.next()) {
                int cod = 0;
                String nom = result.getString(1);
                String ciudad = result.getString(2);
                String entrenador = "";
                String foto = result.getString(3);
                String logo = result.getString(4);

                eq = new Equipo(id, nom, ciudad, entrenador, foto, logo);

            }

            c.close();

        } catch (Exception e) {
        }

        return eq;
    }
//    

    public ArrayList<Jugador> MostrarJugadores(int id) {

        ArrayList<Jugador> salida = new ArrayList<>();
        Jugador jug = null;

        try {
            c = Conexion.getConexion();
            Statement st = c.createStatement();
            ResultSet result = st.executeQuery("exec JugadoresEquipo " + id);

            while (result.next()) {
                int cod = 0;
                String nom = result.getString(1);
                int equipo = 0;

                jug = new Jugador();
                jug.setNombre(nom);
                salida.add(jug);

            }
            c.close();

        } catch (Exception e) {
        }

        return salida;
    }

    public ArrayList<Jugador> listJugadores() {
        Jugador jug;
        ArrayList<Jugador> lista = new ArrayList<>();

        try {
            c = Conexion.getConexion();
            Statement st = c.createStatement();
            ResultSet result = st.executeQuery("select id_jugador, nombre from jugadores");

            while (result.next()) {
                int cod = result.getInt(1);
                String nom = result.getString(2);

                jug = new Jugador();
                jug.setId_jugador(cod);
                jug.setNombre(nom);
                lista.add(jug);

            }

            c.close();

        } catch (Exception e) {
        }

        return lista;
    }

    public void nuevoPartido(Partido p) {
        try {
            c = Conexion.getConexion();
            PreparedStatement pst = c.prepareStatement("exec CrearPartidos ?,?,?,?,?,?");

            pst.setInt(1, p.getId_equipoLocal());
            pst.setInt(2, p.getPuntosLocal());
            pst.setInt(3, p.getId_equipoVisitante());
            pst.setInt(4, p.getPuntosVisitate());
            pst.setDate(5, p.getFecha());
            pst.setInt(6, p.getId_jugadorDelPartido());

            pst.executeUpdate();

            c.close();

        } catch (Exception e) {
        }
    }

    public ArrayList<PartidoString> listaPartidos() {
        PartidoString pv;
        ArrayList<PartidoString> salida = new ArrayList<>();
//        int idLocal = 0;
//        String SLocal = "";
//        int idVisita = 0;
//        String SVisita = "";
//        Equipo Local;
//        Equipo Visita;

        try {
            c = Conexion.getConexion();
            Statement st = c.createStatement();
            ResultSet result = st.executeQuery("exec PartidoVer");

            while (result.next()) {
                int cod =  result.getInt(1);
                int idLocal = result.getInt(2);
                int puntosLocal = result.getInt(3);
                int idVisita = result.getInt(4);
                int puntosVisita = result.getInt(5);
                Date fecha = result.getDate(6);
                String jugador = result.getString(7);
//                
//                Local=MostrarEquipo(idLocal);
//                Visita=MostrarEquipo(idVisita);
                
//                SLocal= Local.getLogo();
//                SVisita=Visita.getLogo();

//                try {
////                    c = Conexion.getConexion();
//                    Statement st1 = c.createStatement();
//                    ResultSet result1 = st.executeQuery("exec DatosEquipo " + idLocal);
//
//                    while (result1.next()) {
//                        SLocal = result1.getString(4);
//                    }
////                    c.close();
//                } catch (Exception e) {
//                }
//
//                try {
////                    c = Conexion.getConexion();
//                    Statement st2 = c.createStatement();
//                    ResultSet result2 = st.executeQuery("exec DatosEquipo " + idVisita);
//
//                    while (result2.next()) {
//                        SVisita = result2.getString(4);
//                    }
////                    c.close();
//                } catch (Exception e) {
//                }

                pv = new PartidoString(cod, idLocal, puntosLocal, idVisita, puntosVisita, fecha, jugador);
                salida.add(pv);

            }
            c.close();
        } catch (Exception e) {
        }

        return salida;
    }

}
