/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author pc
 */
public class Ciudadano {

    private int id;
    private String nif;
    private String contraseña;
    private String voto;

    public Ciudadano() {
    }

    public Ciudadano(String nif, String contraseña, String voto) {
        this.nif = nif;
        this.contraseña = contraseña;
        this.voto = voto;
    }

    public Ciudadano(int id, String nif, String contraseña, String voto) {
        this.id = id;
        this.nif = nif;
        this.contraseña = contraseña;
        this.voto = voto;
    }

    public Ciudadano(int id, String nif, String voto) {
        this.id = id;
        this.nif = nif;
        this.voto = voto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        return "Ciudadano{" + "id=" + id + ", nif=" + nif + ", contrase\u00f1a=" + contraseña + ", voto=" + voto + '}';
    }

}
