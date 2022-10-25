/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la 
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase 
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al 
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date, 
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se 
puede conseguir instanciando un objeto Date con constructor vacío. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio.pkg11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();

        Date usuario = new Date(anio - 1900, mes - 1, dia);
        Date actual = new Date();

        System.out.println(actual);
        System.out.println("===================================");
        System.out.println(usuario);
        System.out.println("===================================");
        System.out.println("Pasaron " + (actual.getYear() - usuario.getYear()) + " años");
       

    }

}
/*
Forma con más Clases
//        LocalDate fechaActual = LocalDate.now();
//        LocalDate fecha = LocalDate.of(anio, mes, dia);
//        Period p = Period.between(fecha, fechaActual);
//        System.out.println("Pasaron " + p.getYears() + " años, " + p.getMonths() + " meses, " + p.getDays() + " y días.");

 */

/*
Forma sumando 1900
 Date actual = new Date();
        int diaActual = actual.getDate();
        int mesActual = actual.getMonth()+1;
        int anioActual = actual.getYear()+1900;
        System.out.println(actual);
        
        Date nacimiento = new Date();
        
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        //Diferencia de años
        int diferencia = anioActual - anio;
 
        // Si la diferencia es diferencia a 0
        if (diferencia != 0) {
            //Si el mes actual es menor que el que me pasan le resto 1
            //Si el mes es igual y el dia que me pasan es mayor al actual le resto 1
            //Si el mes es igual y el dia que me pasan es menor al actual no le resto 1
            if (mesActual <= mes) { //si if (mesActual == mes) { if (dia > diaActual) {
                        diferencia--;
                    }
                } else {
                    diferencia--;
                }
        System.out.println("============================");
        System.out.println(diferencia);
        System.out.println("============================");
*/
