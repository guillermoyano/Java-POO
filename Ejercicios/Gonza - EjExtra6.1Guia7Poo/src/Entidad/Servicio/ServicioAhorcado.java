package Entidad.Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado d1 = new Ahorcado();
    boolean resp = false;
    int encontradas = 0;

    public Ahorcado CrearJuego() {
        //System.out.println("Ingrese la palabra para adivinar:");
       // d1.setPalabra(leer.next());
       d1.setPalabra(JOptionPane.showInputDialog("Ingresa la palabra"));
       
       d1.vectorpalabra = new String[d1.getPalabra().length()];
        for (int i = 0; i < d1.getPalabra().length(); i++) {
            d1.vectorpalabra[i] = d1.palabra.substring(i, i + 1);
        }
        //System.out.println("Ingrese la cantidad de jugadas maximas:");
        //d1.setJugadasmaximas(leer.nextInt());
        d1.setJugadasmaximas(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de jugadas maximas")));
        d1.setLetrasencontradas(0);
        return d1;
    }

    public void Longitud() {
        d1.vectorasteriscos = new String[d1.getPalabra().length()];
        System.out.println("La longitud de la palabra a adivinar es: " + d1.getPalabra().length());
        Arrays.fill(d1.vectorasteriscos, "* ");
        System.out.println("Tantos asteriscos, tantas letras...");
        for (int i = 0; i < d1.getPalabra().length(); i++) {
            System.out.print(d1.vectorasteriscos[i] + " ");
        }
        System.out.println("");
    }

    public void Buscar(String letra) {
        for (int i = 0; i < d1.getPalabra().length(); i++) {
            if (d1.vectorpalabra[i].equalsIgnoreCase(letra)) {
                d1.vectorasteriscos[i] = letra;
                d1.setLetrasencontradas(d1.getLetrasencontradas() + 1);
                encontradas++;
            }
        }
        if (!(d1.getLetrasencontradas() == 0)) {
            System.out.println("La letra esta en la palabra");
        }
        if (encontradas == d1.getPalabra().length()) {
            System.out.println("Todas las letras de la palabra, (" + d1.getPalabra() + ") han sido encontradas...");
            System.out.println("Juego Terminado...");
            d1.setJugadasmaximas(0);
        }
    }

    public boolean LetrasEncontradas() {
        if (!(d1.getLetrasencontradas() == 0)) {
            for (int i = 0; i < d1.getPalabra().length(); i++) {
                System.out.print(d1.vectorasteriscos[i] + " ");
            }
            System.out.println("");
            System.out.println("Letras encontradas " + d1.getLetrasencontradas());
            System.out.println("Te quedan por encontrar, "+(d1.getPalabra().length()-encontradas)+" letras");
            resp = true;
        }
        if (d1.getLetrasencontradas() == 0) {
            System.out.println("letra incorrecta");
            for (int i = 0; i < d1.getPalabra().length(); i++) {
                System.out.print(d1.vectorasteriscos[i] + " ");
                resp = false;
            }
            System.out.println("");
        }
        d1.setLetrasencontradas(0);
        return resp;
    }

    public void Intentos() {
        d1.setJugadasmaximas(d1.getJugadasmaximas() - 1);
        System.out.println("Te quedan " + d1.getJugadasmaximas() + " intentos");
        if (d1.getJugadasmaximas() == 0) {
            System.out.println("Tendrias que arriesgar una palabra...");
        }
    }

    public void Arriesgar() {
        int bandera = 0;
        String arriesgar = "";
        String opcion;
        System.out.println("Desea arriesgar una palabra? (S/N):");
        opcion = leer.next();
        if (opcion.equalsIgnoreCase("s")) {
            System.out.println("Introduzca la palabra a arriesgar:");
            arriesgar = leer.next();
            bandera = 1;
        }
        if (bandera == 1) {
            if (d1.getPalabra().equalsIgnoreCase(arriesgar)) {
                System.out.println("Muy bien, has adivinado la palabra");
                System.out.println("Juego Terminado...");
                d1.setJugadasmaximas(0);
            } else if (!(d1.getJugadasmaximas() == 0)) {
                System.out.println("Esa palabra no es... segui buscando");
            }
        }
        if (d1.getJugadasmaximas() == 0 && !(d1.getPalabra().equalsIgnoreCase(arriesgar))) {
            System.out.println("Has agotado todos los recursos, has sido Ahorcado...");
        }
    }

    public void Juego() {
        Longitud();
        do {
            System.out.println("Ingrese una letra");
            Buscar(leer.next());
            if (!(d1.getJugadasmaximas() == 0)) {
                if (LetrasEncontradas()) {
                } else {
                    Intentos();
                }
                Arriesgar();
            }
        } while (!(d1.getJugadasmaximas() == 0));
        System.out.println("");
    }
}
