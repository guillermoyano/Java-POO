package ejextra6.pkg1guia7poo;

import Entidad.Ahorcado;
import Entidad.Servicio.ServicioAhorcado;
import java.util.Scanner;

/**
 * @author Tonna/SA FR34K
 */
/**/
public class EjExtra61Guia7Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAhorcado Datos = new ServicioAhorcado();
        Ahorcado d1 = Datos.CrearJuego();
        Datos.Juego();
    }
}
