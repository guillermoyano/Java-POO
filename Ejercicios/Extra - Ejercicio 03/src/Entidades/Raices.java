package Entidades;

/**
 *
 * @author Guillote
 */
public class Raices {
public double a;
    public double b;
    public double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double GetDiscriminante() {
        double resul = Math.pow(b, 2) - (4 * a * c);
        return resul;
    }

    public boolean TieneRaices() {
        boolean resp = false;
        if (GetDiscriminante() > 0) {
            resp = true;
        }
        return resp;
    }

    public boolean TieneRaiz() {
        boolean resp = false;
        if (GetDiscriminante() == 0) {
            resp = true;
        }
        return resp;
    }

    public void ObtieneRaices() {
        if (TieneRaices()) {
            System.out.println("Tiene 2 Raices, 2 soluciones");
        }
    }

    public void ObtieneRaiz() {
        if (TieneRaiz()) {
            System.out.println("Tiene 1 Raiz, 1 solucion");
        }
    }

    public void Calcular() {
        double x1;
        double x2;
        if (TieneRaices()) {
            x1 = (-(b) + (Math.sqrt(GetDiscriminante()))) / 2 * a;
            x2 = (-(b) - (Math.sqrt(GetDiscriminante()))) / 2 * a;
            System.out.println("Raiz x1 = "+x1);
            System.out.println("Raiz x2 = "+x2);
        } else if (TieneRaiz()) {
            x1 = (-(b) + (Math.sqrt(GetDiscriminante()))) / 2 * a;
            System.out.println("Raiz = "+x1);
        } else {
            System.out.println("No tiene solucion");
        }
    }
}