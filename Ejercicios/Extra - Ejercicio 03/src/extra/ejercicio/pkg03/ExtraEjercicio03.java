package extra.ejercicio.pkg03;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Guillote
 */
public class ExtraEjercicio03 {

    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
        Raices d1 = new Raices();
        
        System.out.print("Ingrese el valor de a: ");
        d1.setA(leer.nextInt());
        System.out.print("Ingrese el valor de b: ");
        d1.setB(leer.nextInt());
        System.out.print("Ingrese el valor de c: ");
        d1.setC(leer.nextInt());
        d1.ObtieneRaices();
        d1.ObtieneRaiz();
        d1.Calcular();
        
    }
    
}