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
public class Partidos {
    
    private int id;
    private String nombre;
    private int nvotos;
    private String logo;

    public Partidos(String nombre, int nvotos, String logo) {
        this.nombre = nombre;
        this.nvotos = nvotos;
        this.logo = logo;
    }

    public Partidos(int id, String nombre, int nvotos, String logo) {
        this.id = id;
        this.nombre = nombre;
        this.nvotos = nvotos;
        this.logo = logo;
    }

    public Partidos() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNvotos() {
        return nvotos;
    }

    public void setNvotos(int nvotos) {
        this.nvotos = nvotos;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    
}
