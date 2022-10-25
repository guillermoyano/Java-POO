package mascotapp;

import Servicio.MascotaServicio;
import java.util.Scanner;
import mascotapp.entidades.Mascota;

public class MascotAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Mascota m1 = new Mascota("Toto", "Chiquito", "Perro");
        MascotaServicio ms = new MascotaServicio();
        
        /*
        m1.setNombre(" Pepe Toto");
        
        m1.pasear(100);
        
        System.out.println(m1);
        */
        
        ms.CrearMascota();
        ms.mostrarMascotas();
        
      
    }

}
