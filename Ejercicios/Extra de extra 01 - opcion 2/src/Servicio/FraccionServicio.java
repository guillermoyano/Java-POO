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
    int num1, num2;

    public void Sumar() {
        num1 = (f.getNumerador1() * f.getDenominador2()) + (f.getNumerador2() * f.getDenominador1());
        num2 = (f.getDenominador1() * f.getDenominador2());
        simplificar();
        System.out.print("(" + f.getNumerador1() + "/" + f.getDenominador1() + ")/(" + f.getNumerador2() + "/" + f.getDenominador2() + ")= ");
        if (num1 == num2) {
            System.out.println(num1);
        } else {
            System.out.println(num1 + "/" + num2);
        }

    }

    public void Restar() {
        num1 = (f.getNumerador1() * f.getDenominador2()) - (f.getNumerador2() * f.getDenominador1());
        num2 = (f.getDenominador1() * f.getDenominador2());
        simplificar();
        System.out.print("(" + f.getNumerador1() + "/" + f.getDenominador1() + ")/(" + f.getNumerador2() + "/" + f.getDenominador2() + ")= ");
        if (num1 == num2) {
            System.out.println(num1);
        } else {
            System.out.println(num1 + "/" + num2);
        }

    }

    public void Multiplicar() {
        num1 = f.getNumerador1() * f.getNumerador2();
        num2 = f.getDenominador1() * f.getDenominador2();
        simplificar();
        System.out.print("(" + f.getNumerador1() + "/" + f.getDenominador1() + ")/(" + f.getNumerador2() + "/" + f.getDenominador2() + ")= ");
        if (num1 == num2) {
            System.out.println(num1);
        } else {
            System.out.println(num1 + "/" + num2);
        }

    }

    public void Dividir() {
        num1 = f.getNumerador1() * f.getDenominador2();
        num2 = f.getNumerador2() * f.getDenominador1();
        simplificar();
        System.out.print("(" + f.getNumerador1() + "/" + f.getDenominador1() + ")/(" + f.getNumerador2() + "/" + f.getDenominador2() + ")= ");
        if (num1 == num2) {
            System.out.println(num1);
        } else {
            System.out.println(num1 + "/" + num2);
        }

    }

    public int MCM() {
        int aux, numerador, denominador;
        numerador = Math.abs(num1);
        denominador = Math.abs(num2);

        if (denominador == 0) {
            return numerador;
        }
        while (denominador != 0) {
            aux = numerador % denominador;
            numerador = denominador;
            denominador = aux;
        }

        return numerador;
    }

    public void simplificar() {
        int n = MCM();

        num1 = num1 / n;
        num2 = num2 / n;

    }

}
