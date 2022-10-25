/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
• Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.
 */
package Entidades;

import java.util.Date;
import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private Date nacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacimiento=" + nacimiento + '}';
    }

   
    


    /*
    Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
     */
    public void crearPersona() {
        System.out.println("Ingrese su gracia");
        setNombre(leer.next());
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        Date nacimiento = new Date(anio - 1900, mes - 1, dia);
        setNacimiento(nacimiento);
        
        

        System.out.println("Me llamo " + nombre + " nací " + nacimiento.toLocaleString());
    }

    /*
    Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.
     */
    public void calcularEdad(Date nacimiento) {
        Date actual = new Date();
        System.out.println("La edad es: " + (actual.getYear() - nacimiento.getYear()));
    }

    /*
    Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.
     */
    public boolean menorQue(int edad, Date nacimiento) {
        boolean verdad = false;

        if (edad > nacimiento.getYear()) {
            verdad = true;
        }

        return verdad;
    }
    /*
    Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior
    */
    public void mostrarPersona(int edad){
        System.out.println("Zulma Lobato tiene " +edad+ " años");
    } 

}
