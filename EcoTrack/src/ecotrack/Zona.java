package ecotrack;
import java.io.Serializable;

public class Zona implements Serializable {
    private String id;
    private String nombre;
    private double procesadoKg; // P_recolectado
    private double pendienteKg; // P_pendiente

    public Zona(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { 
        return id; 
    }
    public String getNombre() {
        return nombre;
    }
    public double getProcesadoKg() {
        return procesadoKg; 
    }
    public double getPendienteKg() {
        return pendienteKg; 
    }

    public void addProcesado(double kg) {
        this.procesadoKg += kg;
    }
    public void addPendiente(double kg) { 
        this.pendienteKg += kg; 
    }
    
    public double utilidadAmbiental() {
        return procesadoKg - pendienteKg;
    }
}
