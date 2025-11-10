package ecotrack;

public class Nodo {
    public Residuo dato;
    public Nodo siguiente;
    public Nodo anterior;

    public Nodo(Residuo dato) {
        this.dato = dato;
        this.siguiente = this; 
        this.anterior = this;
    }
}