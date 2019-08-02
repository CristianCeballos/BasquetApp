<%-- 
    Document   : ListadoPartidos
    Created on : 27-may-2018, 20:39:28
    Author     : marx_
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Equipo"%>
<%@page import="Modelo.Jugador"%>
<%@page import="Modelo.PartidosVer"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


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
                text-align: center;

            }

            h1 {
                height: 100%;
                background-color: black;
                padding: 3px;
                text-align: center;
                color: oldlace;
            }

            h3 {
                background-color: white;
                text-align: center;
                color: black;
                padding: 10px;
                display:inline; 
                margin-bottom: 15px;
            }

            a {
                padding: 4px 25px;
                background: rgb(245, 29, 29);

                color: #fff;
                border-radius: 4px;
                text-decoration: none;


            }


            div{
                padding: 10px;
                margin-bottom: 12px;

                border-color: black;
                text-align: center;
                

                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
                text-align: center;
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
            .titulo{
                background-color: red;
                color: white;
            }
        </style>

    </head>

    <body>

        <h1>Listado de Partidos</h1>

        <br>


        <c:forEach items="${partidos}" var="u">
            <div>

                <h4 class="titulo">Numero de Partido: ${u.id_partido}</h4>
                <h5>Fecha ${u.fecha}</h5>
                <amp-img src="./Imagenes/${u.equipoLocal}" alt="Imagen Torneo Prospero Palazzo" height="44" width="48" layout=""></amp-img><h3>${u.puntosLocal} </h3>
                <amp-img src="./Imagenes/${u.equipoVisitante}" alt="Imagen Torneo Prospero Palazzo" height="44" width="48" layout=""></amp-img><h3>${u.puntosVisitate} </h3><br><br>
                <h3>Jugador del Partido: </h3>
                <h4>${u.jugadorDelPartido} </h4>
            </div>
        </c:forEach>  


        <div>
            <a href="index.html">Pagina Principal</a>
        </div>

    </body>

</html>
