package Entidad;

import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Fecha {

    public int dia;
    public int mes;
    public int año;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + '}';
    }
    Scanner leer = new Scanner(System.in);
    int d, m, a;

    public void IngresarFecha() {
        do {
            System.out.println("Ingrese el dia");
            d = leer.nextInt();
            if (d < 1 || d > 31) {
                System.out.println("Ingrese un dia correcto");
            }
        } while (d < 1 || d > 31);
        do {
            System.out.println("Ingrese el mes");
            m = leer.nextInt();
            if (m == 2 && d > 29) {
                System.out.println("No puede ser ese mes, ya que Febrero no puede tener mas de 29 dias...");
                m = 0;
            }
            if (d == 31) {
                if (m == 4 || m == 6 || m == 9 || m == 11) {
                    System.out.println("No corresponde la cantidad de dias para el mes que esta ingresando...");
                    m = 0;
                }
            }
            if (m < 1 || m > 12) {
                System.out.println("Ingrese un mes correcto");
            }
        } while (m < 1 || m > 12);
        int bandera;
        do {
            bandera = 0;
            System.out.println("Ingrese el año");
            a = leer.nextInt();
            if (!VerificarAño()) {
                System.out.println("Año no Bisiesto");
                if (m == 2 && d > 28) {
                    System.out.println("Al ser un año no Bisiesto, Febrero no puede tener 29 dias...");
                    bandera = 1;
                }
            } else {
                System.out.println("Año Bisisesto");
            }
        } while (bandera == 1);

        System.out.println("La fecha ingresada es: " + d + "/" + m + "/" + a);
        VerificarMes();
    }

    public void VerificarMes() {
        switch (m) {
            case 1:
                System.out.println("Enero Tiene 31 dias");
                break;
            case 2:
                if (VerificarAño()) {
                    System.out.println("Febrero Tiene 29 dias");
                } else {
                    System.out.println("Febrero Tiene 28 dias");
                }
                break;
            case 3:
                System.out.println("Marzo Tiene 31 dias");
                break;
            case 4:
                System.out.println("Abril Tiene 30 dias");
                break;
            case 5:
                System.out.println("Mayo Tiene 31 dias");
                break;
            case 6:
                System.out.println("Junio Tiene 30 dias");
                break;
            case 7:
                System.out.println("Julio Tiene 31 dias");
                break;
            case 8:
                System.out.println("Agosto Tiene 31 dias");
                break;
            case 9:
                System.out.println("Septiembre Tiene 30 dias");
                break;
            case 10:
                System.out.println("Octubre Tiene 31 dias");
                break;
            case 11:
                System.out.println("Noviembre Tiene 30 dias");
                break;
            case 12:
                System.out.println("Diciembre Tiene 31 dias");
                break;
        }
    }

    public boolean VerificarAño() {
        boolean bisiesto = false;
        if (a < 1900 || a > 2021) {
            System.out.println("El año ingresado no esta dentro de los parametros...");
            System.out.println("Se tomara como año el 1900");
            a = 1900;
        }
        if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
            bisiesto = true;
        }
        return bisiesto;
    }

    public void MostrarFechaAnterior() {
        if (m == 1 && dia == 1) {
            System.out.println("La fecha anterior es: 31/12/" + (a - 1));
        }
        if ((m == 5 || m == 7 || m == 10) && d == 1) {
            System.out.println("La fecha anterior es 30/" + (m - 1) + "/" + a);
        }
        if (m == 8 && d == 1) {
            System.out.println("La fecha anterior es 31/" + (m - 1) + "/" + a);
        }
        if (m == 3 && d == 1) {
            if (VerificarAño()) {
                System.out.println("La fecha anterior es 29/" + (m - 1) + "/" + a);
            } else {
                System.out.println("La fecha anterior es 28/" + (m - 1) + "/" + a);
            }
        }
        if ((m == 2 || m == 4 || m == 6 || m == 9 || m == 11) && d == 1) {
            System.out.println("La fecha anterior es 31/" + (m - 1) + "/" + a);
        }
        if (d != 1) {
            System.out.println("La fecha anterior es: " + (d - 1) + "/" + m + "/" + a);
        }
    }

    public void MostrarFechaPosterior() {
        if (d == 31 && m == 12) {
            System.out.println("La fecha posterior es 01/01/" + (a + 1));
        }
        if ((m == 1 || m == 3 || m == 5 || m == 8 || m == 10) && d == 31) {
            System.out.println("La fecha posterior es 01/" + (m + 1) + "/" + a);
        }
        if (m == 2) {
            if (d == 28) {
                if (VerificarAño()) {
                    System.out.println("La fecha posterior es 29/" + m + "/" + a);
                } else {
                    System.out.println("La fecha posterior es 01/" + (m + 1) + "/" + a);
                }
            }
            if (d == 29) {
                if (VerificarAño()) {
                    System.out.println("La fecha posterior es 01/" + (m + 1) + "/" + a);
                }
            }
            if (d != 28 && d != 29) {
                System.out.println("La fecha posterior es: " + (d + 1) + "/" + m + "/" + a);
            }
        }
        if ((m == 4 || m == 6 || m == 9 || m == 11) && d == 30) {
            System.out.println("La fecha posterior es 01/" + (m + 1) + "/" + a);
        }
        if ((d != 30 && d != 31) && m != 2) {
            System.out.println("La fecha posterior es: " + (d + 1) + "/" + m + "/" + a);
        }
    }
}
