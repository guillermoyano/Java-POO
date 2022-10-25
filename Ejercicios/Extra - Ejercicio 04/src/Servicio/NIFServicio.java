package Servicio;

import Entidades.NIF;
import java.util.Scanner;

public class NIFServicio {

    String vector[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",
        "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    Scanner leer = new Scanner(System.in);
    
    public void crearNIF(NIF n){
        System.out.println("Ingrese el DNI");
        n.setDNI(leer.nextLong());
        int num = (int) n.getDNI()%23;
        n.setLetra(vector[num]);
    }
    
    public void mostrar(NIF n){
        String formato = String.format("%08d", n.getDNI());
        
        System.out.println(formato+"-"+n.getLetra());
    }
}
