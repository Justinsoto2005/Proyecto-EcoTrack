package ecotrack;

public class Residuo {
    private String id;
    private String nombre;
    private String tipo;
    private double peso;
    private String fechaRecoleccion;
    private String zona;
    private int prioridadAmbiental;

    public Residuo(String id, String nombre, String tipo, double peso, String fechaRecoleccion, String zona, int prioridadAmbiental) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.fechaRecoleccion = fechaRecoleccion;
        this.zona = zona;
        this.prioridadAmbiental = prioridadAmbiental;
    }

    public String getId(){
        return id; 
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getTipo() { 
        return tipo; 
    }
    
    public double getPeso() { 
        return peso;
    }

    public String getFechaRecoleccion() { 
        return fechaRecoleccion; 
    }
    
    public String getZona() { 
        return zona;
    }
    
    public int getPrioridadAmbiental() {
        return prioridadAmbiental;
    } 
}