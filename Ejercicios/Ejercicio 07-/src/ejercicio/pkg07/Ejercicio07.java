package ejercicio.pkg07;

import Entidades.Persona;
import Servicio.PersonaServicio;

public class Ejercicio07 {

    public static void main(String[] args) {
        
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        PersonaServicio ps = new PersonaServicio();
        int contFlaco = 0, contBien = 0, contGordi = 0, contPendex = 0, contViejo = 0;

        System.out.println("====================================");
        ps.crearPersona(p1);
        if (ps.calcularIMC(p1) == -1) {
            System.out.println("Está flaquito");
            contFlaco++;
        } else if (ps.calcularIMC(p1) == 0) {
            System.out.println("Está bien");
            contBien++;
        } else if (ps.calcularIMC(p1) == 1) {
            System.out.println("Está gordito");
            contGordi++;
        }
        if (ps.esMayorDeEdad(p1)) {
            System.out.println("Estas viejo");
            contViejo++;
        } else {
            System.out.println("Es un pendejo");
            contPendex++;
        }
        System.out.println("====================================");
        ps.crearPersona(p2);
        ps.calcularIMC(p2);
        if (ps.calcularIMC(p2) == -1) {
            System.out.println("Está flaquito");
            contFlaco++;
        } else if (ps.calcularIMC(p2) == 0) {
            System.out.println("Está bien");
            contBien++;
        } else if (ps.calcularIMC(p2) == 1) {
            System.out.println("Está gordito");
            contGordi++;
        }
        if (ps.esMayorDeEdad(p2)) {
            System.out.println("Estas viejo");
            contViejo++;
        } else {
            System.out.println("Es un pendejo");
            contPendex++;
        }
        System.out.println("====================================");
        ps.crearPersona(p3);
        ps.calcularIMC(p3);
        if (ps.calcularIMC(p3) == -1) {
            System.out.println("Está flaquito");
            contFlaco++;
        } else if (ps.calcularIMC(p3) == 0) {
            System.out.println("Está bien");
            contBien++;
        } else if (ps.calcularIMC(p3) == 1) {
            System.out.println("Está gordito");
            contGordi++;
        }
        if (ps.esMayorDeEdad(p3)) {
            System.out.println("Estas viejo");
            contViejo++;
        } else {
            System.out.println("Es un pendejo");
            contPendex++;
        }
        System.out.println("====================================");
        ps.crearPersona(p4);
        ps.calcularIMC(p4);
        if (ps.calcularIMC(p4) == -1) {
            System.out.println("Está flaquito");
            contFlaco++;
        } else if (ps.calcularIMC(p4) == 0) {
            System.out.println("Está bien");
            contBien++;
        } else if (ps.calcularIMC(p4) == 1) {
            System.out.println("Está gordito");
            contGordi++;
        }
        if (ps.esMayorDeEdad(p4)) {
            System.out.println("Estas viejo");
            contViejo++;
        } else {
            System.out.println("Es un pendejo");
            contPendex++;
        }

        System.out.println("====================================");
        System.out.println("El " + (100 * contFlaco / 4) + "% está por debajo de su peso");
        System.out.println("El " + (100 * contGordi / 4) + "% está por encima de su peso");
        System.out.println("El " + (100 * contBien / 4) + "% está por bien de peso");
        System.out.println("====================================");
        System.out.println("El " + (100 * contViejo) / 4 + "% es viejo");
        System.out.println("El " + (100 * contPendex) / 4 + "% es pendejo");
    }
}


