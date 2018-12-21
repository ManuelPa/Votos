package Cotrolador;

import DAO.ConexionBBDD;
import DAO.Operaciones;
import Modelo.Ciudadano;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pc
 */
public class servletLogin extends HttpServlet {

    private Connection Conexion;

    @Override
    public void init() throws ServletException {
        /* Establecemos la conexión, si no existe */
        try {
            ConexionBBDD ConexBD = ConexionBBDD.GetConexion();
            Conexion = ConexBD.GetCon();
        } catch (ClassNotFoundException | SQLException cnfe) {
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        String nif = request.getParameter("nif");
        String contra = request.getParameter("contra");
        Ciudadano c = new Ciudadano(nif, contra, null);

        Operaciones ObjOperaciones = new Operaciones();

        HttpSession misession = request.getSession(true);

        if (ObjOperaciones.InicioSesion(c, Conexion) == true) {
            misession.setAttribute("ciudadano", c);
            response.sendRedirect("Vista/Login.jsp");
        } else {
            String error = "Ha habido un problema, ya hay un nif igual al introducido.";
            misession.setAttribute("error", error);
            response.sendRedirect("Vista/Error.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(servletLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(servletLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
