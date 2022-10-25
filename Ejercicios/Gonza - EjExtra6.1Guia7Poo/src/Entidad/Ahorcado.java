package Entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*/*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.*/
public class Ahorcado {

    public String palabra;
    public String vectorasteriscos[];
    public String vectorpalabra[];
    public int letrasencontradas;
    public int jugadasmaximas;

    public Ahorcado() {
    }

    public Ahorcado(String palabra, String[] vectorasteriscos, String[] vectorpalabra, int letrasencontradas, int jugadasmaximas) {
        this.palabra = palabra;
        this.vectorasteriscos = vectorasteriscos;
        this.vectorpalabra = vectorpalabra;
        this.letrasencontradas = letrasencontradas;
        this.jugadasmaximas = jugadasmaximas;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String[] getVectorasteriscos() {
        return vectorasteriscos;
    }

    public void setVectorasteriscos(String[] vectorasteriscos) {
        this.vectorasteriscos = vectorasteriscos;
    }

    public String[] getVectorpalabra() {
        return vectorpalabra;
    }

    public void setVectorpalabra(String[] vectorpalabra) {
        this.vectorpalabra = vectorpalabra;
    }

    public int getLetrasencontradas() {
        return letrasencontradas;
    }

    public void setLetrasencontradas(int letrasencontradas) {
        this.letrasencontradas = letrasencontradas;
    }

    public int getJugadasmaximas() {
        return jugadasmaximas;
    }

    public void setJugadasmaximas(int jugadasmaximas) {
        this.jugadasmaximas = jugadasmaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", vectorasteriscos=" + vectorasteriscos + ", vectorpalabra=" + vectorpalabra + ", letrasencontradas=" + letrasencontradas + ", jugadasmaximas=" + jugadasmaximas + '}';
    }

}
