/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controlador.Operaciones;
import Modelo.Equipo;
import Modelo.Partido;
import Modelo.PartidoString;
import Modelo.Posiciones;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marx_
 */
@WebServlet(name = "GestorTabla", urlPatterns = {"/GestorTabla"})
public class GestorTabla extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GestorTabla</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GestorTabla at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Operaciones o = new Operaciones();

        ArrayList<PartidoString> partidos = o.listaPartidos();
        Equipo[] equipos = new Equipo[9];

        for (Equipo equipo : equipos) {
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

            for (int i = 0; i < equipos.length; i++) {

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
                    
                    pos[i].setDiferencia(puntosFavor-puntosContra);
                }
                
              

            }
        }

        request.getRequestDispatcher("/TablaPocisiones.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
