package Servicio;

import Entidades.Pass;
import java.util.Scanner;

public class PassServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Pass p = new Pass();

    public void crearPass() {
        System.out.println("Cree la nueva contraseña");
        p.setPass(leer.next());
        while (p.getPass().length() != 10) {
            System.out.println("No es de la longitud requerida");
            System.out.println("Ingrese la contraseña nuevamente");
            p.setPass(leer.next());
        }
    }

    /*
    ● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
     */
    public void analizarPass() {
        int contZ = 0, contA = 0;
        for (int i = 0; i < p.getPass().length(); i++) {
            if (p.getPass().substring(i, i + 1).equalsIgnoreCase("z")) {
                contZ++;
            }
            if (p.getPass().substring(i, i + 1).equalsIgnoreCase("A")) {
                contA++;
            }
        }

        if (contZ != 0) {
            if (contA >= 2) {
                System.out.println("Su contraseña es de Alto nivel");
            } else {
                System.out.println("Su contraseña es de nivel Medio");
            }
        } else {
            System.out.println("Su contraseña es de Bajo nivel");
        }
    }

    /*
    Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
     */
    public void modificarNombre() {
        if (validarPass()) {
            System.out.println("Ingrese su nombre:");
            p.setNombre(leer.next());
        }
    }

    public void modificarDNI() {
        if (validarPass()) {
            System.out.println("Ingrese su nuevo DNI:");
            p.setDni(leer.nextInt());
        }
    }

    public void modificarPass() {
        if (validarPass()) {
            System.out.println("Ingrese su nueva Contraseña");
            crearPass();
        }
    }

    public boolean validarPass() {
        int intentos = 0;
        System.out.println("Ingrese su contraseña para poder modificar el nombre");
        do {
            if (p.getPass().equals(leer.next())) {
                return true;
            } else {
                System.out.println("Contraseña Incorrecta");
                intentos++;
                if (intentos < 3) {
                    System.out.println("Vuelva a intentarlo");
                } else {
                    System.out.println("Agotaste tus intentos");
                    System.out.println("Llamando a la policia");
                    break;
                }
            }
        } while (intentos != 3);
        return false;
    }

    public void menuPrincipal() {
        int opcion;
        do {
            System.out.println("\tMenu ");
            System.out.println("1 - Crear nueva Contraseña");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    crearPass();
                    menuSecundario();
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

    public void menuSecundario() {
        int opcion;
        do {
            System.out.println("\tMenu ");
            System.out.println("1 - Analisar Contraseña");
            System.out.println("2 - Modificar Nombre");
            System.out.println("3 - Modificar DNI");
            System.out.println("4 - Modificar Contraseña");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    analizarPass();
                    break;
                case 2:
                    modificarNombre();
                    break;
                case 3:
                    modificarDNI();
                    break;
                case 4:
                    modificarPass();
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
}
