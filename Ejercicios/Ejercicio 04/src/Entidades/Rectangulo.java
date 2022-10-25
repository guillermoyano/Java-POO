/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con 
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la 
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la 
altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package Entidades;

import java.util.Scanner;

public class Rectangulo {
    
    Scanner leer = new Scanner (System.in);
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    //La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
    
    public void crearRectangulo(Rectangulo r1){
        System.out.println("Ingrese el tamaño de la base");
        r1.setBase(leer.nextInt());
        System.out.println("Ingrese el tamaño de la altura");
        r1.setAltura(leer.nextInt());
        
    }
    
    //También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.

    public void superficie(Rectangulo r1){
        int superficie;
        
        superficie = r1.getBase()*r1.getAltura();
        
        System.out.println("La superficie es igual a: " +superficie);
    }
    
    public void perimetro(Rectangulo r1){
        int perimetro;
        
        perimetro = (r1.getBase()+r1.getAltura())*2;
        
        System.out.println("El perimetro es igual a: " +perimetro);
    }
    
    public void asteriscos(Rectangulo r1){
        for (int i = 0; i < r1.getAltura(); i++) {
            for (int j = 0; j < r1.getBase(); j++) {
                if (i > 0 && i < r1.getAltura()-1 && j > 0 && j < r1.getBase()-1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }

            }
            System.out.println("");
        }
    }
    
    
}
