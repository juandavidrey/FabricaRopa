<%-- 
    Document   : formulario
    Created on : Jul 6, 2018, 11:56:16 PM
    Author     : jdavi
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <script src="<c:url value="/resource/js/funciones.js" />"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
        <title>Fábrica de Ropa Rey</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Ingrese sus datos</h1>
                <form:form method="POST" commandName="producto">

                    <form:errors path="*" element="div" cssClass="alert alert-danger" />

                    <p>
                        <form:label path="nombre">Nombre</form:label>
                        <form:input path="nombre" cssClass="form-control" />
                        <form:errors path="nombre" />
                    </p>

                    <p>
                        <form:label path="tipoIdentificacion">Tipo de identificación</form:label>
                        <form:select path="tipoIdentificacion" cssClass="form-control">
                            <form:option value="0">Seleccione...</form:option>
                            <form:options items="${listaTipoIdentificacion}" />
                        </form:select>
                    </p>

                    <p>
                        <form:label path="numeroIdentificacion">Número de identificación</form:label>
                        <form:input path="numeroIdentificacion" cssClass="form-control" />
                        <form:errors path="numeroIdentificacion" />
                    </p>

                    <p>
                        <form:label path="productos">Camisas formales</form:label>
                        <input type="number" value="cantidadCamisas" class="form-control" />
                    </p>

                    <p>
                        <form:label path="productos">Pantalones formales</form:label>
                        <input type="number" value="cantidadPantalones" class="form-control" />
                    </p>     

                    <p>
                        <form:label path="productos">Chaquetas</form:label>
                        <input type="number" value="cantidadChaquetas" class="form-control" />
                    </p>

                    <hr />
                    <input type="submit" value="Enviar" class="form-control" />
                </form:form>

            </div>
        </div>
        <button href="javascript:void(0);" onclick="hola();">botón</button>

    </body>
</html>
