/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

/**
 *
 * @author Muril
 */
public class Prueba {
    
    
    private int perro;
    private String gaviota;

    public Prueba(int perro, String gaviota) {
        this.perro = perro;
        this.gaviota = gaviota;
    }

    public int getPerro() {
        return perro;
    }

    public void setPerro(int perro) {
        this.perro = perro;
    }

    public String getGaviota() {
        return gaviota;
    }

    public void setGaviota(String gaviota) {
        this.gaviota = gaviota;
    }

    @Override
    public String toString() {
        return "Prueba{" + "perro=" + perro + ", gaviota=" + gaviota + '}';
    }
    
    
}
