package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Votaciones.</title>\n");
      out.write("        <link href=\"../Css/votos.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"primary_header\">\n");
      out.write("                <h1 class=\"title\">Votaciones.</h1>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <section class=\"section\">\n");
      out.write("            <h2 class=\"titulovista\">Inicio de Sesión:</h2>\n");
      out.write("            <br>\n");
      out.write("            <form action=\"../Controlador/ControladorLogin.php\">\n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tr bgcolor=#F38000>\n");
      out.write("                        <td class=\"td\" colspan=\"2\"><input type=\"text\" name=\"nombre\" style=\"width: 200px;\" required=\"required\" placeholder=\"Nombre\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr bgcolor=#F38000>\n");
      out.write("                        <td class=\"td\" colspan=\"2\"><input type=\"text\" name=\"apellidos\" style=\"width: 200px;\" required=\"required\" placeholder=\"Apellidos\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr bgcolor=#F38000>\n");
      out.write("                        <td class=\"td\" colspan=\"2\"><input type=\"date\" name=\"fecha_nac\" style=\"width: 200px;\" required=\"required\" placeholder=\"Fecha de nacimiento\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr bgcolor=#F38000>\n");
      out.write("                        <td class=\"td\" colspan=\"2\"><input type=\"domicilio\" name=\"domicilio\" style=\"width: 200px;\" required=\"required\" placeholder=\"Domicilio\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                     <tr bgcolor=#F38000>\n");
      out.write("                        <td class=\"td\" colspan=\"2\"><input type=\"nif\" name=\"nif\" style=\"width: 200px;\" required=\"required\" placeholder=\"N.I.F.\"></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <tr bgcolor=#F38000>\n");
      out.write("                        <td class=\"td\" colspan=\"2\"><input type=\"password\" name=\"contra\" style=\"width: 200px;\" required=\"required\" placeholder=\"Contraseña\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr bgcolor=#F38000>\n");
      out.write("                        <td class=\"td\"><input type=\"submit\" name=\"Rusuario\" value=\"Registar Usuario\" class=\"btn\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("        <footer class=\"secondary_header footer\">\n");
      out.write("            <div class=\"subtitle\">&copy;2017-2018 - <strong>Desarrollo de Aplicaciones en Entorno Servidor.</strong></div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
