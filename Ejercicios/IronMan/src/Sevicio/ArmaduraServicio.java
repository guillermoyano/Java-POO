package Sevicio;

import Entidades.Armadura;
import java.util.Scanner;

public class ArmaduraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Armadura a = new Armadura();
    int Matriz[][] = new int[10][5];
    boolean energy = false;

    public void estado() {

        System.out.println("El estado de la bota derecha es: " + a.getBotaDerecha() + "%");
        System.out.println("El estado de la bota izquierda es: " + a.getBotaIzquierda() + "%");
        System.out.println("El estado del guante derecho es: " + a.getGuanteDerecho() + "%");
        System.out.println("El estado del guante izquierdo es: " + a.getGuanteIzquierdo() + "%");
        System.out.println("El estado de la consola es: " + a.getConsola() + "%");
        System.out.println("El estado del sintetizador es: " + a.getSintetizador() + "%");
        System.out.println("El estado de salud es " + a.getNivelSalud() + "%");
        System.out.println("..................................");
        System.out.println("");

    }

    public void estadoBateria() {
        System.out.println("El estado de la batería es: " + a.getBateria() + "%");
        System.out.println("..................................");
        System.out.println("");
    }

    public void infoReactor() {
        System.out.println("El estado del reactor es " + a.getReactor1() + " Joules");
        System.out.println("El estado del reactor es " + a.getReactor2() + " Calorías");
        System.out.println("..................................");
        System.out.println("");
    }

    public void consolaSintetizador() {
        System.out.println("Se usó la pantalla y Jarvis habló");
        a.setBateria(a.getBateria() - 1000);
        System.out.println("...........................");
        System.out.println("Queda " + a.getBateria() + "% de batería");
        System.out.println("...........................");
        if (a.getBateria()<0){
            a.setBateria(0);
        }
    }

    public boolean energia() {
        if (a.getBateria() <= 0) {
            energy = true;
        }
        return energy;
    }

    public void sufriendoDaniosBotasIzquierda() {
        int zapatoIzquierdo = ((int) (Math.random() * 10));
        System.out.println(zapatoIzquierdo);
        if (zapatoIzquierdo <= 2) {
            a.botaIzquierdaOk = false;
            System.out.println("La bota izquierda está rota  -  sufriendoDanios");
            a.setBotaIzquierda(0);
            consolaSintetizador();
        } else {
            System.out.println("La bota izquierda está ok  -  sufriendoDanios");
            consolaSintetizador();
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosBotasDerecha() {
        int zapatoDerecho = ((int) (Math.random() * 10));
        System.out.println(zapatoDerecho);
        if (zapatoDerecho <= 2) {
            a.botaDerechaOk = false;
            System.out.println("La bota derecha está rota  -  sufriendoDanios");
            a.setBotaDerecha(0);
            consolaSintetizador();
        } else {
            System.out.println("La bota derecha está ok  -  sufriendoDanios");
            consolaSintetizador();
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosGuantesDerecho() {
        int manoDerecho = ((int) (Math.random() * 10));
        System.out.println(manoDerecho);
        if (manoDerecho <= 2) {
            a.guanteDerechoOk = false;
            System.out.println("El guante derecho está roto  -  sufriendoDanios");
            a.setGuanteDerecho(0);
            consolaSintetizador();
        } else {
            System.out.println("El guante derecho está ok  -  sufriendoDanios");
            consolaSintetizador();
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosGuantesIzquierdo() {
        int manoIzquierdo = ((int) (Math.random() * 10));
        System.out.println(manoIzquierdo);
        if (manoIzquierdo <= 2) {
            a.guanteIzquierdoOk = false;
            System.out.println("El guante izquierdo está roto  -  sufriendoDanios");
            a.setGuanteIzquierdo(0);
            consolaSintetizador();
        } else {
            System.out.println("El guante izqierdo está ok  -  sufriendoDanios");
            consolaSintetizador();
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosConsola() {
        int conso = ((int) (Math.random() * 10));
        System.out.println(conso);
        if (conso <= 2) {
            a.consolaOk = false;
            System.out.println("La consola está rota  -  sufriendoDanios");
            a.setConsola(0);
            consolaSintetizador();
        } else {
            System.out.println("La consola está ok  -  sufriendoDanios");
            consolaSintetizador();
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosSintetizador() {
        int sinte = ((int) (Math.random() * 10));
        System.out.println(sinte);
        if (sinte <= 2) {
            a.sintetizadorOk = false;
            System.out.println("El sintetizador está roto  -  sufriendoDanios");
            a.setSintetizador(0);
            consolaSintetizador();
        } else {
            System.out.println("El sintetizador derecho está ok  -  sufriendoDanios");
            consolaSintetizador();
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void sufriendoDaniosSalud() {
        int hp = ((int) (Math.random() * 10));
        System.out.println(hp);
        if (hp <= 2) {
            a.nivelSaludOk = false;
            System.out.println("El nivel de salud es ineficiente  -  sufriendoDanios");
            a.setNivelSalud(0);
            consolaSintetizador();
        } else {
            System.out.println("El nivel de salud es eficiente  -  sufriendoDanios");
            consolaSintetizador();
        }
        System.out.println("..................................");
        System.out.println("");
    }

    public void reparandoDaniosGuantesIzquierdo() {
        if (a.isGuanteIzquierdoOk()) {
            if (a.getGuanteIzquierdo() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("Se reparó el guante izquierdo  -  reparandoDanios");
                    consolaSintetizador();
                } else {
                    System.out.println("El guante izquierdo sigue roto  -  reparandoDanios");
                    consolaSintetizador();
                }
            }
        } else {
            System.out.println("No te había dicho que se rompió?? -  Guante izquierdo");
            consolaSintetizador();
        }
    }

    public void reparandoDaniosGuantesDerecho() {
        if (a.isGuanteDerechoOk()) {
            if (a.getGuanteDerecho() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("Se reparó el guante derecho  -  reparandoDanios");
                    consolaSintetizador();
                } else {
                    System.out.println("El guante derecho sigue roto  -  reparandoDanios");
                    consolaSintetizador();
                }
            }
        } else {
            System.out.println("No te había dicho que se rompió?? -  Guante derecho");
            consolaSintetizador();
        }
    }

    public void reparandoDaniosSalud() {
        if (a.isNivelSaludOk()) {
            if (a.getNivelSalud() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("El nivel de salud se recuperó  -  reparandoDanios");
                    consolaSintetizador();
                } else {
                    System.out.println("El estado de salud sigue siendo ineficiente  -  reparandoDanios");
                    consolaSintetizador();
                }
            }
        } else {
            System.out.println("No te había dicho que se murió?");
            consolaSintetizador();
        }
    }

    public void reparandoDaniosSintetizador() {
        if (a.isSintetizadorOk()) {
            if (a.getSintetizador() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("Se reparó el sintetizador  -  reparandoDanios");
                    consolaSintetizador();
                } else {
                    System.out.println("El sintetizador sigue roto  -  reparandoDanios");
                    consolaSintetizador();
                }
            }
        } else {
            System.out.println("No te había dicho que se rompió?? El sintetizador");
            consolaSintetizador();
        }
    }

    public void reparandoDaniosConsola() {
        if (a.isConsolaOk()) {
            if (a.getConsola() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("Se reparó la consola  -  reparandoDanios");
                    consolaSintetizador();
                } else {
                    System.out.println("La consola sigue rota  -  reparandoDanios");
                    consolaSintetizador();
                }
            }
        } else {
            System.out.println("No te había dicho que se rompió?? La consola");
            consolaSintetizador();
        }
    }

    public void reparandoDaniosBotasIzquierdo() {
        if (a.isBotaIzquierdaOk()) {
            if (a.getBotaIzquierda() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("Se reparó la bota izquierda  -  reparandoDanios");
                    consolaSintetizador();
                } else {
                    System.out.println("La bota izquierda sigue rota  -  reparandoDanios");
                    consolaSintetizador();
                }
            }
        } else {
            System.out.println("No te había dicho que se rompió?? La bota izquierda");
            consolaSintetizador();
        }
    }

    public void reparandoDaniosBotasDerecha() {
        if (a.isBotaDerechaOk()) {
            if (a.getBotaDerecha() == 0) {
                if ((int) (Math.random() * 10) <= 4) {
                    System.out.println("Se reparó la bota derecha  -  reparandoDanios");
                    consolaSintetizador();
                } else {
                    System.out.println("La bota derecha sigue rota  -  reparandoDanios");
                    consolaSintetizador();
                }
            }
        } else {
            System.out.println("No te había dicho que se rompió?? La bota derecha");
            consolaSintetizador();
        }
    }

    public void revisarDispositivo() {
        int intento = 0;

        do {
            if (a.isBotaDerechaOk()) {
                reparandoDaniosBotasDerecha();
            }
            if (a.isBotaIzquierdaOk()) {
                reparandoDaniosBotasIzquierdo();
            }
            if (a.isGuanteDerechoOk()) {
                reparandoDaniosGuantesDerecho();
            }
            if (a.isGuanteIzquierdoOk()) {
                reparandoDaniosGuantesIzquierdo();
            }
            if (a.isConsolaOk()) {
                reparandoDaniosConsola();
            }
            if (a.isEnergiaOk()) {
                reparandoDaniosSalud();
            }
            if (a.isSintetizadorOk()) {
                reparandoDaniosSintetizador();
            }
            intento = ((int) (Math.random() * 10));
        } while (intento == 1 || intento == 7 || intento == 5 || intento == 4 || intento == 9 || intento == 3 || intento == 6);

        if (a.getBotaDerecha() == 0) {
            System.out.println("Se rompió para siempre la bota derecha");
            a.setBotaDerechaOk(false);
            consolaSintetizador();
        }

        if (a.getBotaIzquierda() == 0) {
            System.out.println("Se rompió para siempre la bota izquierda");
            a.setBotaIzquierdaOk(false);
            consolaSintetizador();
        }

        if (a.getGuanteDerecho() == 0) {
            System.out.println("Se rompió para siempre el guante derecho");
            a.setGuanteDerechoOk(false);
            consolaSintetizador();
        }

        if (a.getGuanteIzquierdo() == 0) {
            System.out.println("Se rompió para siempre el guante izquierdo");
            a.setGuanteIzquierdoOk(false);
            consolaSintetizador();
        }

        if (a.getConsola() == 0) {
            System.out.println("Se rompió la consola para siempre");
            a.setConsolaOk(false);
            consolaSintetizador();
        }

        if (a.getNivelSalud() == 0) {
            System.out.println("Se murió");
            a.setNivelSaludOk(false);
            consolaSintetizador();
        }

        if (a.getSintetizador() == 0) {
            System.out.println("Se rompió el sintetizador para siemre");
            a.setSintetizadorOk(false);
            consolaSintetizador();
        }
    }

    public void gastarEnergiaCaminar() {
        int minutos;
        if (a.isBotaDerechaOk() || a.isBotaIzquierdaOk()) {
            System.out.println("Cuánto tiempo vas a estar caminando (en minutos)?");
            minutos = leer.nextInt();
            a.setReactor1(a.getReactor1() - (minutos / 10));
            a.setReactor2(a.getReactor2() - ((minutos / 10) * 0.2389));
            System.out.println("Te quedan " + a.getReactor1() + " Joules");
            System.out.println("..........................................");
            System.out.println("Te quedan " + a.getReactor2() + " Calorías");
            System.out.println("..........................................");
            consolaSintetizador();
            if (a.isBotaDerechaOk()) {
                a.setBateria(a.getBateria() - (minutos * 10000));
                consolaSintetizador();
            } else {
                System.out.println("Está rota, no se usa más la bota derecha");
                consolaSintetizador();
            }
            if (a.isBotaIzquierdaOk()) {
                a.setBateria(a.getBateria() - (minutos * 10000));
                consolaSintetizador();
            } else {
                System.out.println("Está rota, no se usa más la bota izquierda");
                consolaSintetizador();
            }
        } else {
            System.out.println("Sin piernas, no podés caminar");
            consolaSintetizador();
        }
    }

    public void gastarEnergiaCorrer() {
        int minutos;
        if (a.isBotaDerechaOk() || a.isBotaIzquierdaOk()) {
            System.out.println("Cuánto tiempo vas a estar corriendo (en minutos)?");
            minutos = leer.nextInt();
            a.setReactor1(a.getReactor1() - (minutos / 5));
            a.setReactor2(a.getReactor2() - ((minutos / 5) * 0.2389));
            System.out.println("Te quedan " + a.getReactor1() + " Joules");
            System.out.println("Te quedan " + a.getReactor2() + " Calorías");
            if (a.isBotaDerechaOk()) {
                a.setBateria(a.getBateria() - (minutos * 20000));
                consolaSintetizador();
            } else {
                System.out.println("Está rota, no se usa más la bota derecha");
            }
            if (a.isBotaIzquierdaOk()) {
                a.setBateria(a.getBateria() - (minutos * 20000));
                consolaSintetizador();
            } else {
                System.out.println("Está rota, no se usa más la bota izquierda");
            }
        } else {
            System.out.println("Sin piernas, no podés caminar");
        }
    }

    public void gasterEnergiaVolar() {
        int minutos;
        if ((a.isBotaDerechaOk() || a.isBotaIzquierdaOk() && (a.isGuanteDerechoOk() || a.isGuanteIzquierdoOk()))) {
            System.out.println("Cuántos minutos vas a estar volando?");
            minutos = leer.nextInt();
            a.setReactor1(a.getReactor1() - (minutos / 5));
            a.setReactor2(a.getReactor2() - ((minutos / 5) * 0.2389));
            System.out.println("Te quedan " + a.getReactor1() + " Joules");
            System.out.println("Te quedan " + a.getReactor2() + " Calorías");
            if (a.isBotaDerechaOk()) {
                a.setBateria(a.getBateria() - (minutos / 5000));
                consolaSintetizador();

            } else {
                System.out.println("Está rota, no se usa más la bota derecha");
                consolaSintetizador();
            }
            if (a.isBotaIzquierdaOk()) {
                a.setBateria(a.getBateria() - (minutos / 5000));
                consolaSintetizador();
            } else {
                System.out.println("Está rota, no se usa más la bota izquierda");
                consolaSintetizador();
            }
            if (a.isGuanteDerechoOk()) {
                a.setBateria(a.getBateria() - (minutos * 20000));
                consolaSintetizador();
            } else {
                System.out.println("Está roto, el guante derecho no se usa más");
                consolaSintetizador();
            }
            if (a.isGuanteIzquierdoOk()) {
                a.setBateria(a.getBateria() - (minutos * 20000));
                consolaSintetizador();
            } else {
                System.out.println("Está roto, el guante izquierdo no se usa más");
                consolaSintetizador();
            }

        } else {
            System.out.println("Si no andan los guantes o las botas, no podés volar. Necesitas al menos uno de cada uno");
            consolaSintetizador();
        }
    }

    public void gastarEnergiaPropulsar() {
        int minutos;
        if (a.isBotaDerechaOk() && a.isBotaIzquierdaOk()) {
            System.out.println("Cuántos minutos vas a estar propulsandote?");
            minutos = leer.nextInt();
            a.setReactor1(a.getReactor1() - (minutos / 2.5));
            a.setReactor2(a.getReactor2() - ((minutos / 2.5) * 0.2389));
            System.out.println("Te quedan " + a.getReactor1() + " Joules");
            System.out.println("Te quedan " + a.getReactor2() + " Calorías");
            if (a.isBotaDerechaOk()) {
                a.setBateria(a.getBateria() - (minutos * 2500));
                consolaSintetizador();
            } else {
                System.out.println("Está rota, no se usa más la bota derecha");
                consolaSintetizador();
            }
            if (a.isBotaIzquierdaOk()) {
                a.setBateria(a.getBateria() - (minutos * 2500));
                consolaSintetizador();
            } else {
                System.out.println("Está rota, no se usa más la bota izquierda");
                consolaSintetizador();
            }
        } else {
            System.out.println("Necesitas las 2 botas para propulsarte, zuperutano");
            consolaSintetizador();
        }
    }

    public void guantesDisparar() {
        int segundos;
        if (a.isGuanteDerechoOk() || a.isGuanteIzquierdoOk()) {
            System.out.println("Cuántos segundos va a estar disparando?");
            segundos = leer.nextInt();
            a.setReactor1(a.getReactor1() - (segundos / 20));
            a.setReactor2(a.getReactor2() - ((segundos / 20) * 0.2389));
            System.out.println("Te quedan " + a.getReactor1() + " Joules");
            System.out.println("Te quedan " + a.getReactor2() + " Calorías");
            if (a.isGuanteDerechoOk()) {
                a.setBateria(a.getBateria() - (segundos * 100000));
                consolaSintetizador();
            } else {
                System.out.println("Está roto, no se usa más el guante derecho");
                consolaSintetizador();
            }
            if (a.isGuanteIzquierdoOk()) {
                a.setBateria(a.getBateria() - (segundos * 100000));
                consolaSintetizador();
            } else {
                System.out.println("Está roto, no se usa más el guante izquierdo");
                consolaSintetizador();
            }
        }
    }

    public void radar() {
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0, z1 = 0, z2 = 0;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    x2 = (int) (Math.random() * (100 - (-100)) + (-100));
                    Matriz[i][j] = x2;
                }
                if (j == 1) {
                    y2 = (int) (Math.random() * (100 - (-100)) + (-100));
                    Matriz[i][j] = y2;
                }
                if (j == 2) {
                    z2 = (int) (Math.random() * (100 - (-100)) + (-100));
                    Matriz[i][j] = z2;
                }
                if (j == 3) {
                    a.setDistancia((int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2)));
                    Matriz[i][j] = a.getDistancia();
                }
                if (j == 4) {
                    Matriz[i][j] = (int) (Math.random() * 2);
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Objetivo " + (i + 1) + "...");
            for (int j = 0; j < 5; j++) {
                if (j < 4) {
                    System.out.print("[" + Matriz[i][j] + "]");
                }
                if (j == 4) {
                    if (Matriz[i][j] == 0) {
                        System.out.print("Es un forro, matalo!!!");
                    } else {
                        System.out.print("Ayyyyy, es un bambi. Vamos con el bambi");
                    }
                }
            }
            System.out.println(" ");
            a.setBateria(a.getBateria() - 10);
        }
        System.out.println("Te queda " + a.getBateria() + "% de batería");
    }

    public void destruyendoEnemigo() {
        int disparos = 0;

        if ((a.getBateria()) > (999999999 * 0.1)) {
            if (a.isGuanteDerechoOk() && a.isGuanteIzquierdoOk()) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (j == 4) {
                            if (Matriz[i][j] == 0) {
                                if (Matriz[i][j - 1] <= 50) {
                                    System.out.println("Es malo y está cerca. Pegale un corchazo");
                                    a.setBateria(a.getBateria() - 1000);
                                    if (Matriz[i][j - 1] == 50) {
                                        a.getResistencia();
                                        System.out.println("Su resistencia es igual a " + a.getResistencia() + " sigue vivo");
                                        a.setBateria(a.getBateria() - 1000);
                                    }
                                    if (Matriz[i][j - 1] == 40) {
                                        a.getResistencia();
                                        System.out.println("Su resistencia es igual a " + a.getResistencia() + " vivo, pero herido");
                                        a.setBateria(a.getBateria() - 1000);
                                    }
                                    if (Matriz[i][j - 1] == 30) {
                                        a.getResistencia();
                                        System.out.println("Su resistencia es igual a " + a.getResistencia() + " vivo, pero medio hecho pelota");
                                        a.setBateria(a.getBateria() - 1000);
                                    }
                                    if (Matriz[i][j - 1] == 20) {
                                        a.getResistencia();
                                        System.out.println("Su resistencia es igual a " + a.getResistencia() + " vivo, pero hecho percha");
                                        a.setBateria(a.getBateria() - 1000);
                                    }
                                    if (Matriz[i][j - 1] == 10) {
                                        a.getResistencia();
                                        System.out.println("Su resistencia es igual a " + a.getResistencia() + " se murió el muy hdp");
                                        a.setBateria(a.getBateria() - 1000);
                                    }
                                    if (Matriz[i][j - 1] == 0) {
                                        a.getResistencia();
                                        System.out.println("Su resistencia es igual a " + a.getResistencia() + "");
                                        a.setBateria(a.getBateria() - 1000);
                                    }
                                } else {
                                    System.out.println("Está lejos. Se te escapó la tortuga");
                                    a.setBateria(a.getBateria() - 1000);
                                }
                            }
                        }
                    }
                }

            } else if (a.isGuanteDerechoOk() || a.isGuanteIzquierdoOk()) {
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (j == 4) {
                            if (Matriz[i][j] == 0) {
                                if (Matriz[i][j - 1] <= 50) {
                                    System.out.println("Es malo y está cerca. Pegale un corchazo");
                                    a.setBateria(a.getBateria() - 1000);
                                    if (Matriz[i][j - 1] == 50) {
                                        a.getResistencia();
                                        System.out.println("Su resistencia es igual a " + a.getResistencia() + " con un guante apenas le hacés cosquillas");
                                        a.setBateria(a.getBateria() - 1000);
                                    }
                                    if (Matriz[i][j - 1] == 40) {
                                        a.getResistencia();
                                        System.out.println("Su resistencia es igual a " + a.getResistencia() + " con un guante apenas le hacés cosquillas");
                                        a.setBateria(a.getBateria() - 1000);
                                    }
                                    if (Matriz[i][j - 1] == 30) {
                                        a.getResistencia();
                                        System.out.println("Su resistencia es igual a " + a.getResistencia() + " con un guante apenas le hacés cosquillas");
                                        a.setBateria(a.getBateria() - 1000);
                                    }
                                    if (Matriz[i][j - 1] == 20) {
                                        a.getResistencia();
                                        System.out.println("Su resistencia es igual a " + a.getResistencia() + " con un guante apenas le hacés cosquillas");
                                        a.setBateria(a.getBateria() - 1000);
                                    }
                                    if (Matriz[i][j - 1] == 10) {
                                        a.getResistencia();
                                        System.out.println("Su resistencia es igual a " + a.getResistencia() + " con un guante apenas le hacés cosquillas");
                                        a.setBateria(a.getBateria() - 1000);
                                    }
                                    if (Matriz[i][j - 1] == 0) {
                                        a.getResistencia();
                                        System.out.println("Su resistencia es igual a " + a.getResistencia() + "");
                                        a.setBateria(a.getBateria() - 1000);
                                    }
                                } else {
                                    System.out.println("Está lejos. Se te escapó la tortuga");
                                    a.setBateria(a.getBateria() - 1000);
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("Tenés rotos los guantes");
                a.setBateria(a.getBateria() - 1000);
            }
        } else {
            accionEvasiva();
        }

    }

    public void accionEvasiva() {

    }
}
