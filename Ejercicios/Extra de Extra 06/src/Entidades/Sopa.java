package Entidades;

/**
 *
 * @author Guillote
 */
public class Sopa {
    
    public String matriz [][]; 
    public String palabra;

    public Sopa() {
        this.matriz = new String [10][10];
    }

    public Sopa(String[][] matriz, String palabra) {
        this.matriz = matriz;
        this.palabra = palabra;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    

}
