/*
Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package Servicio;

import Entidades.Matematica;

public class MatematicaServicio {

    public double devolverMayor(Matematica m) {
        double mayor;
        mayor = Math.max(m.getNumero1(), m.getNumero2());

        return mayor;
    }

    public void calcularPotencia(Matematica m) {
        if (m.getNumero1() > m.getNumero2()) {
            System.out.println("El número en potencia es: " + Math.pow(Math.round(m.getNumero1()), Math.round(m.getNumero2())));
        } else {
            System.out.println("El número en potencia es: " + Math.pow(Math.round(m.getNumero2()), Math.round(m.getNumero1())));
        }

    }

    public void calcularRaiz(Matematica m) {
        double menor;
        menor = Math.abs(Math.min(m.getNumero1(), m.getNumero2()));
        System.out.println("La raíz cuadrada del número " + menor + " es: " + Math.sqrt(Math.abs(menor)));
    }

}
