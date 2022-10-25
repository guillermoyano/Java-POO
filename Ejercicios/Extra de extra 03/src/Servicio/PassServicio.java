package Servicio;

import Entidades.Pass;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PassServicio {

    Pass p = new Pass();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPass() {
        System.out.println("Vamos a crear una nueva contraseña para el usuario");
        System.out.println("Ingrese la contraseña. La misma debe tener 10 carácteres");
        p.setPass(leer.next());
        while (p.getPass().length() != 10) {
            System.out.println("No es de la longitud requerida");
            System.out.println("Ingrese la contraseña nuevamente");
            p.setPass(leer.next());
        }
    }

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

    public void modificarNombre() {
        String contra = "";
        System.out.println("Ingrese la contraseña para entrar al sistema");
        contra = leer.next();
        while (!(p.getPass().equals(contra))) {
            System.out.println("Contraseña incorrecta. Ingresela nuevamente");
            contra = leer.next();
        }
        System.out.println("Su nombre actual es " + p.getNombre());
        System.out.println("Ingrese el nuevo nombre de usuario");
        p.setNombre(leer.next());
        System.out.println("Su nombre " + p.getNombre() + " ha sido configurado");
    }

    public void modificarDNI() {
        String contra = "";
        System.out.println("Ingrese la contraseña para entrar al sistema");
        contra = leer.next();
        while (!(p.getPass().equals(contra))) {
            System.out.println("Contraseña incorrecta. Ingresela nuevamente");
            contra = leer.next();
        }
        System.out.println("Su DNI actual es " + p.getDNI());
        System.out.println("Ingrese el nuevo DNI");
        p.setDNI(leer.nextInt());
        System.out.println("Su DNI " + p.getDNI() + " ha sido configurado");
    }

    public void modificarPass() {
        String contra = "";
        String aux = p.getPass();
        boolean check;
        System.out.println("Ingrese la contraseña para entrar al sistema");
        contra = leer.next();
        while (!(p.getPass().equals(contra))) {
            System.out.println("Contraseña incorrecta. Ingresela nuevamente");
            contra = leer.next();
        }
        System.out.println("Su contraseña actual es " + p.getPass());
        System.out.println("Ingrese la nueva contraseña");
        p.setPass(leer.next());
        validarNuevoPass();

        while (p.getPass().equals(aux)) {

            System.out.println("Error. La contraseña debe ser distinta. Ingresela nuevamente");
            p.setPass(leer.next());
            validarNuevoPass();
        }

        System.out.println("Su contraseña " + p.getPass() + " ha sido configurada");
    }

    public void validarNuevoPass() {

        while (p.getPass().length() <= 9 || p.getPass().length() >= 11) {

            System.out.println("No es de la longitud requerida. Ingresela nuevamente");
            System.out.println("Debe tener 10 carácteres de longitud");
            p.setPass(leer.next());
        }
    }

//    public void menu() {
//        int opcion, opcion2;
//
//        do {
//            System.out.println("Bienvenido al sistema");
//            System.out.println("Seleccione la opción deseada..............................");
//            System.out.println("1) ..Para crear su nueva contraseña.......................");
//            System.out.println("7) ..Para salir del sistema...............................");
//            opcion = leer.nextInt();
//            switch (opcion) {
//                case 1:
//                    crearPass();
//                    //menus();
//                    System.out.println("Seleccione la opción deseada..............................");
//                    System.out.println("2) ..Para conocer el nivel de seguridad de su contraseña..");
//                    System.out.println("3) ..Para modificar su contraseña.........................");
//                    System.out.println("4) ..Para modificar el nombre de usuario..................");
//                    System.out.println("5) ..Para modificar el DNI................................");
//                    System.out.println("6) ..Para salir del sistema...............................");
//                    opcion2 = leer.nextInt();
//
//                    switch (opcion2) {
//                        case 1:
//                            analizarPass();
//                            break;
//                        case 2:
//                            modificarPass();
//                            break;
//                        case 3:
//                            modificarNombre();
//                            break;
//                        case 4:
//                            modificarDNI();
//                            break;
//                        case 5:
//                            opcion2 = 7;
//                            break;
//                        default:
//                            System.out.println("Meté bien lo dedo nene, meté bien");
//                    }
//                    break;
//                case 7:
//                    System.out.println("No se vemo!!!!");
//                    break;
//                default:
//                    System.out.println("Meté bien lo dedo nene, meté bien");
//            }
//        } while (opcion != 7);
//    }
    public void menu() {
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
            System.out.println("Seleccione la opción deseada..............................");
            System.out.println("1) ..Para conocer el nivel de seguridad de su contraseña..");
            System.out.println("2) ..Para modificar su contraseña.........................");
            System.out.println("3) ..Para modificar el nombre de usuario..................");
            System.out.println("4) ..Para modificar el DNI................................");
            System.out.println("5) ..Para salir del sistema...............................");
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
