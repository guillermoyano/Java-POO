/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrasextras6poo;

import ServicioSopa.ServicioS;
import Sopa.Sopa;

/**
 *
 * @author Pergo
 */
public class ExtrasExtras6POO {

    public static void main(String[] args) {

        ServicioS ss = new ServicioS();
        ss.llenarMatriz();
        ss.imprimir();
        ss.buscarPalabra();
        ss.reemplazar();
        ss.imprimir();
        System.out.println("--------------------------------------");
        ss.imprimerInvert();
    }

}
