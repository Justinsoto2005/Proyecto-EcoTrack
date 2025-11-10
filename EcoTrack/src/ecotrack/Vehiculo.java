/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecotrack;

/**
 *
 * @author Kev
 */
public class Vehiculo {

    private String placa;
    private String zonaAsignada;
    private double prioridadCalculada;

    public Vehiculo(String placa, String zonaAsignada, double prioridadCalculada) {
        this.placa = placa;
        this.zonaAsignada = zonaAsignada;
        this.prioridadCalculada = prioridadCalculada;
    }

    public String getPlaca() {
        return placa;
    }

    public String getZonaAsignada() {
        return zonaAsignada;
    }

    public double getPrioridadCalculada() {
        return prioridadCalculada;
    }

    @Override
    public String toString(){
        return "Vehiculo [Placa: " + placa + ",Zona: " + zonaAsignada + ", Prioridad: " + prioridadCalculada + "]";
    }
}
