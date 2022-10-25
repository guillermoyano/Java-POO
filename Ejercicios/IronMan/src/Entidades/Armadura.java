package Entidades;

public class Armadura {

    private int botaDerecha, botaIzquierda, guanteDerecho, guanteIzquierdo;
    private int consola, sintetizador, nivelSalud, energia, distancia, resistencia;
    float bateria;
    double reactor1, reactor2;
    public boolean botaDerechaOk=true, guanteDerechoOk=true; 
    public boolean botaIzquierdaOk=true, guanteIzquierdoOk=true;
    public boolean consolaOk=true, sintetizadorOk=true;
    public boolean nivelSaludOk=true, energiaOk=true;
    

    public Armadura() {
        this.botaDerecha = 100000;
        this.botaIzquierda = 100000;
        this.guanteDerecho = 100000;
        this.guanteIzquierdo = 100000;
        this.consola = 10000000;
        this.sintetizador = 10000000;
        this.nivelSalud = 100000;
        this.energia = 100000;
        this.bateria = 999999999;
        this.reactor1 = 100000;
        this.reactor2 = 238900000;
        this.resistencia = 100;
    }

    public Armadura(int botaDerecha, int botaIzquierda, int guanteDerecho, int guanteIzquierdo, int consola, int sintetizador, int nivelSalud, int energia, int distancia, int resistencia, float bateria, double reactor1, double reactor2) {
        this.botaDerecha = botaDerecha;
        this.botaIzquierda = botaIzquierda;
        this.guanteDerecho = guanteDerecho;
        this.guanteIzquierdo = guanteIzquierdo;
        this.consola = consola;
        this.sintetizador = sintetizador;
        this.nivelSalud = nivelSalud;
        this.energia = energia;
        this.distancia = distancia;
        this.resistencia = resistencia;
        this.bateria = bateria;
        this.reactor1 = reactor1;
        this.reactor2 = reactor2;
    }

    public int getBotaDerecha() {
        return botaDerecha;
    }

    public void setBotaDerecha(int botaDerecha) {
        this.botaDerecha = botaDerecha;
    }

    public int getBotaIzquierda() {
        return botaIzquierda;
    }

    public void setBotaIzquierda(int botaIzquierda) {
        this.botaIzquierda = botaIzquierda;
    }

    public int getGuanteDerecho() {
        return guanteDerecho;
    }

    public void setGuanteDerecho(int guanteDerecho) {
        this.guanteDerecho = guanteDerecho;
    }

    public int getGuanteIzquierdo() {
        return guanteIzquierdo;
    }

    public void setGuanteIzquierdo(int guanteIzquierdo) {
        this.guanteIzquierdo = guanteIzquierdo;
    }

    public int getConsola() {
        return consola;
    }

    public void setConsola(int consola) {
        this.consola = consola;
    }

    public int getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(int sintetizador) {
        this.sintetizador = sintetizador;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    public double getReactor1() {
        return reactor1;
    }

    public void setReactor1(double reactor1) {
        this.reactor1 = reactor1;
    }

    public double getReactor2() {
        return reactor2;
    }

    public void setReactor2(double reactor2) {
        this.reactor2 = reactor2;
    }

    public boolean isBotaDerechaOk() {
        return botaDerechaOk;
    }

    public void setBotaDerechaOk(boolean botaDerechaOk) {
        this.botaDerechaOk = botaDerechaOk;
    }

    public boolean isGuanteDerechoOk() {
        return guanteDerechoOk;
    }

    public void setGuanteDerechoOk(boolean guanteDerechoOk) {
        this.guanteDerechoOk = guanteDerechoOk;
    }

    public boolean isBotaIzquierdaOk() {
        return botaIzquierdaOk;
    }

    public void setBotaIzquierdaOk(boolean botaIzquierdaOk) {
        this.botaIzquierdaOk = botaIzquierdaOk;
    }

    public boolean isGuanteIzquierdoOk() {
        return guanteIzquierdoOk;
    }

    public void setGuanteIzquierdoOk(boolean guanteIzquierdoOk) {
        this.guanteIzquierdoOk = guanteIzquierdoOk;
    }

    public boolean isConsolaOk() {
        return consolaOk;
    }

    public void setConsolaOk(boolean consolaOk) {
        this.consolaOk = consolaOk;
    }

    public boolean isSintetizadorOk() {
        return sintetizadorOk;
    }

    public void setSintetizadorOk(boolean sintetizadorOk) {
        this.sintetizadorOk = sintetizadorOk;
    }

    public boolean isNivelSaludOk() {
        return nivelSaludOk;
    }

    public void setNivelSaludOk(boolean nivelSaludOk) {
        this.nivelSaludOk = nivelSaludOk;
    }

    public boolean isEnergiaOk() {
        return energiaOk;
    }

    public void setEnergiaOk(boolean energiaOk) {
        this.energiaOk = energiaOk;
    }

    @Override
    public String toString() {
        return "Armadura{" + "botaDerecha=" + botaDerecha + ", botaIzquierda=" + botaIzquierda + ", guanteDerecho=" + guanteDerecho + ", guanteIzquierdo=" + guanteIzquierdo + ", consola=" + consola + ", sintetizador=" + sintetizador + ", nivelSalud=" + nivelSalud + ", energia=" + energia + ", distancia=" + distancia + ", resistencia=" + resistencia + ", bateria=" + bateria + ", reactor1=" + reactor1 + ", reactor2=" + reactor2 + ", botaDerechaOk=" + botaDerechaOk + ", guanteDerechoOk=" + guanteDerechoOk + ", botaIzquierdaOk=" + botaIzquierdaOk + ", guanteIzquierdoOk=" + guanteIzquierdoOk + ", consolaOk=" + consolaOk + ", sintetizadorOk=" + sintetizadorOk + ", nivelSaludOk=" + nivelSaludOk + ", energiaOk=" + energiaOk + '}';
    }

    
}
