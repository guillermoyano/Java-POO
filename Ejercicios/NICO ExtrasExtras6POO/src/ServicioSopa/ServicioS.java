/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioSopa;

import Sopa.Sopa;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class ServicioS {

    int indice = 0;
    Sopa s = new Sopa();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarMatriz() {
        String matriz1[][] = {{"p", "e", "r", "r", "o"}, {"p", "r", "o", "m", "o"}, {"b", "r", "o", "m", "o"}, {"m", "a", "g", "i", "c"}, {"p", "a", "r", "t", "o"}};
//      
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                s.matriz[i][j] = matriz1[i][j];

            }
        }

    }

    public void buscarPalabra() {

        System.out.println("Que palabra desea buscar: ");
        s.setLetra(leer.next());
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < s.getLetra().length(); j++) {
                if ((s.matriz[i][j].equals(s.getLetra().substring(0, 1))) && 
                    (s.matriz[i][j + 1].equals(s.getLetra().substring(1, 2)))) {

                    indice = i;
                    System.out.println("Su palabra se encuentra en el indice " + (i + 1));
                }
                break;
            }
        }

    }

    public void imprimir() {
        String vector[] = new String[]{"5", "1", "2", "3", "4", "6", "7", "8", "9", "0"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (s.matriz[i][j] == null) {
                    s.matriz[i][j] = vector[(int) (Math.random() * 10)];
                }
                System.out.print(s.matriz[i][j]);

            }
            System.out.println(" ");
        }

    }

    public void reemplazar() {
        System.out.println("Que palabra desea reemplazar por la buscada");
        String palabra = leer.next();

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < palabra.length(); j++) {
                s.matriz[indice][j] = palabra.substring(j, j + 1);

            }
        }
    }

    public void imprimerInvert() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(s.matriz[j][i]);
            }
            System.out.println(" ");
        }
    }
}
