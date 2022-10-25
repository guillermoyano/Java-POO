/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Auto {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
//    Auto a=new Auto();
   
    private String nombre,color,modelo;
    private Date fechaV;
    private int km;

    public Auto() {
    }

    
    public Auto(String nombre, String color, String modelo, Date fechaV, int km) {
        this.nombre = nombre;
        this.color = color;
        this.modelo = modelo;
        this.fechaV = fechaV;
        this.km = km;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaV() {
        return fechaV;
    }

    public void setFechaV(Date fechaV) {
        this.fechaV = fechaV;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombre=" + nombre + ", color=" + color + ", modelo=" + modelo + ", fechaV=" + fechaV + ", km=" + km + '}';
    }
    public void cargar(){
        System.out.println("Ingrese el nombre del titular");
        setNombre(leer.next());
        System.out.println("Ingrese el color del auto");
        setColor(leer.next());
        System.out.println("Ingrese el modelo ");
        setModelo(leer.next());
        System.out.println("Ingrese el anio del carnet");
        int anio=leer.nextInt();
        System.out.println("Ingrese el mes del carnet");
        int mes=leer.nextInt();
        System.out.println("Ingrese el dia del carnet");
        int dia=leer.nextInt();
        Date fechaV=new Date(anio-1900,mes-1,dia);
        setKm(7500);
    }
    public void modificarTitular(){
        System.out.println("Ingrese el nuevo nombre del titular");
        setNombre(leer.next());
        System.out.println("El nuebo nombre de titular es: "+getNombre());
    }
    public void trayecto(){
        System.out.println("Cuanto recorrio en km");
        int km1 =getKm()+leer.nextInt();
        setKm(km1);
        System.out.println("El nuevo kilometraje es de: "+getKm());
    }
    public void service(){
        if (getKm()>=10000) {
            System.out.println("Se necesita realizzar un service del vehiculo");
        }else{
            System.out.println("Todavia no llego a los 10000Km, no es necesario realizar el service aun");
        }
    }
}
