/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package Servicio;

import Entidades.Fraccion;
import java.util.Scanner;

public class FraccionServicio {

    Fraccion f = new Fraccion();
    Scanner leer = new Scanner(System.in);

    public void ingresarNumeros() {
        System.out.println("Vamos a ingresar las fracciones");
        System.out.println("De la fracción 1, ingrese el numerador");
        f.setNumerador1(leer.nextInt());
        System.out.println("De la fracción 1, ingrese el denominador");
        f.setDenominador1(leer.nextInt());
        System.out.println("De la fracción 2, ingrese el numerador");
        f.setNumerador2(leer.nextInt());
        System.out.println("De la fracción 2, ingrese el denominador");
        f.setDenominador2(leer.nextInt());
        System.out.println("..................................................");
    }

    public void Menu() {
        int opcion;
        do {
            System.out.println("Menu de Operaciones entre Fracciones");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Sumar();
                    break;
                case 2:
                    Restar();
                    break;
                case 3:
                    Multiplicar();
                    break;
                case 4:
                    Dividir();
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));
    }

    public void Sumar() {
        int mayor, menor, mcm=0, otra=0, otramas=0;
        if (f.getDenominador1() != f.getDenominador2()) {
            mayor = Math.max(f.getDenominador1(), f.getDenominador2());
            menor = Math.min(f.getDenominador1(), f.getDenominador2());
            if (mayor % menor == 0) {
                mcm = mayor;
                if (mayor == f.getDenominador1()) {
                    otra = (mcm / menor) * f.getNumerador2();
                    otramas=f.getNumerador1();
                }else if(mayor==f.getDenominador2()){
                    otra=(mcm / menor) * f.getNumerador1();
                    otramas=f.getNumerador2();
                }
            } else {
                mcm = mayor * menor;
                if (f.getDenominador1()>f.getDenominador2()) {
                    otra = (mcm / mayor) * f.getNumerador1();
                    otramas=(mcm/menor) * f.getNumerador2();
                }else if(f.getDenominador2()>f.getDenominador1()){
                    otra = (mcm / menor) * f.getNumerador1();
                    otramas=(mcm/mayor) * f.getNumerador2();
                }
            }
        }else if (f.getDenominador1() == f.getDenominador2()){
            otra= f.getNumerador1();
            otramas= f.getNumerador2();
            mcm = f.getDenominador1();
        }
        System.out.println("La fracción es igual a: ");
        System.out.println(otra+otramas);
        System.out.println("-");
        System.out.println(mcm);
    }
    
    public void Restar() {
        int mayor, menor, mcm=0, otra=0, otramas=0;
        if (f.getDenominador1() != f.getDenominador2()) {
            mayor = Math.max(f.getDenominador1(), f.getDenominador2());
            menor = Math.min(f.getDenominador1(), f.getDenominador2());
            if (mayor % menor == 0) {
                mcm = mayor;
                if (mayor == f.getDenominador1()) {
                    otramas = (mcm / menor) * f.getNumerador2();
                    otra=f.getNumerador1();
                }else if(mayor==f.getDenominador2()){
                    otra=(mcm / menor) * f.getNumerador1();
                    otramas=f.getNumerador2();
                }
            } else {
                mcm = mayor * menor;
                if (f.getDenominador1()>f.getDenominador2()) {
                    otra = (mcm / mayor) * f.getNumerador1();
                    otramas=(mcm/menor) * f.getNumerador2();
                }else if(f.getDenominador2()>f.getDenominador1()){
                    otra = (mcm / menor) * f.getNumerador1();
                    otramas=(mcm/mayor) * f.getNumerador2();
                }
            }
        }else if (f.getDenominador1() == f.getDenominador2()){
            otra= f.getNumerador1();
            otramas= f.getNumerador2();
            mcm = f.getDenominador1();
        }
        System.out.println("La fracción es igual a: ");
        System.out.println(otra-otramas);
        System.out.println("-");
        System.out.println(mcm);
    }
    
    public void Multiplicar(){
        
        int aca=f.getNumerador1()*f.getNumerador2(), masaca=f.getDenominador1()*f.getDenominador2();
        
        System.out.println("La multiplicación de las fracciones es igual a: ");
        System.out.println(aca);
        System.out.println("-");
        System.out.println(masaca);
        
        if (aca == masaca){
            System.out.println("El resultado es igual a 1");
        }
        
         
    }
    
    public void Dividir(){
        
        int aca=f.getNumerador1()*f.getDenominador2(), masaca=f.getDenominador1()*f.getNumerador2();
        
        System.out.println("La multiplicación de las fracciones es igual a: ");
        System.out.println(aca);
        System.out.println("-");
        System.out.println(masaca);
        
        if (aca == masaca){
            System.out.println("El resultado es igual a 1");
        }
        if (aca > masaca){
            
        }
         
    }
}
