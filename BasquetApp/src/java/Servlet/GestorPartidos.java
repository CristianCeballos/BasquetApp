/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controlador.Operaciones;
import Modelo.Equipo;
import Modelo.Jugador;
import Modelo.Partido;
import Modelo.PartidoString;
import Modelo.PartidosVer;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
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
@WebServlet(name = "GestorPartidos", urlPatterns = {"/GestorPartidos"})
public class GestorPartidos extends HttpServlet {

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
            out.println("<title>Servlet GestorPartidos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GestorPartidos at " + request.getContextPath() + "</h1>");
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
        ArrayList<Equipo> eq = o.listaEquipos();
        Equipo[] equipos = new Equipo[9];
        
        for (Equipo equipo : eq) {
            int nro = equipo.getId_equipo() - 1;
            equipos[nro] = (Equipo) equipo;
        }
        
        ArrayList<PartidoString> pv = o.listaPartidos();
        ArrayList<PartidosVer> partidosString= new ArrayList<>();
        
        
        for (PartidoString partido : pv) {
            
            PartidosVer partidoS= new PartidosVer();
            partidoS.setId_partido(partido.getId_partido());
            partidoS.setPuntosLocal(partido.getPuntosLocal());
            partidoS.setPuntosVisitate(partido.getPuntosVisitate());
            partidoS.setFecha(partido.getFecha());
            partidoS.setJugadorDelPartido(partido.getJugadorDelPartido());
            
            for (int i = 0; i < equipos.length; i++) {
                if (partido.getEquipoLocal()==equipos[i].getId_equipo()) {
                    partidoS.setEquipoLocal(equipos[i].getLogo());
                }
                   if (partido.getEquipoVisitante()==equipos[i].getId_equipo()) {
                    partidoS.setEquipoVisitante(equipos[i].getLogo());
                }
            }
            
            partidosString.add(partidoS);
        }
        
        request.setAttribute("partidos", partidosString);
        
        
        request.getRequestDispatcher("/ListadoPartidos.jsp").forward(request, response);
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
        
        int eLocal = Integer.parseInt(request.getParameter("EquipoLocal"));
        int pLocal = Integer.parseInt(request.getParameter("PuntosLocal"));
        int eVisitante = Integer.parseInt(request.getParameter("EquipoVisitante"));
        int pVisitante = Integer.parseInt(request.getParameter("PuntosVisitante"));
        Date fecha = Date.valueOf(request.getParameter("Fecha"));
        int jugPartido = Integer.parseInt(request.getParameter("JugadorPartido"));
        
        Partido p = new Partido(eLocal, pLocal, eVisitante, pVisitante, fecha, jugPartido);
        
        Operaciones o = new Operaciones();
        o.nuevoPartido(p);
        request.getRequestDispatcher("/ListadoPartidos.jsp").forward(request, response);
        
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
