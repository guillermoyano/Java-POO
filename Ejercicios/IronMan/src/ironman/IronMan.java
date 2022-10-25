package ironman;

import Sevicio.ArmaduraServicio;
import java.util.Scanner;

public class IronMan {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArmaduraServicio as = new ArmaduraServicio();

        as.estado();
        //as.menu();

        int accion = 0;
        do {
            System.out.println("Menú acciones");
            System.out.println("1) Caminar");
            System.out.println("2) Correr");
            System.out.println("3) Volar");
            System.out.println("4) Propulsar");
            System.out.println("5) Usar guantes");
            System.out.println("6) Radar");
            System.out.println("7) Destruyendo enemigo");
            System.out.println("8) Acción evasiva");
            System.out.println("9) Estado de la batería");
            System.out.println("10) Información del reactor");
            accion = leer.nextInt();
            switch (accion) {
                case 1://caminar
                    as.sufriendoDaniosBotasDerecha();
                    if (as.energia() == true) {
                        break;
                    }
                    as.sufriendoDaniosBotasIzquierda();
                    if (as.energia() == true) {
                        break;
                    }
                    as.reparandoDaniosBotasDerecha();
                    if (as.energia() == true) {
                        break;
                    }
                    as.reparandoDaniosBotasIzquierdo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.revisarDispositivo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.gastarEnergiaCaminar();
                    if (as.energia() == true) {
                        break;
                    }
                    break;
                case 2://correr
                    as.sufriendoDaniosBotasDerecha();
                    if (as.energia() == true) {
                        break;
                    }
                    as.sufriendoDaniosBotasIzquierda();
                    if (as.energia() == true) {
                        break;
                    }
                    as.reparandoDaniosBotasDerecha();
                    if (as.energia() == true) {
                        break;
                    }
                    as.reparandoDaniosBotasIzquierdo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.revisarDispositivo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.gastarEnergiaCorrer();
                    if (as.energia() == true) {
                        break;
                    }
                    break;
                case 3://volar
                    as.sufriendoDaniosBotasDerecha();
                    if (as.energia() == true) {
                        break;
                    }
                    as.sufriendoDaniosBotasIzquierda();
                    if (as.energia() == true) {;
                        break;
                    }
                    as.reparandoDaniosBotasDerecha();
                    if (as.energia() == true) {
                        break;
                    }
                    as.reparandoDaniosBotasIzquierdo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.sufriendoDaniosGuantesDerecho();
                    if (as.energia() == true) {
                        break;
                    }
                    as.sufriendoDaniosGuantesIzquierdo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.reparandoDaniosGuantesDerecho();
                    if (as.energia() == true) {
                        break;
                    }
                    as.reparandoDaniosGuantesIzquierdo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.revisarDispositivo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.gasterEnergiaVolar();
                    if (as.energia() == true) {
                        break;
                    }
                    break;
                case 4://propulsar
                    as.sufriendoDaniosBotasDerecha();
                    if (as.energia() == true) {
                        break;
                    }
                    as.sufriendoDaniosBotasIzquierda();
                    if (as.energia() == true) {
                        break;
                    }
                    as.reparandoDaniosBotasDerecha();
                    if (as.energia() == true) {
                        break;
                    }
                    as.reparandoDaniosBotasIzquierdo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.revisarDispositivo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.gastarEnergiaPropulsar();
                    if (as.energia() == true) {
                        break;
                    }
                    break;
                case 5://Usar guantes
                    as.sufriendoDaniosGuantesDerecho();
                    if (as.energia() == true) {
                        break;
                    }
                    as.sufriendoDaniosGuantesIzquierdo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.reparandoDaniosGuantesDerecho();
                    if (as.energia() == true) {
                        break;
                    }
                    as.reparandoDaniosGuantesIzquierdo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.revisarDispositivo();
                    if (as.energia() == true) {
                        break;
                    }
                    as.guantesDisparar();
                    if (as.energia() == true) {
                        break;
                    }
                    break;
                case 6://radar
                    as.radar();
                    if (as.energia() == true) {
                        break;
                    }
                    break;
                case 7://Destruyendo Enemigo
                    as.destruyendoEnemigo();
                    if (as.energia() == true) {
                        break;
                    }
                    break;
                case 8://Estado general
                    as.estado();
                case 9://Estado de la batería
                    as.estadoBateria();
                case 10://Información del reactor
                    as.infoReactor();
                default:
            }
            if (as.energia() == true) {
                System.out.println("Está cansado y no puede ni mover un dedo");
                accion = 11;
            }
        } while (accion
                != 11);
    }

}
