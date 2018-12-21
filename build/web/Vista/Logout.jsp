<%@page import="Modelo.Ciudadano"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Votaciones.</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/css.css" rel="stylesheet">
        <script src="../js/jquery.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
    </head>
    <body class="container">
        <header class="navbar navbar-default navbar-fixed-top">
            <h1>Elecciones Generales 2018.</h1>
        </header>
        <section class="row">
            <div class="col-xs-4"></div>
            <div class="col-xs-4">
                <%Ciudadano c = (Ciudadano) session.getAttribute("ciudadano");%>
                <h1>El ciudadano con DNI: <%=c.getNif()%> ha sido eliminado.</h1>
            </div>
            <button id="volver" value="volver" class="btn btn-danger center-block" onclick="location.href = '../index.jsp'">Volver</button>
        </section>
    </body>
</html>

