/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_leonardoborjas;

import java.io.Serializable;

/**
 *
 * @author Leonardo Borjas
 */
public class Ruso implements Serializable{
    private static final long SerialVersionUID=666L;
    private String nombre;
    private int id;
    private int edad;
    private String rango;
    private int resistencia;
    private String arma;
    private int poder;

    public Ruso() {
    }

    public Ruso(String nombre, int id, int edad, String rango, String arma, int poder) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.rango = rango;
        this.resistencia=edad * 8;
        this.arma = arma;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return nombre  ;
    }
    
    
}
