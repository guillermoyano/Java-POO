package Entidad;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Sopa {

    public String sopa[][];
    public String palabraencontrar;

    public Sopa() {
        this.sopa = new String[10][10];

    }

    public Sopa(String[][] sopa, String palabraencontrar) {
        this.sopa = sopa;
        this.palabraencontrar = palabraencontrar;
    }

    public String[][] getSopa() {
        return sopa;
    }

    public void setSopa(String[][] sopa) {
        this.sopa = sopa;
    }

    public String getPalabraencontrar() {
        return palabraencontrar;
    }

    public void setPalabraencontrar(String palabraencontrar) {
        this.palabraencontrar = palabraencontrar;
    }

    @Override
    public String toString() {
        return "Sopa{" + "sopa=" + sopa + ", palabraencontrar=" + palabraencontrar + '}';
    }
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String matrizpalabra[][] = {{"m", "e", "n", "o", "s"}, {"p", "e", "r", "r", "o"}, {"g", "a", "n", "a", "r"}, {"t", "o", "d", "o", "s"}, {"p", "a", "s", "t", "o"}};
    int vector[] = new int[5];

    public void LlenadoMatriz() {
        Arrays.fill(vector, 0);
        for (int i = 0; i < vector.length; i++) {
            boolean encontrado = false;
            int ale = (int) (Math.random() * 10);
            for (int j = 0; j < vector.length; j++) {
                if (vector[j] == ale) {
                    encontrado = true;
                }
            }
            if (!encontrado) {
                vector[i] = ale;
            } else {
                i--;
            }
        }
        Arrays.sort(vector);
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                sopa[vector[i]][j] = matrizpalabra[i][j];
            }
        }
    }

    public void ImpresionMatriz() {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                if (sopa[i][j] == null) {
                    sopa[i][j] = "x";
                }
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void ImpresionInvertida() {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                System.out.print(sopa[j][i] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    int indice = 0;

    public void BuscarPalabra() {
        System.out.println("Ingrese una palabra a buscar en la sopa de letras");
        String palabra = leer.next();
        String busca[] = new String[palabra.length()];
        for (int i = 0; i < busca.length; i++) {
            busca[i] = palabra.substring(i, i + 1);
        }
        for (int i = 0; i < sopa.length; i++) {
            for (int k = 0; k < busca.length; k++) {
                if (sopa[i][k].equalsIgnoreCase(busca[0]) && sopa[i][k + 1].equalsIgnoreCase(busca[1])) {
                    System.out.println("La palabra se encuentra a partir de la fila " + (i + 1) + " ,columna 1");
                    indice = i;
                }
                break;
            }
        }
    }

    public void ReemplazarPalabra() {
        System.out.println("Ingrese una palabra a buscar y reemplazar");
        String palabra = leer.next();
        System.out.println("Ingrese la palabra nueva");
        String palabra1 = leer.next();
        String busca[] = new String[palabra.length()];
        String busca1[] = new String[palabra.length()];

        for (int i = 0; i < busca.length; i++) {
            busca[i] = palabra.substring(i, i + 1);
        }
        for (int i = 0; i < busca1.length; i++) {
            busca1[i] = palabra1.substring(i, i + 1);
        }
        for (int i = 0; i < sopa.length; i++) {
            for (int k = 0; k < busca.length; k++) {
                if (sopa[i][k].equalsIgnoreCase(busca[0]) && sopa[i][k + 1].equalsIgnoreCase(busca[1])) {
                    indice = i;
                }
                break;
            }
        }
        for (int k = 0; k < busca.length; k++) {
            sopa[indice][k] = busca1[k];
        }
    }
}
