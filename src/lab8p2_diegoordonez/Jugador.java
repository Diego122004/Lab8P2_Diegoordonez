/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_diegoordonez;


import java.util.Date;


public class Jugador {
    
    private String nombre;
    private String correo;
    private String pais;
    private Date fechan;
    private String contra;
    private int saldo = 150000;

    public Jugador() {
    }

    public Jugador(String nombre, String correo, String pais, Date fechan, String contra) {
        this.nombre = nombre;
        this.correo = correo;
        this.pais = pais;
        this.fechan = fechan;
        this.contra = contra;
      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFechan() {
        return fechan;
    }

    public void setFechan(Date fechan) {
        this.fechan = fechan;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", correo=" + correo + ", pais=" + pais + ", fechan=" + fechan + ", contra=" + contra + ", saldo=" + saldo + '}';
    }
    
    
    
}