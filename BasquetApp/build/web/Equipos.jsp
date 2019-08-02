<%-- 
    Document   : Equipos
    Created on : 27-may-2018, 15:46:05
    Author     : marx_
--%>
<%@page import="Modelo.Equipo"%>
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
        <style amp-boilerplate>body{-webkit-animation:-amp-start 8s steps(1,end) 0s 1 normal both;-moz-animation:-amp-start 8s steps(1,end) 0s 1 normal both;-ms-animation:-amp-start 8s steps(1,end) 0s 1 normal both;animation:-amp-start 8s steps(1,end) 0s 1 normal both}@-webkit-keyframes -amp-start{from{visibility:hidden}to{visibility:visible}}@-moz-keyframes -amp-start{from{visibility:hidden}to{visibility:visible}}@-ms-keyframes -amp-start{from{visibility:hidden}to{visibility:visible}}@-o-keyframes -amp-start{from{visibility:hidden}to{visibility:visible}}@keyframes -amp-start{from{visibility:hidden}to{visibility:visible}}</style><noscript><style amp-boilerplate>body{-webkit-animation:none;-moz-animation:none;-ms-animation:none;animation:none}</style></noscript>

        <style amp-custom>
            /* Cualquier estilo personalizado va aquí */
            body {
                background-color: white;
                height: 100%;
                padding: 10px;
                font-family:Helvetica;

            }
            h1 {
                height: 100%;
                background-color: black;
                padding: 3px;
                text-align: center;
                color:oldlace;
            }
            h4{
                height: 100%;
                background-color:black;
                padding: 3px;
                text-align: center;
                color:oldlace;

            }

            h3{
                background-color: red;
                text-align: center;
                color:white;
                padding: 3px;
            }
            a{
                text-align: center;
            }
            div{
                padding: 10px;
                margin-bottom: 12px;

                border-color: black;
                text-align: center;

                box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
                text-align: center;
            }

            .menu{
                padding: 5px;
                text-decoration: none;
                background-color:red;
                border: none;
                color: white;
                padding: 7px 16px;
                text-align: center;
                text-decoration: none;
                border-block-end: 2px;


                font-size: 16px;
            }
            a {
                padding: 4px 25px;
                background: rgb(245, 29, 29);

                color: #fff;
                border-radius: 4px;
                text-decoration: none;

            }



        </style>


    </head>
    <body>


        <h1>Equipos</h1>

        <c:forEach items="${listaEquipos}" var="c">


            <div>
                <h4>${c.nombre}</h4>
                
                <amp-img src="./Imagenes/${c.logo}" alt="Imagen Torneo Prospero Palazzo" height="118" width="126" layout=""></amp-img><br><br>
                <a href="./DatosEquipoVer?id=${c.id_equipo}">Mas info</a>

            </div>
    </c:forEach>
    <div class="botones">
        <a href="index.html" class="menu">Pagina Principal</a>
    </div>
</body>
</html>