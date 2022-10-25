package ejercicio.pkg08;

import Entidades.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

public class Ejercicio08 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena c = new Cadena();
        CadenaServicio cs = new CadenaServicio();
        
        System.out.println("Ingrese una frase");
        c.setFrase(leer.next());
        c.setLongitud(c.getFrase().length());
        
        cs.mostrarVocales(c);
        cs.invertirFrase(c);
        System.out.println("Ingrese una letra y veremos cuántas veces se encuentra en la frase");
        cs.vecesRepetido(c, leer.next());
        System.out.println("Ingrese una nueva frase");
        cs.compararLongitud(c, leer.next());
        System.out.println("Ingrese una nueva frase");
        cs.unirFrase(c, leer.next());
        System.out.println("Ingrese una letra o caracter para reemplazar la letra a");
        cs.reemplazar(c, leer.next());
        System.out.println("Ingrese una letra y veremos si ta o no ta");
        cs.contiene(c, leer.next());
    }
    
}
