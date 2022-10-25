package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void mostrarVocales(Cadena c) {
        String palabra = c.getFrase();
        int cont = 0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < c.getLongitud(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                cont++;
            }
        }
        System.out.println("Hay en total " + cont + " vocales");
    }

    public void invertirFrase(Cadena c) {

        for (int i = c.getLongitud() - 1; i >= 0; i--) {
            System.out.print(c.getFrase().charAt(i));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena c, String letra) {
        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(c.getFrase().substring(i, i + 1))) {
                cont++;
            }
        }
        if (cont != 0) {
            System.out.println("El caracter " + letra + " se repite " + cont + " veces.");
        } else {
            System.out.println("No se encontró la letra buscada");
        }
    }

    public void compararLongitud(Cadena c, String frase) {
        
        if (c.getLongitud() > frase.length()) {
            System.out.println("La palabra ingresada es más corta");
        }else if (c.getLongitud() == frase.length()){
            System.out.println("Son iguales");
        }else if (c.getLongitud() < frase.length()){
            System.out.println("La tenés más grande");
        }
    }

    public void unirFrase(Cadena c, String frase) {
        
        c.setFrase(c.getFrase().concat(" ").concat(frase));

        System.out.println("La frase concatenada es: " + c.getFrase());
        c.setLongitud(c.getFrase().length());
    }

    public void reemplazar(Cadena c, String caracter) {
        c.setFrase(c.getFrase().replace('A', 'a'));
        c.setFrase(c.getFrase().replace("a", caracter));
        System.out.println("La nueva frase es: " +c.getFrase());
    }

    public void contiene(Cadena c, String letra) {
       boolean ban = false;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(c.getFrase().substring(i, i+1))){
                ban = true;
                break;
            }
        }
        
        if(ban){
            System.out.println("Contiene la letra");
        }else{
            System.out.println("No contiene la letra");
        }
    }
}
