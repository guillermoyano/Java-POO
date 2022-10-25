package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public void menu(Cafetera c1) {
        boolean salir = false;
        int opcion = 0;
        do {
            System.out.println("        Menu        ");
            System.out.println("--------------------");
            System.out.println("1) Llenar cafetera  ");
            System.out.println("2)   Servir taza    ");
            System.out.println("3) Vaciar cafetera  ");
            System.out.println("4)   Agregar café   ");
            System.out.println("5)     Salir        ");
            System.out.println("--------------------");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    llenarCafetera(c1);
                    break;
                case 2:
                    servirTaza(c1);
                    break;
                case 3:
                    vaciarCafetera(c1);
                    break;
                case 4:
                    agregarCafe(c1);
                    break;
                case 5:
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

    public void llenarCafetera(Cafetera c1) {
        c1.setCapacidadMaxima(1000);
        System.out.println("La cafetera tiene una capacidad total de " +c1.getCantidadActual()+ " cm3");
        
        int llena;
        System.out.println("Ingrese la cantidad de cm3 que llena la cafetera");
        llena = leer.nextInt();
                    
        while (llena != 1000){
            System.out.println("Tiene que llenar la cafetera. La llena con 1000 cm3");
            llena = leer.nextInt();
        }
        c1.setCantidadActual(llena);

        System.out.println("Actualmente la cafetera cuenta con " + c1.getCantidadActual() + " cm3");
    }

    public void servirTaza(Cafetera c1) {
        int tamanio;
        System.out.println("De qué tamaño es la taza?");
        tamanio = leer.nextInt();

        if (c1.getCantidadActual() < tamanio) {
            System.out.println("La cantidad de café no alcanza para llenar la taza");
            System.out.println("Se sirvió un total de " + c1.getCantidadActual() + " cm3");
            System.out.println("Ahora la cafetera está vacía, si desea, vuelva a llenarla");
            c1.setCantidadActual(0);
        } else {
            c1.setCantidadActual(c1.getCantidadActual() - tamanio);
            System.out.println("La cantidad de café restante es " + c1.getCantidadActual() + " cm3");
        }

    }

    public void vaciarCafetera(Cafetera c1){
        System.out.println("Vaciamos la cafetera");
        c1.setCantidadActual(0);
        System.out.println("Ahora tiene " +c1.getCantidadActual()+ " cm3");
    }
    
    public void agregarCafe(Cafetera c1){
        int agregar, total;
        System.out.println("Cuánto café va a agregar a la cafetera?");
        System.out.println("En este momento la cantidad actual de café es de " +c1.getCantidadActual());
        System.out.println("Recuerde que puede agregar hasta llegar a los 1000 cm3");
        agregar = leer.nextInt();
        total = agregar + c1.getCantidadActual();
        
        while (total > 1000){
            System.out.println("Excede la capacidad. Ingrese hasta 1000 cm3");
            System.out.println("Ingrese la cantidad hasta alcanzar los 1000 cm3");
            agregar = leer.nextInt();
            total = agregar + c1.getCantidadActual();
        }
        c1.setCantidadActual(c1.getCantidadActual()+agregar);

        System.out.println("Actualmente la cafetera cuenta con " + c1.getCantidadActual() + " cm3");
    }
}
