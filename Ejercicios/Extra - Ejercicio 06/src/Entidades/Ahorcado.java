package Entidades;

public class Ahorcado {

    public String palabra, letra;
    public String vectorLineas[];
    public String vectorPalabra[];
    public int letrasEncontradas, jugadasmaximas, contadoruno,contadordos, contadortres;
    

    public Ahorcado() {
    }

    public Ahorcado(String palabra, String letra, String[] vectorLineas, String[] vectorPalabra, int letrasEncontradas, int jugadasmaximas, int contadoruno, int contadordos, int contadortres) {
        this.palabra = palabra;
        this.letra = letra;
        this.vectorLineas = vectorLineas;
        this.vectorPalabra = vectorPalabra;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasmaximas = jugadasmaximas;
        this.contadoruno = contadoruno;
        this.contadordos = contadordos;
        this.contadortres = contadortres;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String[] getVectorLineas() {
        return vectorLineas;
    }

    public void setVectorLineas(String[] vectorLineas) {
        this.vectorLineas = vectorLineas;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasmaximas() {
        return jugadasmaximas;
    }

    public void setJugadasmaximas(int jugadasmaximas) {
        this.jugadasmaximas = jugadasmaximas;
    }

    public int getContadoruno() {
        return contadoruno;
    }

    public void setContadoruno(int contadoruno) {
        this.contadoruno = contadoruno;
    }

    public int getContadordos() {
        return contadordos;
    }

    public void setContadordos(int contadordos) {
        this.contadordos = contadordos;
    }

    public int getContadortres() {
        return contadortres;
    }

    public void setContadortres(int contadortres) {
        this.contadortres = contadortres;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", letra=" + letra + ", vectorLineas=" + vectorLineas + ", vectorPalabra=" + vectorPalabra + ", letrasEncontradas=" + letrasEncontradas + ", jugadasmaximas=" + jugadasmaximas + ", contadoruno=" + contadoruno + ", contadordos=" + contadordos + ", contadortres=" + contadortres + '}';
    }

    
    
}
