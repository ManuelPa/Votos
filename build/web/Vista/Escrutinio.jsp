<%@page import="Modelo.Partidos"%>
<%@page import="java.util.ArrayList"%>
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
            <div class="col-xs-2"></div>
            <div class="col-xs-8">
                <%ArrayList<Partidos> array = new ArrayList<Partidos>();%>
                <%array = (ArrayList) session.getAttribute("escrutinio");%>
                <%if (array.get(0).getNombre() == "") {%>
                <h1>No existen partidos</h1>
                <%} else {%>
                <table class="table table-responsive table-hover">
                    <tr>
                        <td><h2>Logo</h2></td>
                        <td><h2>Nombre</h2></td>
                        <td><h2>Número de Votos</h2></td>
                    </tr>
                    <%for (int i = 0; i < array.size(); i++) {%>
                    <tr>
                        <td><img src="<%=array.get(i).getLogo()%>" width="100" height="100"/></td>
                        <td><%=array.get(i).getNombre()%></td>
                        <td><%=array.get(i).getNvotos()%></td>
                    </tr>
                    <%}%>
                </table>
                <%}%>
            </div>
            <button id="volver" value="volver" class="btn btn-danger center-block" onclick="location.href = '../index.jsp'">Volver</button>
        </section>
    </body>
</html>
