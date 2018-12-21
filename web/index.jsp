<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Votaciones.</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/css.css" rel="stylesheet">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </head>
    <body class="container">
        <header class="navbar navbar-default navbar-fixed-top">
            <h1>Elecciones Generales 2018.</h1>
        </header>
        <section class="row">
            <div class="col-xs-2"></div>
            <div class="col-xs-4">
                <form method="post" action="servletDispatcher">
                    <table class="table table-responsive">
                        <tr>
                            <td colspan="3"><input type="text" maxlength="9" name="nif" style="width: 340px;" required="required" placeholder="N.I.F."></td>
                        </tr>
                        <tr>
                            <td colspan="3"><input type="password" name="contra" style="width: 340px;" required="required" placeholder="Contraseña"></td>
                        </tr>
                        <tr>
                            <td><input type="submit" name="opcion" value="Login" class="btn btn-danger" style="width: 100px;"/></td>
                            <td><input type="submit" name="opcion" value="Logout" class="btn btn-danger" style="width: 100px;" /></td>
                            <td><input type="submit" name="opcion" value="Votar" class="btn btn-danger"  style="width: 100px;"/></td>
                        </tr>
                    </table>
                </form>
            </div>
            <div class="col-xs-4">
                <form method="post" action="servletDispatcher">
                    <table class="table-responsive">
                        <tr>
                            <td><input type="submit" name="opcion" value="Escrutinio" class="btn btn-info" style="width: 340px;" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" name="opcion" value="Censo" class="btn btn-info" style="width: 340px;" /></td>
                        </tr>
                    </table>
                </form>
                <div class="subtitle"><strong>Desarrollo de Aplicaciones en Entorno Servidor.</strong></div>
                <div class="subtitle">&copy;2017-2018 </div>
            </div>
        </section>
    </body>
</html>
