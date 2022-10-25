/*
Crear una clase Pass, donde declaremos los siguientes atributos:
● pass : Del tipo String
● nombre: Del tipo String
● dni: Del tipo int.

 */
package Entidades;

public class Pass {

    public String pass;
    public String nombre;
    public int DNI;
    public String vectorPass[];

    public Pass() {
        this.nombre = "Elthon Jhon";
        this.DNI = 12345678;
    }

    public Pass(String pass, String nombre, int DNI, String[] vectorPass) {
        this.pass = pass;
        this.nombre = nombre;
        this.DNI = DNI;
        this.vectorPass = vectorPass;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String[] getVectorPass() {
        return vectorPass;
    }

    public void setVectorPass(String[] vectorPass) {
        this.vectorPass = vectorPass;
    }

    @Override
    public String toString() {
        return "Pass{" + "pass=" + pass + ", nombre=" + nombre + ", DNI=" + DNI + ", vectorPass=" + vectorPass + '}';
    }
}

    
