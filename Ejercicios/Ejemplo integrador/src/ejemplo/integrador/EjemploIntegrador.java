package ejemplo.integrador;

import Entidades.Vendedor;
import Servicios.VendedorServicio;

public class EjemploIntegrador {

    public static void main(String[] args) {
        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.altaVendedor();
        vs.SueldoMensual(v1);
        vs.vacaciones(v1);
    }
    
}
