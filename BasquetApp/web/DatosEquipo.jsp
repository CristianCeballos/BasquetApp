<%-- 
    Document   : DatosEquipo
    Created on : 27-may-2018, 17:23:56
    Author     : marx_
--%>

<%@page import="Modelo.Equipo"%>
<%@page import="Modelo.Jugador"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Equipo eq= (Equipo)request.getAttribute("equipo");
    
    %>
<!doctype html>
<html amp lang="es">

<head>
    <meta charset="utf-8">
    <script async src="https://cdn.ampproject.org/v0.js"></script>
    <title>Pasion por el Basquet</title>
    <link rel="canonical" href="http://example.ampproject.org/article-metadata.html">
    <meta name="viewport" content="width=device-width,minimum-scale=1,initial-scale=1">
    <script type="application/ld+json">
      {
        "@context": "http://schema.org",
        "@type": "NewsArticle",
        "headline": "Open-source framework for publishing content",
        "datePublished": "2018-04-05T18:26:41Z",
        "image": [
          "logo.jpg"
        ]
      }
    </script>
    <style amp-boilerplate>
        body {
            -webkit-animation: -amp-start 8s steps(1, end) 0s 1 normal both;
            -moz-animation: -amp-start 8s steps(1, end) 0s 1 normal both;
            -ms-animation: -amp-start 8s steps(1, end) 0s 1 normal both;
            animation: -amp-start 8s steps(1, end) 0s 1 normal both
        }

        @-webkit-keyframes -amp-start {
            from {
                visibility: hidden
            }
            to {
                visibility: visible
            }
        }

        @-moz-keyframes -amp-start {
            from {
                visibility: hidden
            }
            to {
                visibility: visible
            }
        }

        @-ms-keyframes -amp-start {
            from {
                visibility: hidden
            }
            to {
                visibility: visible
            }
        }

        @-o-keyframes -amp-start {
            from {
                visibility: hidden
            }
            to {
                visibility: visible
            }
        }

        @keyframes -amp-start {
            from {
                visibility: hidden
            }
            to {
                visibility: visible
            }
        }
    </style>
    <noscript>
        <style amp-boilerplate>
            body {
                -webkit-animation: none;
                -moz-animation: none;
                -ms-animation: none;
                animation: none
            }
        </style>
    </noscript>

    <style amp-custom>
        /* Cualquier estilo personalizado va aquí */

        body {
            background-color: white;
            height: 100%;
            padding: 10px;
            font-family: Helvetica;

        }

        h1 {
            height: 100%;
            background-color: black;
            padding: 3px;
            text-align: center;
            color: oldlace;
        }

        h4 {
            background-color: black;
            text-align: center;
            color: white;
            padding: 3px;
        }

        a {
            padding: 4px 25px;
            background: rgb(245, 29, 29);

            color: #fff;
            border-radius: 4px;
            text-decoration: none;


        }

        div {
            text-align: center;
            padding: 10px;
            margin: 0px;

        }

        table {
            border-collapse: collapse;
            width: 100%;
            margin: 0px;

        }

        th,
        td {
            text-align: center;
            padding: 2px;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        .tabla {
            box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
        }
    </style>





</head>

<body>



    <h1><%= eq.getNombre() %></h1>


    <div>
        <amp-img src="./Imagenes/<%= eq.getLogo() %>" alt="Imagen Torneo Prospero Palazzo" height="118" width="126" layout=""></amp-img>
        <br>
        <br>
    </div>

    <amp-img src="./Imagenes/<%= eq.getFoto() %>" alt="Imagen Torneo Prospero Palazzo" height="444" width="790" layout="responsive"></amp-img><br><br>

    <h5>Ciudad:<%= eq.getCiudad() %></h5>
    <h5>Entrenador: Sin Datos</h5>
    <h5>Capitan: Sin Datos</h5>

    <h4>Lista de Jugadores</h4>

    <div class="tabla">
        <table>
            
            <tr>
                <td>Nombre</td>
                <td>Novedades</td>
            </tr>
            
            <c:forEach items="${listaJugadores}" var="u">
                <tr>
                    <td>${u.nombre}</td>
                    <td></td>
                </tr>
            </c:forEach>  
                
            
        </table>
    </div>
    <br>



    <div>
        <a href="./Equipos">Equipos</a>
        <br>
        <br>
        <a href="index.html">Pagina Principal</a>
    </div>

</body>

</html>
