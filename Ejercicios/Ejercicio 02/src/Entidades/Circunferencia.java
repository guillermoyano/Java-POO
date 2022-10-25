/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����)
 */
package Entidades;

import java.util.Scanner;

public class Circunferencia {
    Scanner leer = new Scanner (System.in);
    private double radio;
    
    

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

     public void setRadio(double radio) {
        this.radio = radio;
    }
     
    public double getRadio() {
        return radio;
    }
    
    public void crearCircunferencia(Circunferencia c1){
        System.out.println("Ingrese el radio");
        setRadio(leer.nextDouble());
        
    }
    
    public void area(Circunferencia c1){
        
        System.out.println("El area es: " + (Math.pow(c1.getRadio(), 2)*3.14));
        
    }
    
    public void perimetro(Circunferencia c1){
        
        System.out.println("El perimetro es: " +(2*3.14*c1.getRadio()));
        
    }
    
}
