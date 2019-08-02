<%-- 
    Document   : NuevoPartido
    Created on : 27-may-2018, 18:43:13
    Author     : marx_
--%>


<%@page import="Modelo.Jugador"%>
<%@page import="Modelo.Equipo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Controlador.Operaciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    Operaciones o = new Operaciones();
    ArrayList<Equipo> Equipos=o.listaEquipos();
    ArrayList<Jugador> jugadores=o.listJugadores();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Partido</title>
        <style>
            body{
                text-align: center;
                padding: 15px;
                text-size: 18px;
            }
        </style>

    </head>
    <body>
        <div><h1>Cargar datos de partidos</h1></div>

        <form action="GestorPartidos" method="POST">

            <table>
                <tr>
                    <td>Equipo Local</td>
                    <td><select name="EquipoLocal">
                            <%
                                for (Object eq : Equipos) {
                                    Equipo equipo = (Equipo) eq;
                            %>
                            <option value="<%= equipo.getId_equipo()%>"><%= equipo.getNombre()%></option>
                            <% }%>
                        </select>

                    </td>
                </tr>

                <tr>
                    <td>Puntos Local</td>
                    <td><input type="text" name="PuntosLocal" /></td>
                </tr>

                <tr>
                    <td>EquipoVisitante</td>
                    <td><select name="EquipoVisitante">
                            <%
                                for (Object eq : Equipos) {
                                    Equipo equipo = (Equipo) eq;
                            %>
                            <option value="<%= equipo.getId_equipo()%>"><%= equipo.getNombre()%></option>
                            <% }%>
                        </select>

                    </td>
                </tr>

                <tr>
                    <td>Puntos Visitante</td>
                    <td><input type="text" name="PuntosVisitante" /></td>
                </tr>

                <tr>
                    <td>Fecha</td>
                    <td><input  type="date" name="Fecha" /></td>
                </tr>

                <tr>
                    <td>Jugador del Partido</td>
                    <td><select name="JugadorPartido">
                            <%
                                for (Object jug : jugadores) {
                                    Jugador jugador = (Jugador) jug;
                            %>
                            <option value="<%= jugador.getId_jugador()%>"><%= jugador.getNombre()%></option>
                            <% }%>
                        </select>

                    </td>
                </tr>

            </table>

            <input type="submit" value="Aceptar" />
        </form>
    </body>
</html>
