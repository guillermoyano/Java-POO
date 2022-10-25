package Servicio;

import Entidades.Sopa;
import java.util.Scanner;

public class SopaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Sopa s = new Sopa();
    int indice = 0;

    public void llenarMatriz() {
        String matrizUno[][] = {{"p", "e", "r", "r", "o"}, {"g", "a", "t", "o", "s"},
        {"l", "i", "s", "t", "o"}, {"p", "a", "r", "t", "o"},
        {"c", "o", "b", "r", "o"}};
        
        for (int i = 0; i < 5; i++) {
            int aleatorio = (int) (Math.random() * 10);
            for (int j = 0; j < 5; j++) {
                //s.matriz[aleatorio][j] = matrizUno[i][j];
                if (s.matriz[aleatorio][j] == null) {
                    s.matriz[aleatorio][j] = matrizUno[i][j];
                } else {
                    while (s.matriz[aleatorio][j] != null) {
                        aleatorio = (int) (Math.random() * 10);
                    }
                    s.matriz[aleatorio][j] = matrizUno[i][j];
                }
            }
        }
    }

    public void imprimir() {
        String vector[] = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "Z"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (s.matriz[i][j] == null) {
                    s.matriz[i][j] = vector[(int) (Math.random() * 25)];
                }
                System.out.print(" " + s.matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("..............................");
        System.out.println("..............................");
    }

    public void buscarPalabra() {
        System.out.println("Que palabra desea buscar: ");

        s.setPalabra(leer.next());
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < s.getPalabra().length(); j++) {
                if ((s.matriz[i][j].equalsIgnoreCase(s.getPalabra().substring(0, 1)))
                        && (s.matriz[i][j + 1].equalsIgnoreCase(s.getPalabra().substring(1, 2)))) {
                    indice = i;
                    System.out.println("Su palabra se encuentra en el indice " + (i + 1));
                }
                break;
            }
        }
    }

    public void reemplazar() {
        System.out.println("Ingresá la palabra nueva");
        String p = leer.next();

        for (int i = 0; i < p.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                s.matriz[indice][j] = p.substring(j, j + 1);
            }
        }
        System.out.println("..............................");
        System.out.println("..............................");
    }

    public void matrizInvertida() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + s.matriz[j][i] + " ");
            }
            System.out.println("");

        }
        System.out.println("..............................");
        System.out.println("..............................");
    }
}
