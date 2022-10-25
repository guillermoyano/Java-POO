/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package extra.de.extra.pkg05;

import Entidades.Triangulo;
import java.util.Scanner;

public class ExtraDeExtra05 {

    public static void main(String[] args) {

        Triangulo t = new Triangulo();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int canTriangulos;
        System.out.println("Ingrese cuántos triángulos va a ingresar para comparar");
        canTriangulos = leer.nextInt();
        Triangulo vector[] = new Triangulo[canTriangulos];
        double grande = 0;
        int indice = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("...............................................................");
            System.out.println("...............................................................");
            System.out.println("Datos del triángulo " + (i + 1));
            t.medidas();
            t.area();
            t.perimetro();
            t.datos();
            if (t.getArea() < grande) {
                grande = grande;
            } else if (t.getArea() > grande) {
                grande = t.getArea();
                indice = i;
            }
            
        }
        System.out.println("El área más grande mide " + grande + " cm - Triángulo " + (indice + 1));
        System.out.println();

    }

}
