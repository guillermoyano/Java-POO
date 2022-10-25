package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Guillote
 */
public class PersonaServicio {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String genero;

    public void crearPersona(Persona p) {

        System.out.println("Ingrese su nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo -(H para hombre)-(M para mujer)-(O para otro) ");
        genero = leer.next();
        while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("O")) {
            System.out.println("Error");
            System.out.println("Ingrese una condición de sexo válida. (H - hombre)(M-Mujer)(O-Otro)");
            genero = leer.next();
            p.setSexo(genero);
        }
        System.out.println("Ingrese su peso");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura");
        p.setAltura(leer.nextDouble());

    }

    public double calcularIMC(Persona p) {
        double indice;
        indice = p.getPeso() / Math.pow(p.getAltura(), 2);

        if (indice < 20) {
            indice = -1;
        } else if (indice >= 20 && indice <= 25) {
            indice = 0;
        } else if (indice > 25) {
            indice = 1;
        }
        return indice;
    }
    
    public boolean esMayorDeEdad(Persona p){
        boolean edad=false;
        if (p.getEdad() >= 18){
            edad =true;
        
        }
        return edad;
    }
}