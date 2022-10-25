/*
Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
● Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.
 */
package Servicio;

import Entidades.Auto;
import java.util.Scanner;
import javax.swing.text.StyleConstants;

public class AutoServicio {

    Auto a = new Auto();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void datos() {
        
        System.out.println("Poné tú nombre");
        a.setTitular(leer.next());
        System.out.println("Qué auto es? Marca y modelo");
        a.setModelo(leer.next());
        System.out.println("Y qué color es?");
        a.setColor(leer.next());
        System.out.println("Sabemos que no es 0km (pedazo de rataaaa");
        a.setKm(7500);
        System.out.println(".....................................................");
    }

    public void cambiarTitularidad() {
        System.out.println("Vendiste el auto?");
        System.out.println("Quién es el nuevo titular?");
        a.setTitular(leer.next());
        System.out.println(".....................................................");

    }

    public void recorrido() {
        int paseo;
        System.out.println("Te pegaste un paseo? Cuántos km hiciste?");
        a.setKm(a.getKm() + leer.nextInt());
        System.out.println("Ahora tu auto tiene " + a.getKm());
        System.out.println(".....................................................");
    }

    public void service() {
        if (a.getKm() >= 10000) {
            System.out.println("Tenés que hacerle un cambio de aceite");
        }
        System.out.println("................ ....................................");
    }

    public void menu() {
        int opcion;
        do{
            
            System.out.println("\t \t \tMenu");
            System.out.println("Compraste un auto nuevo, se nota que tenés guitarra");
            System.out.println("        Vamos a cargar lo dato, vamo a cargar");
            System.out.println("\t1) Ingresa tus datos");
            System.out.println("\t2) Cambiar la titularidad");
            System.out.println("\t3) Si hiciste un recorrido, carga tus kms");
            System.out.println("\t4) Fijate si te hace falta un service");
            System.out.println("\t \t \t5) Salir");
            opcion = leer.nextInt(); 
            switch (opcion){
                case 1:
                    datos();
                    break;
                case 2:
                    cambiarTitularidad();
                    break;
                case 3:
                    recorrido();
                    break;
                case 4:
                    service();
                    break;
                case 5:
                    System.out.println("Salir. Ojala choques");
                default:
            }
        }while(opcion !=5);

    }

}
