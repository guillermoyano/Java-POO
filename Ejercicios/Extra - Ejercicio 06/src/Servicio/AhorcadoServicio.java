package Servicio;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    Ahorcado ah = new Ahorcado();
    Scanner leer = new Scanner(System.in);


    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con 
    la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
    Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la 
    palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el 
    valor que ingresó el usuario y encontradas en 0.
     */
    public void crearJuego() {

        System.out.println("Ingrese la palabra para ahorcar");
        ah.setPalabra(leer.next());
        System.out.println("Ingrese la cantidad de vidas (jugadas máximas)");
        ah.setJugadasmaximas(leer.nextInt());
        ah.vectorPalabra = new String[ah.getPalabra().length()];

        for (int i = 0; i < ah.getPalabra().length(); i++) {
            ah.vectorPalabra[i] = ah.getPalabra().substring(i, i + 1);
        }
        ah.setLetrasEncontradas(0);
        System.out.println("Número de oportunidades restantes: " + ah.getJugadasmaximas());

    }

    /*
    Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: 
    buscar como se usa el vector.length.
     */
    public void longitud() {

        System.out.println("Longitud de la palabra " + ah.getPalabra().length());
        ah.vectorLineas = new String[ah.getPalabra().length()];

        for (int i = 0; i < ah.getPalabra().length(); i++) {
            ah.vectorLineas[i] = "_ ";
            System.out.print(ah.vectorLineas[i] + " ");
        }
        System.out.println("");

    }

    /*
    Método buscar(letra): este método recibe una letra dada por el usuario y busca si la 
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     */
    public void buscar() {
        System.out.println("Ingrese la letra a buscar");
        ah.setLetra(leer.next());
        int contador1 = 0, contador2 = 0;

        for (int i = 0; i < ah.getPalabra().length(); i++) {
            if (ah.vectorPalabra[i].equalsIgnoreCase(ah.getLetra())) {
                ah.setLetrasEncontradas(ah.getLetrasEncontradas() + 1);
                ah.vectorLineas[i] = ah.getLetra();
                contador1++;
            } else {
                contador2++;
            }

        }
        if (contador1 != 0) {
            System.out.println("La letra pertenece a la palabra");
            System.out.println("");
        } else if (contador2 != 0) {
            System.out.println("La letra -NO- pertenece a la palabra");
            System.out.println("");
        }

        ah.setContadoruno(contador1);
        ah.setContadordos(contador2);
    }

    /*
    Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre 
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
    busque una letra que no esté, se le restará uno a sus oportunidades
     */
    boolean bandera = false;

    public boolean encontradas() {

        if (ah.getContadoruno() != 0) {
            for (int i = 0; i < ah.getPalabra().length(); i++) {
                System.out.print(ah.vectorLineas[i] + " ");
            }
            System.out.println("");
            bandera = true;
        }

        if (ah.getContadoruno() == 0) {
            ah.setJugadasmaximas(ah.getJugadasmaximas() - 1);
            for (int i = 0; i < ah.getPalabra().length(); i++) {
                System.out.print(ah.vectorLineas[i] + " ");
            }
            System.out.println("");
            bandera = false;
        }
        ah.setContadortres((ah.getPalabra().length() - ah.getLetrasEncontradas()));

        System.out.println("Número de letras (encontradas, faltantes)" + ah.getLetrasEncontradas()
                + ", " + ah.getContadortres());
        System.out.println("");
        return bandera;
    }

    /*
    Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
     */
    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + ah.getJugadasmaximas());
        System.out.println("");
        if (ah.getJugadasmaximas() == 0) {
            System.out.println("Perdiste. Se acabaron las oportunidades");
            System.out.println("..........................................");
        }
    }

    /*
    Método juego(): el método juego se encargará de llamar todos los métodos 
    previamente mencionados e informará cuando el usuario descubra toda la palabra o 
    se quede sin intentos. Este método se llamará en el main
     */
    public void juego() {
        crearJuego();
        longitud();
        do {
            buscar();
            System.out.println(encontradas());
            intentos();
            if (ah.getContadortres() == 0) {
                System.out.println("Felicidades, adivinaste la palabra");
                ah.setJugadasmaximas(0);
            }
        } while (ah.getJugadasmaximas() != 0);

    }

}
