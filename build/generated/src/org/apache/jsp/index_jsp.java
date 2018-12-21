package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Votaciones.</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/css.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"container\">\n");
      out.write("        <header class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("            <h1>Elecciones Generales 2018.</h1>\n");
      out.write("        </header>\n");
      out.write("        <section class=\"row\">\n");
      out.write("            <div class=\"col-xs-2\"></div>\n");
      out.write("            <div class=\"col-xs-4\">\n");
      out.write("                <form method=\"post\" action=\"servletDispatcher\">\n");
      out.write("                    <table class=\"table table-responsive\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"3\"><input type=\"text\" maxlength=\"9\" name=\"nif\" style=\"width: 340px;\" required=\"required\" placeholder=\"N.I.F.\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td colspan=\"3\"><input type=\"password\" name=\"contra\" style=\"width: 340px;\" required=\"required\" placeholder=\"Contraseña\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" name=\"opcion\" id=\"Login\" value=\"Login\" class=\"btn btn-danger\" style=\"width: 100px;\"/></td>\n");
      out.write("                            <td><input type=\"submit\" name=\"opcion\" id=\"Logout\" value=\"Logout\" class=\"btn btn-danger\" style=\"width: 100px;\" /></td>\n");
      out.write("                            <td><input type=\"submit\" name=\"opcion\" id=\"Votar\" value=\"Votar\" class=\"btn btn-danger\"  style=\"width: 100px;\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-4\">\n");
      out.write("                <form method=\"post\" action=\"servletDispatcher\">\n");
      out.write("                    <table class=\"table-responsive\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" name=\"opcion\" id=\"Escrutinio\" value=\"Escrutinio\" class=\"btn btn-info\" style=\"width: 340px;\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" name=\"opcion\" id=\"Resultados\" value=\"Resultados\" class=\"btn btn-info\" style=\"width: 340px;\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"subtitle\"><strong>Desarrollo de Aplicaciones en Entorno Servidor.</strong></div>\n");
      out.write("                <div class=\"subtitle\">&copy;2017-2018 </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
