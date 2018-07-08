<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fábrica de Ropa Rey</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
    </head>
    <body class="clase">
        <h1>Factura de su compra</h1>
        <ul>
            <li>Nombre : <c:out value="${nombre}" /></li>
            <li>País : <c:out value="${tipoIdentificacion}" /></li>
            <li>Identificación : <c:out value="${numeroIdentificacion}" /></li>
            <li>Precio de su compra : <c:out value="${precio}" /></li>
        </ul>
    </body>
</html>
