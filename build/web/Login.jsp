<%-- 
    Document   : Login
    Created on : 13-dic-2017, 10:41:27
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Votaciones.</title>
        <link href="src/java/Css/votos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <div class="primary_header">
                <h1>Votaciones.</h1>
            </div>
        </header>
        <section class="section">
            <h2>Inicio de Sesión:</h2>
            <br>
            <form action="../Controlador/ControladorLogin.php">
                <table class="table">
                    <tr bgcolor=#F38000>
                        <td class="td" colspan="2"><input type="text" name="nombre" style="width: 200px;" required="required" placeholder="Nombre"></td>
                    </tr>
                    <tr bgcolor=#F38000>
                        <td class="td" colspan="2"><input type="text" name="apellidos" style="width: 200px;" required="required" placeholder="Apellidos"></td>
                    </tr>
                     <tr bgcolor=#F38000>
                        <td class="td" colspan="2"><input type="date" name="fecha_nac" style="width: 200px;" required="required" placeholder="Fecha de nacimiento"></td>
                    </tr>
                    <tr bgcolor=#F38000>
                        <td class="td" colspan="2"><input type="domicilio" name="domicilio" style="width: 200px;" required="required" placeholder="Domicilio"></td>
                    </tr>
                     <tr bgcolor=#F38000>
                        <td class="td" colspan="2"><input type="nif" name="nif" style="width: 200px;" required="required" placeholder="N.I.F."></td> 
                    </tr>
                    <tr bgcolor=#F38000>
                        <td class="td" colspan="2"><input type="password" name="contra" style="width: 200px;" required="required" placeholder="Contraseña"></td>
                    </tr>
                    <tr bgcolor=#F38000>
                        <td class="td"><input type="submit" name="Rusuario" value="Registar Usuario" class="btn" /></td>
                    </tr>
                </table>
            </form>
        </section>
        <footer class="secondary_header footer">
            <div class="subtitle">&copy;2017-2018 - <strong>Desarrollo de Aplicaciones en Entorno Servidor.</strong></div>
        </footer>
    </body>
</html>
