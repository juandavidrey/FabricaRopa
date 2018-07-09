<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <link rel="stylesheet" href="<c:url value="/resource/css/estilos.css" />" />
        <script src="<c:url value="/resource/js/funciones.js" />"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Fábrica de Ropa Rey</title>        
    </head>

    <body class="clase">
        
        <%@include file="navbar.jsp" %>
        
        <div class="container" >
            <h1>Ropa Rey</h1>
            <p>El mejor vestuario para hombres con estilo</p> 
        </div>
        <div>
            <img class="img-responsive center-block" src="<c:url value="/resource/image/tienda.jpg" />" alt="Fábrica de Ropa Rey" width="700" height="400" align="center"> 
        </div>

        <div class="container-fluid" >
            <p class="lead center-block">
                La fábrica ropa rey es un sitio para caballeros con una mentalidad del hombre elegante. 
                Nos encanta la presentación, el buen vestir, pero más importante la manera en que tú 
                lo combinas para crear tu propio estilo. No creemos que hay una sola manera de lucir 
                elegante pero sí tenemos ideas de cómo hacerlo.<br><br>

                En www.roparey.com podrás explorar las novedades que nos llegan a diario. 
                También encontrarás una guía interactiva de las últimas tendencias y como tú las puedes interpretar. 
                Nuestra marca representa una visión única con un punto de vista elegante y sofisticado; 
                te invitamos a ser parte de ella.
            </p>
        </div>
       

<!--        <a href="formulario.htm"><h2>Formulario</h2></a>
        <hr />
        <a href="javascript:void(0);" onclick="hola();">haz clic</a>
        <button href="javascript:void(0);" onclick="hola();">botón</button>-->

    </body>
</html>
