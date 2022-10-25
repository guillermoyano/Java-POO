/*
Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

*/
package ejercicio.pkg09;


import Entidades.Matematica;
import Servicio.MatematicaServicio;

public class Ejercicio09 {

    public static void main(String[] args) {
        MatematicaServicio ms = new MatematicaServicio ();
        Matematica m = new Matematica();
        
        m.setNumero1((Math.random()*10));
        m.setNumero2((Math.random()*10));
        
        System.out.println("El primer número es: " +m.getNumero1());
        System.out.println("El segundo número es: " +m.getNumero2());
        System.out.println("===========================");
        System.out.println("El número mayor es: " +ms.devolverMayor(m));
        System.out.println("===========================");
        ms.calcularPotencia(m);
        ms.calcularRaiz(m);
        
        
        
        
    }
    
}
