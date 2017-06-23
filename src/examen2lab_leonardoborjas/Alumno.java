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
public class Alumno implements Serializable{
    private static final long SerialVersionUID=666L;
    private String apodo;
    private int cuenta;
    private int edad;
    private String grado;
    private int resistencia;
    private String arma;
    private int poder;

    public Alumno() {
    }

    public Alumno(String apodo, int cuenta, int edad, String grado, String arma, int poder) {
        this.apodo = apodo;
        this.cuenta = cuenta;
        this.edad = edad;
        this.grado = grado;
        this.resistencia=edad*8;
        this.arma = arma;
        this.poder = poder;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
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
        return apodo ;
    }
    
    
}
