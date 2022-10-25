/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
*/
package extra.de.extra.pkg01;

import Servicio.FraccionServicio;

public class ExtraDeExtra01 {

    public static void main(String[] args) {
        
        FraccionServicio fs = new FraccionServicio ();
        
        fs.ingresarNumeros();
        fs.Menu();
        
        
    }

}
