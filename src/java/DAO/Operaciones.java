package DAO;

import Modelo.Ciudadano;
import Modelo.Partidos;
import Modelo.SimpleCrypto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operaciones {

    private String clave = "test";

    public Operaciones() {
    }

    public boolean InicioSesion(Ciudadano c, Connection conexion) throws SQLException {
        boolean respuesta;
        conexion.setAutoCommit(false);
        String passencrypt = "";

        try {
            passencrypt = SimpleCrypto.encrypt(clave, c.getContraseña());
        } catch (Exception ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        PreparedStatement insert = conexion.prepareStatement("INSERT INTO ciudadanos VALUES(null, ?, ?, 'N')");
        insert.setString(1, c.getNif());
        insert.setString(2, passencrypt);
        try {
            insert.executeUpdate();
            conexion.commit();
            respuesta = true;
        } catch (SQLException e) {
            conexion.rollback();
            respuesta = false;
        }
        return respuesta;
    }

    public boolean Eliminar(Ciudadano c, Connection conexion) throws SQLException {
        Boolean respuesta = false;
        conexion.setAutoCommit(false);
        String passencrypt = "";

        try {
            passencrypt = SimpleCrypto.encrypt(clave, c.getContraseña());
        } catch (Exception ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }

        PreparedStatement select = conexion.prepareStatement("SELECT * FROM ciudadanos WHERE nif=? AND contraseña=?;");
        select.setString(1, c.getNif());
        select.setString(2, passencrypt);
        ResultSet rs = select.executeQuery();

        if (rs.next()) {
            String voto = rs.getString("voto");
            int id = rs.getInt("id");
            if ("N".equals(voto)) {
                PreparedStatement delete = conexion.prepareStatement("DELETE FROM ciudadanos WHERE id=?;");
                delete.setInt(1, id);
                try {
                    delete.executeUpdate();
                    conexion.commit();
                    respuesta = true;
                } catch (SQLException e) {
                    conexion.rollback();
                    respuesta = false;
                }
            }
        }
        return respuesta;
    }

    public int ComprobarVoto(Ciudadano c, Connection conexion) throws SQLException {
        int respuesta = 0;
        String passencrypt = "";
        try {
            passencrypt = SimpleCrypto.encrypt(clave, c.getContraseña());
        } catch (Exception ex) {
            Logger.getLogger(Operaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM ciudadanos WHERE nif=? AND contraseña=?;");
        sentencia.setString(1, c.getNif());
        sentencia.setString(2, passencrypt);
        ResultSet rs = sentencia.executeQuery();
        if (rs.next()) {
            String voto = rs.getString("voto");
            if ("N".equals(voto)) {
                respuesta = 1;
            } else {
                respuesta = 2;
            }
        }
        return respuesta;
    }

    public ArrayList MostrarCandidatos(Connection conexion) throws SQLException {
        ArrayList<Partidos> array = new ArrayList<>();
        PreparedStatement sentencia = conexion.prepareStatement("SELECT * FROM partidos;");
        ResultSet rs = sentencia.executeQuery();
        while (rs.next()) {
            Partidos partidos = new Partidos(rs.getInt("id"), rs.getString("nombre"), rs.getInt("nvotos"), rs.getString("logo"));
            array.add(partidos);
        }
        return array;
    }

    public boolean Votar(Connection conexion, Ciudadano c, int partido) throws SQLException {
        boolean respuesta = false;
        conexion.setAutoCommit(false);

        PreparedStatement update = conexion.prepareStatement("UPDATE ciudadanos SET voto='Y' WHERE nif=?;");
        update.setString(1, c.getNif());
        try {
            update.executeUpdate();
            PreparedStatement update2 = conexion.prepareStatement("UPDATE partidos SET nvotos=nvotos+1 WHERE id=?;");
            update2.setInt(1, partido);
            try {
                update2.executeUpdate();
                conexion.commit();
                respuesta = true;
            } catch (SQLException e) {
                conexion.rollback();
                respuesta = false;
            }
        } catch (SQLException e) {
            conexion.rollback();
            respuesta = false;
        }
        return respuesta;
    }

    public ArrayList Escrutinio(Connection conexion) throws SQLException {
        ArrayList<Partidos> array = new ArrayList<>();
        PreparedStatement select = conexion.prepareStatement("SELECT * FROM partidos;");
        ResultSet rs = select.executeQuery();
        while (rs.next()) {
            Partidos partidos = new Partidos(rs.getInt("id"), rs.getString("nombre"), rs.getInt("nvotos"), rs.getString("logo"));
            array.add(partidos);
        }
        return array;
    }

    public ArrayList<Ciudadano> Censo(Connection conexion) throws SQLException {
        ArrayList<Ciudadano> array = new ArrayList<>();
        PreparedStatement select = conexion.prepareStatement("SELECT * FROM ciudadanos;");
        ResultSet rs = select.executeQuery();
        while (rs.next()) {
            Ciudadano c = new Ciudadano(rs.getInt("id"), rs.getString("nif"), rs.getString("voto"));
            array.add(c);
        }
        return array;
    }

}
