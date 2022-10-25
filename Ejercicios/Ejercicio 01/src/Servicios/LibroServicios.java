/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas
*/

package Servicios;

import Entidades.Libro;
import java.util.Scanner;

public class LibroServicios {
    
    public Libro altaLibro(){
        Libro l1 = new Libro();
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese el número de ISBN");
        l1.setISBN(leer.nextInt());
        System.out.println("Ingrese el título del libro");
        l1.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del autor");
        l1.setAutor(leer.next());
        System.out.println("Ingrese la cantidad de páginas");
        l1.setnPaginas(leer.nextInt());
        
        return l1;
    }
    
    public void mostrar(Libro l1){
        System.out.println("El número de ISBN es " +l1.getISBN()+ ", el nombre del libro es "
        +l1.getTitulo()+ ", el autor es " +l1.getAutor()+ " y la cantidad de páginas " +l1.getnPaginas());
    }
    
}
