/*
Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package Entidades;

import extra.de.extra.pkg05.ExtraDeExtra05;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Triangulo {

    private double ladoDos, ladoUno, area, perimetro;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ExtraDeExtra05 cantidad = new ExtraDeExtra05();

    public Triangulo() {
    }

    public Triangulo(double ladoDos, double ladoUno, double area, double perimetro) {
        this.ladoDos = ladoDos;
        this.ladoUno = ladoUno;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getLadoDos() {
        return ladoDos;
    }

    public void setLadoDos(double ladoDos) {
        this.ladoDos = ladoDos;
    }

    public double getLadoUno() {
        return ladoUno;
    }

    public void setLadoUno(double ladoUno) {
        this.ladoUno = ladoUno;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "ladoDos=" + ladoDos + ", ladoUno=" + ladoUno + ", area=" + area + ", perimetro=" + perimetro + ", leer=" + leer + '}';
    }

    public void medidas() {
        
        System.out.println("Primero ingresá la medida de la base (el lado desigual)");
        setLadoUno(leer.nextInt());
        System.out.println("Ahora ingresá la medida de la altura (lados iguales)");
        setLadoDos(leer.nextInt());
        while (getLadoDos() == getLadoUno() ){
            System.out.println("Los tres lados miden lo mismo. Ya o sería un triángulo isósceles. Cambia el tamaño de la base");
            setLadoUno(leer.nextInt());
        }
    }

    public double area() {
        double altura, acuadrado, bcuadrado;
        acuadrado = Math.pow(getLadoDos(), 2);
        bcuadrado = Math.pow(getLadoUno(), 2);
        altura = Math.sqrt(acuadrado - (bcuadrado / 4));
        setArea((getLadoUno() * altura) / 2);
        return getArea();
    }

    public double perimetro() {
        setPerimetro((getLadoDos() * 2) + getLadoUno());

        System.out.println("El perimetro del triángulo es: " + getPerimetro() + " cm");
        System.out.println("-------------------------------");
        
        return getPerimetro();
    }
    
    public String datos(){
        return "La base es " +getLadoUno()+"\n El lado es: " 
                +getLadoDos()+ "\n El perímetro es: " +getPerimetro()+ "\n El área es " +getArea();
    }
}
