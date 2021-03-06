/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cotrolador;

import DAO.ConexionBBDD;
import DAO.Operaciones;
import Modelo.Ciudadano;
import Modelo.Partidos;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class servletVotar extends HttpServlet {

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

        int resultado = ObjOperaciones.ComprobarVoto(c, Conexion);
        if (resultado == 1) {
            ArrayList<Partidos> partidos = ObjOperaciones.MostrarCandidatos(Conexion);
            misession.setAttribute("ciudadano", c);
            misession.setAttribute("candidatos", partidos);
            response.sendRedirect("Vista/Candidatos.jsp");
        } else if (resultado == 2) {
            String error = "Ha habido un problema, el usuario ya ha votado.";
            misession.setAttribute("error", error);
            response.sendRedirect("Vista/Error.jsp");
        } else if (resultado == 0) {
            String error = "Ha habido un problema, no se ha encontrado el usuario.";
            misession.setAttribute("error", error);
            response.sendRedirect("Vista/Error.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(servletVotar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(servletVotar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
