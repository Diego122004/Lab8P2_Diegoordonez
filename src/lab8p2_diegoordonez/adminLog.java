/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegoordonez;

import java.util.ArrayList;
import javax.swing.*;

public class adminLog extends Thread {

    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private JTextField lognom;

    private ArrayList<Jugador> players = new ArrayList();

    public adminLog() {
        this.barra = barra;
        avanzar = true;
        vive = true;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public ArrayList<Jugador> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Jugador> players) {
        this.players = players;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
               
                for (Jugador player : players) {
                   int pos = players.size();
                   int pos2 = players.indexOf(player);
                    barra.setMaximum(pos2);
                    barra.setMinimum(0);
                    barra.setValue(0);
                    for (int i = 0; i < pos2; i++) {
                        barra.setValue(i);
                    }
                    if (barra.getValue() == pos2) {
                        vive = false;
                    }
                }
            } //FIN IF

            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }

}
