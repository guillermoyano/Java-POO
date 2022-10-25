package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    public Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta(CuentaBancaria c1) {
        System.out.println("Ingrese su numero de Cuenta: ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI: ");
        c1.setDNI(leer.nextInt());
        while (c1.getDNI() > 99999999 || c1.getDNI() < 10000000){
            System.out.println("Error. Ingresá otra vez el DNI");
            c1.setDNI(leer.nextInt());
        }
        c1.setSaldoActual(50000);
        return c1;
    }

    public void menu(CuentaBancaria c1) {
        boolean salir = false;
        int opcion = 0;
        do {
            System.out.println("        Menu        ");
            System.out.println("--------------------");
            System.out.println("1) Ingresar Dinero  ");
            System.out.println("2) Retirar Dinero   ");
            System.out.println("3) Extraccion rapida");
            System.out.println("4) Consultar Saldo  ");
            System.out.println("5) Consultar Datos  ");
            System.out.println("6) Salir            ");
            System.out.println("--------------------");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    ingresarDinero(c1);
                    break;
                case 2:
                    retirarDinero(c1);
                    break;
                case 3:
                    extraccionRapida(c1);
                    break;
                case 4:
                    consultarSaldo(c1);
                    break;
                case 5:
                    consultarDatos(c1);
                    break;
                case 6:
                    System.out.println("Desea salir del menú (S/N)");
                    if (leer.next().equalsIgnoreCase("S")) {
                        salir = true;
                        System.out.println("No vemo la prosimax");
                    }
                    break;
                default:
                    System.out.println("Le pifiaste. Ingresa el numero otra vez");
            }
        } while (salir != true);
    }

    public void ingresarDinero(CuentaBancaria c1) {
        int ingresar;
        System.out.println("Cuánto dinero vas a meter?");
        ingresar = leer.nextInt();
        c1.setSaldoActual(ingresar + c1.getSaldoActual());
        System.out.println("Te queda ahora $" + c1.getSaldoActual());
    }

    public void retirarDinero(CuentaBancaria c1) {
        int retirar;
        System.out.println("Cuánto vas a sacar??");
        retirar = leer.nextInt();
        if (retirar > c1.getSaldoActual()) {
            System.out.println("Error. No podés sacar más de lo que tenés");
            c1.setSaldoActual(0);
            System.out.println("Tu saldo ahora es $" +c1.getSaldoActual());
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - retirar);
            System.out.println("Te queda ahora $" + c1.getSaldoActual());
        }
    }

    public void extraccionRapida(CuentaBancaria c1) {
        int retirar, limite;
        limite = (20 * c1.getSaldoActual()) / 100;
        System.out.println("Ingresa cuanto vas a sacar");
        System.out.println("El máximo que puede sacar es de $" + limite);
        retirar = leer.nextInt();
        if (retirar > limite) {
            System.out.println("Error. No podés sacar más de $" + limite);
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - retirar);
        }
        System.out.println("Te queda ahora $" + c1.getSaldoActual());
    }

    public void consultarSaldo(CuentaBancaria c1) {
        System.out.println("Su saldo actual es $" + c1.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria c1) {
        System.out.println("Su número de cuenta es: " + c1.getNumeroCuenta());
        System.out.println("Su DNI es: " + c1.getDNI());
        System.out.println("Su saldo es: $" + c1.getSaldoActual());
        System.out.println(c1.toString());
    }
}
