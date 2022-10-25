/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sopa;

/**
 *
 * @author Pergo
 */
public class Sopa {
    public String matriz[][]=new String[10][10];
    private String letra;
    
    public Sopa() {
        
    }

    public Sopa(String[][] matriz, String letra) {
        this.matriz = matriz;
        this.letra = letra;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Sopa{" + "matriz=" + matriz + ", letra=" + letra + '}';
    }
    
}
