package ej11extraguia7poo;


import Entidad.Triangulo;
import java.util.Scanner;


/**
 * @author Tonna/SA FR34K
 */
/*Ejercicio 5
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie*/
public class Ej11ExtraGuia7Poo {

    /**
     * @param args the command line arguments
     */
     public static int PerimetroMayor(Triangulo arreglo[]){
         double areacomparar;
         int indice=0;
         areacomparar=arreglo[0].getArea();
         for (int i = 0; i < arreglo.length; i++) {
             if(arreglo[i].getArea()>areacomparar){
                 areacomparar=arreglo[i].getArea();
                 indice=i;
             }
         }
         return indice;
        }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double Lados, Base, Altura, Perimetro, Area;
        int numeroTriangulos, areamayor;
        System.out.println("Ingrese la cantidad de triangulos a comparar");
        numeroTriangulos=leer.nextInt();
        Triangulo arreglo[]=new Triangulo[numeroTriangulos];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese los Datos del Triangulo "+(i+1));
            System.out.println("Ingrese el Lado");
            
            Lados=leer.nextDouble();
            System.out.println("Ingrese la Base");
            Base=leer.nextDouble();
            System.out.println("Ingrese la Altura");
            Altura=leer.nextDouble();
            Perimetro=(Lados+Lados+Base);
            Area=((Base*Altura)/2);
            arreglo[i]=new Triangulo(Lados,Base,Altura,Perimetro,Area);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        areamayor=PerimetroMayor(arreglo);
        System.out.println("El Triangulo con Mayor Area es:");
        System.out.println(arreglo[areamayor]);
    }

}
