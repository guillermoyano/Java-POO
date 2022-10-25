/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package Entidades;

import java.util.Scanner;

public class Tiempo {

    private int hora, minutos, segundos;
    Scanner leer = new Scanner(System.in);

    public Tiempo() {
    }

    public Tiempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return "Tiempo{" + "hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + '}';
    }

    public void definirHora() {
        System.out.println("Ingresemos la hora esata");
        System.out.println("Mete la hora");
        setHora(leer.nextInt());
        
        while ((getHora() > 23 || getHora() < 0)){
            System.out.println("En qué planeta vivís?? Meté bien los dedos");
            setHora(leer.nextInt());
        }
        
        System.out.println("Ahora lo minuto");
        setMinutos(leer.nextInt());
        
        while ((getMinutos() > 59 || getMinutos() < 0)){
            System.out.println("En qué planeta vivís?? Meté bien los dedos");
            setMinutos(leer.nextInt());
        }
        
        System.out.println("Y lo segundo lo");
        setSegundos(leer.nextInt());
        
        while ((getSegundos() > 59 || getSegundos() < 0)){
            System.out.println("En qué planeta vivís?? Meté bien los dedos");
            setSegundos(leer.nextInt());
        }

    }

    public void imprimirHoraCompleta() {
        System.out.println("Son las " + getHora() + ":" + getMinutos() + ":" + getSegundos() + " horas");
    }

    public void Reloj() throws InterruptedException {

        for (int i = getHora(); i <= 24; i++) {
            if (i == 24) {
                i = 0;
            }
            for (int j = getMinutos(); j < 60; j++) {
                if (j==59){
                    setMinutos(0);
                }

                for (int k = getSegundos(); k <= 59; k++) {
                    Thread.sleep(1000);
                    if (k==59){
                    setSegundos(0);
                }
                    if (i < 10) {
                        System.out.print("0");
                    }
                    System.out.print(i + ":");
                    if (j < 10) {
                        System.out.print("0");
                    }
                    System.out.print(j + ":");
                    if (k < 10) {
                        System.out.print("0");
                    }
                    System.out.println(k);

                }
            }
        }
        System.out.println("");

    }

}
