package Servicio;

import Entidades.Fecha;
import java.util.Scanner;

public class FechaServicio {

    Scanner leer = new Scanner(System.in);
    Fecha f = new Fecha();
    int contador = 0;

    public void fecha() {
        System.out.println("Ingrese el día");
        f.setDia(leer.nextInt());
        System.out.println("Ingrese el mes (escrito en números)");
        f.setMes(leer.nextInt());
        System.out.println("Ingrese el año");
        f.setAnio(leer.nextInt());
    }

    public void validarAnio() {

        if (f.getAnio() < 1900 || f.getAnio() > 2021) {
            f.setAnio(1900);
        }
        System.out.println("Quedó el año seteado: " + f.getAnio());

        if (f.getAnio() % 4 == 0 && f.getAnio() % 100 != 0 || f.getAnio() % 400 == 0) {
            System.out.println("......................................................................");
            System.out.println("Es un año bisiesto");
            System.out.println("......................................................................");
            contador = 1;
        } else {
            System.out.println("......................................................................");
            System.out.println("No es un año bisiesto");
            System.out.println("......................................................................");
            contador = 0;
        }
    }

    public void validarMesyDia() {

        while (f.getMes() > 12 || f.getMes() <= 0) {
            System.out.println("Incorrecto. Los meses van desde Enero(01) hasta diciembre(12)");
            System.out.println("Ingrese el mes correcto(escrito en números)");
            f.setMes(leer.nextInt());
        }

        switch (f.getMes()) {
            case 1:
                System.out.println("Quedó el mes seteado en 0" + f.getMes() + "(Enero)");
                System.out.println("......................................................................");
                System.out.println("Este mes tiene 31 días");
                while (f.getDia() > 31 || f.getDia() <= 0) {
                    System.out.println("Ingreso incorrectamente el día");
                    System.out.println("Intente otra vez");
                    f.setDia(leer.nextInt());
                }
                System.out.println("......................................................................");
                System.out.println("Ingresó la fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
                System.out.println("......................................................................");
                if (f.getDia() == 01) {
                    System.out.println("El día anterior es: 31/12/" + (f.getAnio() - 1));
                } else {
                    System.out.println("El día anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                System.out.println("......................................................................");
                if (f.getDia() == 31) {
                    System.out.println("El día posterior es: 01/" + (f.getMes() + 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                break;

            case 2:
                System.out.println("Quedó el mes seteado en 0" + f.getMes() + "(Febrero)");
                if (contador == 1) {
                    System.out.println("Ese año febrero tuvo 29 días");
                    System.out.println("......................................................................");
                    while (f.getDia() > 29 || f.getDia() <= 0) {
                        System.out.println("Ingreso incorrectamente el día");
                        System.out.println("Intente otra vez");
                        f.setDia(leer.nextInt());
                    }
                } else if (contador == 0) {
                    System.out.println("Ese año febrero tuvo 28 días");
                    System.out.println("......................................................................");
                    while (f.getDia() > 28 || f.getDia() <= 0) {
                        System.out.println("Ingreso incorrectamente el día");
                        System.out.println("Intente otra vez");
                        f.setDia(leer.nextInt());
                    }
                }
                System.out.println("......................................................................");
                System.out.println("Ingresó la fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
                System.out.println("......................................................................");
                if (f.getDia() == 01) {
                    System.out.println("El día anterior es: 31/" + (f.getMes() - 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                System.out.println("......................................................................");

                if (f.getDia() == 28 && contador == 0) {
                    System.out.println("El día posterior es: 01/" + (f.getMes() + 1) + "/" + f.getAnio());
                } else if (f.getDia() == 29 && contador == 1) {
                    System.out.println("El día posterior es: 01/" + (f.getMes() + 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                break;
            case 3:
                System.out.println("Quedó el mes seteado en 0" + f.getMes() + "(Marzo)");
                System.out.println("......................................................................");
                System.out.println("Este mes tiene 31 días");
                while (f.getDia() > 31 || f.getDia() <= 0) {
                    System.out.println("Ingreso incorrectamente el día");
                    System.out.println("Intente otra vez");
                    f.setDia(leer.nextInt());
                }
                System.out.println("......................................................................");
                System.out.println("Ingresó la fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
                System.out.println("......................................................................");
                if (f.getDia() == 01 && contador == 0) {
                    System.out.println("El día anterior es: 28/" + (f.getMes() - 1) + "/" + f.getAnio());
                } else if (f.getDia() == 01 && contador == 1) {
                    System.out.println("El día anterior es: 29/" + (f.getMes() - 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                System.out.println("......................................................................");
                if (f.getDia() == 31) {
                    System.out.println("El día posterior es: 01/" + (f.getMes() + 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                break;
            case 4:
                System.out.println("Quedó el mes seteado en 0" + f.getMes() + "(Abril)");
                System.out.println("......................................................................");
                System.out.println("Este mes tiene 30 días");
                while (f.getDia() > 30 || f.getDia() <= 0) {
                    System.out.println("Ingreso incorrectamente el día");
                    System.out.println("Intente otra vez");
                    f.setDia(leer.nextInt());
                }
                System.out.println("......................................................................");
                System.out.println("Ingresó la fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
                System.out.println("......................................................................");
                if (f.getDia() == 01) {
                    System.out.println("El día anterior es: 31/" + (f.getMes() - 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                System.out.println("......................................................................");
                if (f.getDia() == 30) {
                    System.out.println("El día posterior es: 01/" + (f.getMes() + 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                break;
            case 5:
                System.out.println("Quedó el mes seteado en 0" + f.getMes() + "(Mayo)");
                System.out.println("......................................................................");
                System.out.println("Este mes tiene 31 días");
                while (f.getDia() > 31 || f.getDia() <= 0) {
                    System.out.println("Ingreso incorrectamente el día");
                    System.out.println("Intente otra vez");
                    f.setDia(leer.nextInt());
                }
                System.out.println("......................................................................");
                System.out.println("Ingresó la fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
                System.out.println("......................................................................");
                if (f.getDia() == 01) {
                    System.out.println("El día anterior es: 30/" + (f.getMes() - 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                System.out.println("......................................................................");
                if (f.getDia() == 31) {
                    System.out.println("El día posterior es: 01/" + (f.getMes() + 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                break;
            case 6:
                System.out.println("Quedó el mes seteado en 0" + f.getMes() + "(Junio)");
                System.out.println("......................................................................");
                System.out.println("Este mes tiene 30 días");
                while (f.getDia() > 30 || f.getDia() <= 0) {
                    System.out.println("Ingreso incorrectamente el día");
                    System.out.println("Intente otra vez");
                    f.setDia(leer.nextInt());
                }
                System.out.println("......................................................................");
                System.out.println("Ingresó la fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
                System.out.println("......................................................................");
                if (f.getDia() == 01) {
                    System.out.println("El día anterior es: 31/" + (f.getMes() - 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                System.out.println("......................................................................");
                if (f.getDia() == 30) {
                    System.out.println("El día posterior es: 01/" + (f.getMes() + 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                break;
            case 7:
                System.out.println("Quedó el mes seteado en 0" + f.getMes() + "(Julio)");
                System.out.println("......................................................................");
                System.out.println("Este mes tiene 31 días");
                while (f.getDia() > 31 || f.getDia() <= 0) {
                    System.out.println("Ingreso incorrectamente el día");
                    System.out.println("Intente otra vez");
                    f.setDia(leer.nextInt());
                }
                System.out.println("......................................................................");
                System.out.println("Ingresó la fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
                System.out.println("......................................................................");
                if (f.getDia() == 01) {
                    System.out.println("El día anterior es: 30/" + (f.getMes() - 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                System.out.println("......................................................................");
                if (f.getDia() == 31) {
                    System.out.println("El día posterior es: 01/" + (f.getMes() + 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                break;
            case 8:
                System.out.println("Quedó el mes seteado en 0" + f.getMes() + "(Agosto)");
                System.out.println("......................................................................");
                System.out.println("Este mes tiene 31 días");
                while (f.getDia() > 31 || f.getDia() <= 0) {
                    System.out.println("Ingreso incorrectamente el día");
                    System.out.println("Intente otra vez");
                    f.setDia(leer.nextInt());
                }
                System.out.println("......................................................................");
                System.out.println("Ingresó la fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
                System.out.println("......................................................................");
                if (f.getDia() == 01) {
                    System.out.println("El día anterior es: 31/" + (f.getMes() - 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                System.out.println("......................................................................");
                if (f.getDia() == 31) {
                    System.out.println("El día posterior es: 01/" + (f.getMes() + 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                break;
            case 9:
                System.out.println("Quedó el mes seteado en 0" + f.getMes() + "(Septiembre)");
                System.out.println("......................................................................");
                System.out.println("Este mes tiene 30 días");
                while (f.getDia() > 30 || f.getDia() <= 0) {
                    System.out.println("Ingreso incorrectamente el día");
                    System.out.println("Intente otra vez");
                    f.setDia(leer.nextInt());
                }
                System.out.println("......................................................................");
                System.out.println("Ingresó la fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
                System.out.println("......................................................................");
                if (f.getDia() == 01) {
                    System.out.println("El día anterior es: 31/" + (f.getMes() - 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                System.out.println("......................................................................");
                if (f.getDia() == 30) {
                    System.out.println("El día posterior es: 01/" + (f.getMes() + 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                break;
            case 10:
                System.out.println("Quedó el mes seteado en " + f.getMes() + "(Octubre)");
                System.out.println("......................................................................");
                System.out.println("Este mes tiene 31 días");
                while (f.getDia() > 31 || f.getDia() <= 0) {
                    System.out.println("Ingreso incorrectamente el día");
                    System.out.println("Intente otra vez");
                    f.setDia(leer.nextInt());
                }
                System.out.println("......................................................................");
                System.out.println("Ingresó la fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
                System.out.println("......................................................................");
                if (f.getDia() == 01) {
                    System.out.println("El día anterior es: 30/" + (f.getMes() - 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                System.out.println("......................................................................");
                if (f.getDia() == 31) {
                    System.out.println("El día posterior es: 01/" + (f.getMes() + 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                break;
            case 11:
                System.out.println("Quedó el mes seteado en " + f.getMes() + "(Noviembre)");
                System.out.println("......................................................................");
                System.out.println("Este mes tiene 30 días");
                while (f.getDia() > 30 || f.getDia() <= 0) {
                    System.out.println("Ingreso incorrectamente el día");
                    System.out.println("Intente otra vez");
                    f.setDia(leer.nextInt());
                }
                System.out.println("......................................................................");
                System.out.println("Ingresó la fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
                System.out.println("......................................................................");
                if (f.getDia() == 01) {
                    System.out.println("El día anterior es: 31/" + (f.getMes() - 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                System.out.println("......................................................................");
                if (f.getDia() == 30) {
                    System.out.println("El día posterior es: 01/" + (f.getMes() + 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                break;
            case 12:
                System.out.println("Quedó el mes seteado en " + f.getMes() + "(Diciembre)");
                System.out.println("......................................................................");
                System.out.println("Este mes tiene 31 días");
                while (f.getDia() > 31 || f.getDia() <= 0) {
                    System.out.println("Ingreso incorrectamente el día");
                    System.out.println("Intente otra vez");
                    f.setDia(leer.nextInt());
                }
                System.out.println("......................................................................");
                System.out.println("Ingresó la fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
                System.out.println("......................................................................");
                if (f.getDia() == 01) {
                    System.out.println("El día anterior es: 30/" + (f.getMes() - 1) + "/" + f.getAnio());
                } else {
                    System.out.println("El día anterior es: " + (f.getDia() - 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                System.out.println("......................................................................");
                if (f.getDia() == 31) {
                    System.out.println("El día posterior es: 1/1/" + (f.getAnio() + 1));
                } else {
                    System.out.println("El día posterior es: " + (f.getDia() + 1) + "/" + f.getMes() + "/" + f.getAnio());
                }
                break;
        }
    }
}
