<%-- 
    Document   : contacto
    Created on : Jul 7, 2018, 7:03:11 PM
    Author     : jdavi
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </head>
    <body class="clase">
        
        <%@include file="navbar.jsp" %>
        
        <div class="content">
            <h1><p class="lead text-center">Información de contacto</p></h1>
            <br>
        </div>

        <div class="table-responsive">          
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Telefono</th>
                        <th>E-mail</th>
                        <th>Dirección</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>+57 310 817 2191</td>
                        <td>j.david.yo@hotmail.com - juan.rey.reina@unillanos.edu.co</td>
                        <td>Bogotá D.C.</td>
                    </tr>
                </tbody>
            </table>
        </div>
        
        <div class="content">
            <p class="lead text-left">
                Aplicación web desarrollada con el framework <i>Spring Web MVC</i>, describe una tienda online
                para una fábrica de ropa para caballero, donde se narra información de la misma y se realizan pedidos.
            </p>
        </div>

    </body>
</html>
