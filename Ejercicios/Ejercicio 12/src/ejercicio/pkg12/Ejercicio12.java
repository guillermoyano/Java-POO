/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
• Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.
*/
package ejercicio.pkg12;

import Entidades.Persona;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        Persona p = new Persona();
        Scanner leer = new Scanner (System.in);
        p.crearPersona();
        p.calcularEdad(p.getNacimiento());
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        System.out.println("Sos más pendejo que el anterior??");
        System.out.println(p.menorQue(edad, p.getNacimiento()));
        p.mostrarPersona(edad);
        
        System.out.println(p.toString());
        
    }
}
