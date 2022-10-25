package Entidades;

import java.util.Scanner;

public class Meses {

    Scanner leer = new Scanner(System.in);
    private String vector[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto = vector[(int) (Math.random() * 11)];

    public Meses() {
    }

    public Meses(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    @Override
    public String toString() {
        return "Meses{" + "vector=" + vector + ", mesSecreto=" + mesSecreto + '}';
    }

    public void adivinar() {
        String mes = "";
        System.out.println(getMesSecreto());
        System.out.print("Adivine el mes secreto: ");
        mes = leer.next();
        do {
            if (!mes.equals(mesSecreto)) {
                System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
                mes = leer.next();
            }
        } while (!mes.equals(mesSecreto));
        System.out.println("CORRRRRRRECTO");
    }
}
